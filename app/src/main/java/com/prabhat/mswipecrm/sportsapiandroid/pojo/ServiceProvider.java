package com.prabhat.mswipecrm.sportsapiandroid.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class ServiceProvider implements Serializable {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("serviceProviderId")
    @Expose
    private Object serviceProviderId;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("password")
    @Expose
    private String password;
    @SerializedName("role")
    @Expose
    private String role;
    @SerializedName("orgName")
    @Expose
    private String orgName;
    @SerializedName("spoc")
    @Expose
    private String spoc;
    @SerializedName("contact")
    @Expose
    private Object contact;
    @SerializedName("address")
    @Expose
    private Object address;
    @SerializedName("createdDate")
    @Expose
    private Object createdDate;
    @SerializedName("lastUpdatedDate")
    @Expose
    private Object lastUpdatedDate;
    private final static long serialVersionUID = 6768781725311104915L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Object getServiceProviderId() {
        return serviceProviderId;
    }

    public void setServiceProviderId(Object serviceProviderId) {
        this.serviceProviderId = serviceProviderId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getSpoc() {
        return spoc;
    }

    public void setSpoc(String spoc) {
        this.spoc = spoc;
    }

    public Object getContact() {
        return contact;
    }

    public void setContact(Object contact) {
        this.contact = contact;
    }

    public Object getAddress() {
        return address;
    }

    public void setAddress(Object address) {
        this.address = address;
    }

    public Object getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Object createdDate) {
        this.createdDate = createdDate;
    }

    public Object getLastUpdatedDate() {
        return lastUpdatedDate;
    }

    public void setLastUpdatedDate(Object lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }

}
