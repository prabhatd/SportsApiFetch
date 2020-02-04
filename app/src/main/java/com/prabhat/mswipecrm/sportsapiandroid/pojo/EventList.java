package com.prabhat.mswipecrm.sportsapiandroid.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class EventList implements Serializable {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("objectID")
    @Expose
    private Object objectID;
    @SerializedName("eventId")
    @Expose
    private String eventId;
    @SerializedName("eventName")
    @Expose
    private String eventName;
    @SerializedName("eventDesc")
    @Expose
    private String eventDesc;
    @SerializedName("address")
    @Expose
    private Address address;
    @SerializedName("createdDate")
    @Expose
    private Integer createdDate;
    @SerializedName("lastUpdatedDate")
    @Expose
    private Integer lastUpdatedDate;
    @SerializedName("tournamentFormat")
    @Expose
    private String tournamentFormat;
    @SerializedName("adminComment")
    @Expose
    private String adminComment;
    @SerializedName("tnc")
    @Expose
    private String tnc;
    @SerializedName("rules")
    @Expose
    private String rules;
    @SerializedName("startTime")
    @Expose
    private String startTime;
    @SerializedName("endTime")
    @Expose
    private String endTime;
    @SerializedName("fromDate")
    @Expose
    private Integer fromDate;
    @SerializedName("toDate")
    @Expose
    private Integer toDate;
    @SerializedName("oneDayEvent")
    @Expose
    private Boolean oneDayEvent;
    @SerializedName("rentalKitAvlbl")
    @Expose
    private Boolean rentalKitAvlbl;
    @SerializedName("rentalKitDetails")
    @Expose
    private String rentalKitDetails;
    @SerializedName("charges")
    @Expose
    private Integer charges;
    @SerializedName("ageLimit")
    @Expose
    private String ageLimit;
    @SerializedName("facilities")
    @Expose
    private List<String> facilities = null;
    @SerializedName("serviceConsumers")
    @Expose
    private Object serviceConsumers;
    @SerializedName("eventCategoryDetails")
    @Expose
    private EventCategoryDetails eventCategoryDetails;
    @SerializedName("serviceProvider")
    @Expose
    private ServiceProvider serviceProvider;
    @SerializedName("textScore")
    @Expose
    private Object textScore;
    @SerializedName("active")
    @Expose
    private Boolean active;
    @SerializedName("tournament")
    @Expose
    private Boolean tournament;
    @SerializedName("approved")
    @Expose
    private Boolean approved;
    private final static long serialVersionUID = 2806637882812397643L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Object getObjectID() {
        return objectID;
    }

    public void setObjectID(Object objectID) {
        this.objectID = objectID;
    }

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventDesc() {
        return eventDesc;
    }

    public void setEventDesc(String eventDesc) {
        this.eventDesc = eventDesc;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Integer getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Integer createdDate) {
        this.createdDate = createdDate;
    }

    public Integer getLastUpdatedDate() {
        return lastUpdatedDate;
    }

    public void setLastUpdatedDate(Integer lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }

    public String getTournamentFormat() {
        return tournamentFormat;
    }

    public void setTournamentFormat(String tournamentFormat) {
        this.tournamentFormat = tournamentFormat;
    }

    public String getAdminComment() {
        return adminComment;
    }

    public void setAdminComment(String adminComment) {
        this.adminComment = adminComment;
    }

    public String getTnc() {
        return tnc;
    }

    public void setTnc(String tnc) {
        this.tnc = tnc;
    }

    public String getRules() {
        return rules;
    }

    public void setRules(String rules) {
        this.rules = rules;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public Integer getFromDate() {
        return fromDate;
    }

    public void setFromDate(Integer fromDate) {
        this.fromDate = fromDate;
    }

    public Integer getToDate() {
        return toDate;
    }

    public void setToDate(Integer toDate) {
        this.toDate = toDate;
    }

    public Boolean getOneDayEvent() {
        return oneDayEvent;
    }

    public void setOneDayEvent(Boolean oneDayEvent) {
        this.oneDayEvent = oneDayEvent;
    }

    public Boolean getRentalKitAvlbl() {
        return rentalKitAvlbl;
    }

    public void setRentalKitAvlbl(Boolean rentalKitAvlbl) {
        this.rentalKitAvlbl = rentalKitAvlbl;
    }

    public String getRentalKitDetails() {
        return rentalKitDetails;
    }

    public void setRentalKitDetails(String rentalKitDetails) {
        this.rentalKitDetails = rentalKitDetails;
    }

    public Integer getCharges() {
        return charges;
    }

    public void setCharges(Integer charges) {
        this.charges = charges;
    }

    public String getAgeLimit() {
        return ageLimit;
    }

    public void setAgeLimit(String ageLimit) {
        this.ageLimit = ageLimit;
    }

    public List<String> getFacilities() {
        return facilities;
    }

    public void setFacilities(List<String> facilities) {
        this.facilities = facilities;
    }

    public Object getServiceConsumers() {
        return serviceConsumers;
    }

    public void setServiceConsumers(Object serviceConsumers) {
        this.serviceConsumers = serviceConsumers;
    }

    public EventCategoryDetails getEventCategoryDetails() {
        return eventCategoryDetails;
    }

    public void setEventCategoryDetails(EventCategoryDetails eventCategoryDetails) {
        this.eventCategoryDetails = eventCategoryDetails;
    }

    public ServiceProvider getServiceProvider() {
        return serviceProvider;
    }

    public void setServiceProvider(ServiceProvider serviceProvider) {
        this.serviceProvider = serviceProvider;
    }

    public Object getTextScore() {
        return textScore;
    }

    public void setTextScore(Object textScore) {
        this.textScore = textScore;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Boolean getTournament() {
        return tournament;
    }

    public void setTournament(Boolean tournament) {
        this.tournament = tournament;
    }

    public Boolean getApproved() {
        return approved;
    }

    public void setApproved(Boolean approved) {
        this.approved = approved;
    }
}
