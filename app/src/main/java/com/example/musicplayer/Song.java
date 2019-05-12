package com.example.musicplayer;

public class Song {
    private String mTitle;
    private int mSeconds;
    private int mArtistId;
    private int mAlbumId;
    private int mId;

    public Song(int mId, String mTitle, int mSeconds, int mArtistId, int mAlbumId) {
        this.mTitle = mTitle;
        this.mSeconds = mSeconds;
        this.mArtistId = mArtistId;
        this.mAlbumId = mAlbumId;
        this.mId = mId;
    }

    public String getTitle() {
        return mTitle;
    }
    public String getSubtitle() {
        String albumName = getAlbumName();
        String artistName = getArtistName();
        return albumName + " . " + artistName;
    }

    public String getAlbumName() {
        return Data.albums.get(mAlbumId).getmName();
    }

    public String getArtistName() {
        return Data.artists.get(mArtistId).getmName();
    }

    public String getTime() {
        int min = (int) Math.floor((double) mSeconds/60);
        int sec = (int) mSeconds % 60;
        return min + ":" + sec;
    }

    public int getmSeconds() {
        return mSeconds;
    }

    public int getmId() {
        return mId;
    }
}
