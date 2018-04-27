package com.example.android.tourguide;

/**
 * Created by roix on 4/25/18.
 */

public class Landmark {


    private int mName;
    private int mInfo;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    public Landmark(int name, int info, int imageResourceId) {
        mName = name;
        mInfo = info;
        mImageResourceId = imageResourceId;
    }

    public Landmark(int name, int info) {
        mName = name;
        mInfo = info;

    }

    public int getName() {
        return mName;
    }

    public int getInfo() {
        return mInfo;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

}
