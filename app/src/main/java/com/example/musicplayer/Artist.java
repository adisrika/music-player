package com.example.musicplayer;

import java.util.ArrayList;

public class Artist {
    private String mName;
    private String mImgUrl;
    private int mSubscriberCount;
    private int[] mSongIds;

    public Artist(String mName, String mImgUrl, int mSubscriberCount, int[] mSongIds) {
        this.mName = mName;
        this.mImgUrl = mImgUrl;
        this.mSubscriberCount = mSubscriberCount;
        this.mSongIds = mSongIds;
    }

    public String getmName() {
        return mName;
    }

    public int getmSubscriberCount() {
        return mSubscriberCount;
    }

    public ArrayList<Song> getSongs() {
        ArrayList<Song> allSongs = Data.songs;
        ArrayList<Song> songs = new ArrayList<>();
        for (int i = 0; i < mSongIds.length; i++) {
            songs.add(allSongs.get(mSongIds[i]));
        }
        return songs;
    }
}
