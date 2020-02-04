package com.prabhat.mswipecrm.sportsapiandroid.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class RootData implements Serializable {
    @SerializedName("responseHeader")
    @Expose
    private ResponseHeader responseHeader;
    @SerializedName("eventCount")
    @Expose
    private Integer eventCount;
    @SerializedName("eventList")
    @Expose
    private List<EventList> eventList = null;
    private final static long serialVersionUID = -841666857976506053L;

    public ResponseHeader getResponseHeader() {
        return responseHeader;
    }

    public void setResponseHeader(ResponseHeader responseHeader) {
        this.responseHeader = responseHeader;
    }

    public Integer getEventCount() {
        return eventCount;
    }

    public void setEventCount(Integer eventCount) {
        this.eventCount = eventCount;
    }

    public List<EventList> getEventList() {
        return eventList;
    }

    public void setEventList(List<EventList> eventList) {
        this.eventList = eventList;
    }
}
