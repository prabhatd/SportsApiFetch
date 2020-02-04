package com.prabhat.mswipecrm.sportsapiandroid.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class ResponseHeader implements Serializable {

    @SerializedName("responseStatus")
    @Expose
    private String responseStatus;
    @SerializedName("statusCode")
    @Expose
    private String statusCode;
    @SerializedName("decription")
    @Expose
    private String decription;
    @SerializedName("error")
    @Expose
    private Object error;
    @SerializedName("errorCode")
    @Expose
    private Object errorCode;
    private final static long serialVersionUID = -3911720816118231548L;

    public String getResponseStatus() {
        return responseStatus;
    }

    public void setResponseStatus(String responseStatus) {
        this.responseStatus = responseStatus;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public String getDecription() {
        return decription;
    }

    public void setDecription(String decription) {
        this.decription = decription;
    }

    public Object getError() {
        return error;
    }

    public void setError(Object error) {
        this.error = error;
    }

    public Object getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Object errorCode) {
        this.errorCode = errorCode;
    }
}
