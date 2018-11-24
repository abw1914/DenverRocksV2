package com.android.denverrocksv2.Data;

public class DataModel {

    private String name;
    private String Ranking;
    private String localPick;
    private String description;
    private String eventType;
    private String time;
    private int imageResourceId = NO_IMAGE_AVAILABLE;



    private static final int NO_IMAGE_AVAILABLE = -1;


    //fun fragment is using this constructor
    public DataModel(String name, String ranking, String localPick, String description, String eventType, String time, int imageResourceId) {
        this.name = name;
        Ranking = ranking;
        this.localPick = localPick;
        this.description = description;
        this.eventType = eventType;
        this.time = time;
        this.imageResourceId = imageResourceId;
    }
    //history fragment is using this constructor
    public DataModel(String name, String ranking, String localPick, String description) {
        this.name = name;
        Ranking = ranking;
        this.localPick = localPick;
        this.description = description;
        this.eventType = eventType;
        this.time = time;
        this.imageResourceId = imageResourceId;
    }
    //Resturant fragment is using this constructor
    public DataModel(String name, String ranking, String localPick, String description, int imageResourceId) {
        this.name = name;
        Ranking = ranking;
        this.localPick = localPick;
        this.description = description;
        this.eventType = eventType;
        this.time = time;
        this.imageResourceId = imageResourceId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRanking() {
        return Ranking;
    }

    public void setRanking(String ranking) {
        Ranking = ranking;
    }

    public String getLocalPick() {
        return localPick;
    }

    public void setLocalPick(String localPick) {
        this.localPick = localPick;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public void setImageResourceId(int imageResourceId) {
        this.imageResourceId = imageResourceId;
    }

    public boolean hasImage() {
        return imageResourceId != NO_IMAGE_AVAILABLE;
    }
}
