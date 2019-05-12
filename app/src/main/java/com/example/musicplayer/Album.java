package com.example.musicplayer;

import android.content.res.Resources;

import java.util.ArrayList;

public class Album {
    private String mName;
    private String mImgUrl;
    private int[] mSongIds;

    public Album(String mName, String mImgUrl, int[] mSongIds) {
        this.mName = mName;
        this.mImgUrl = mImgUrl;
        this.mSongIds = mSongIds;
    }

    public String getmName() {
        return mName;
    }

    public ArrayList<Song> getSongs() {
        ArrayList<Song> allSongs = Data.songs;
        ArrayList<Song> songs = new ArrayList<>();
        for (int i = 0; i < mSongIds.length; i++) {
            songs.add(allSongs.get(mSongIds[i]));
        }
        return songs;
    }

    public double getTotalTimeInMin() {
        int totalSeconds = 0;
        ArrayList<Song> songs = getSongs();
        for (int i = 0; i < songs.size(); i++) {
            totalSeconds += songs.get(i).getmSeconds();
        }
        return Math.floor(totalSeconds/60);
    }

    public int getNumberOfSongs() {
        return mSongIds.length;
    }
}
