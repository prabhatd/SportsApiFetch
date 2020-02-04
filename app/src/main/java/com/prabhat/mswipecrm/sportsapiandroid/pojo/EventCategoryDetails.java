package com.prabhat.mswipecrm.sportsapiandroid.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class EventCategoryDetails implements Serializable {

    @SerializedName("category")
    @Expose
    private String category;
    @SerializedName("activityType")
    @Expose
    private Object activityType;
    @SerializedName("activityName")
    @Expose
    private String activityName;
    private final static long serialVersionUID = 6110599496188129040L;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Object getActivityType() {
        return activityType;
    }

    public void setActivityType(Object activityType) {
        this.activityType = activityType;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

}
