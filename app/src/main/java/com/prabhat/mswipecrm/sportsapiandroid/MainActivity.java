package com.prabhat.mswipecrm.sportsapiandroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import android.os.Bundle;

import com.prabhat.mswipecrm.sportsapiandroid.pojo.RootData;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private MyAdapter myAdapter;
    private RecyclerView myRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GetData service = RetrofitClient.getRetrofitInstance().create(GetData.class);

        Call<List<RootData>> users= service.getAllEventDetails();

        users.enqueue(new Callback<List<RootData>>() {
            @Override
            public void onResponse(Call<List<RootData>> call, Response<List<RootData>> response) {
                loadDataList(response.body());
            }

            @Override
            public void onFailure(Call<List<RootData>> call, Throwable t) {

            }
        });

    }
    //Display the retrieved data as a list//

    private void loadDataList(List<RootData> usersList) {

//Get a reference to the RecyclerView//

        myRecyclerView = findViewById(R.id.myRecyclerView);
        myAdapter = new MyAdapter(usersList);

//Use a LinearLayoutManager with default vertical orientation//

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        myRecyclerView.setLayoutManager(layoutManager);

//Set the Adapter to the RecyclerView//

        myRecyclerView.setAdapter(myAdapter);
    }
}
