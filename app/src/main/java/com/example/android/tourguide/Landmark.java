package com.example.android.tourguide;

/**
 * Created by roix on 4/25/18.
 */

public class Landmark {


    private String mName;
    private String mInfo;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    public Landmark(String name, String info, int imageResourceId) {
        mName = name;
        mInfo = info;
        mImageResourceId = imageResourceId;
    }

    public Landmark(String name, String info) {
        mName = name;
        mInfo = info;

    }

    public String getName() {
        return mName;
    }

    public String getInfo() {
        return mInfo;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

}
