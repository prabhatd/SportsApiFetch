package com.prabhat.mswipecrm.sportsapiandroid;

import com.prabhat.mswipecrm.sportsapiandroid.pojo.RootData;

import retrofit2.Call;
import retrofit2.http.GET;
import java.util.List;


public interface GetData {
    @GET("/findAllEvents")
    Call<List<RootData>> getAllEventDetails();
}
