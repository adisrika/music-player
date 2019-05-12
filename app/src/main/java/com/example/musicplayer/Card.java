package com.example.musicplayer;

public class Card {
    private String mTitle;
    private String mSubTitle;
    private String mImgUrl;
    private String mType;
    private int mId;

    public Card(String mTitle, String mSubTitle, String mImgUrl, String mType, int mId) {
        this.mTitle = mTitle;
        this.mSubTitle = mSubTitle;
        this.mImgUrl = mImgUrl;
        this.mType = mType;
        this.mId = mId;
    }

    public String getmTitle() {
        return mTitle;
    }

    public String getmSubTitle() {
        return mSubTitle;
    }

    public String getmType() {
        return mType;
    }

    public int getmId() {
        return mId;
    }
}
