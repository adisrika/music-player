package com.example.musicplayer;

import java.util.ArrayList;

public class Data {
    /*
    * Cards are merch content created by operations - So title, subtitle might have different content than song/album/artist title/subtitle
     */
    public static ArrayList<Card> recentlyPlayedSongs = new ArrayList<Card>(){
        {
            add(new Card("Title1",
                    "Subtitle1",
                    "https://images.unsplash.com/photo-1525789351284-e1e7de240152?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=800&q=60",
                    "song",
                    1));
            add(new Card("Title1",
                    "Subtitle1",
                    "https://images.unsplash.com/photo-1493225457124-a3eb161ffa5f?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=800&q=60",
                    "song",
                    2));
            add(new Card("Title1",
                    "Subtitle1",
                    "https://images.unsplash.com/photo-1471029093449-ca61fffdc2af?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=800&q=60",
                    "song",
                    3));
            add(new Card("Title1",
                    "Subtitle1",
                    "https://images.unsplash.com/photo-1459305272254-33a7d593a851?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=800&q=60",
                    "song",
                    4));
            add(new Card("Title1",
                    "Subtitle1",
                    "https://images.unsplash.com/photo-1552308643-1dc072dab3e4?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=800&q=60",
                    "song",
                    5));
        }
    };

    public static ArrayList<Card> popularArtists = new ArrayList<Card>(){
        {
            add(new Card("Artist 1",
                    "Subtitle1",
                    "https://images.unsplash.com/photo-1525789351284-e1e7de240152?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=800&q=60",
                    "artist",
                    0));
            add(new Card("Artist 2",
                    "Subtitle1",
                    "https://images.unsplash.com/photo-1493225457124-a3eb161ffa5f?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=800&q=60",
                    "artist",
                    1));
            add(new Card("Artist 3",
                    "Subtitle1",
                    "https://images.unsplash.com/photo-1471029093449-ca61fffdc2af?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=800&q=60",
                    "artist",
                    2));
            add(new Card("Artist 4",
                    "Subtitle1",
                    "https://images.unsplash.com/photo-1459305272254-33a7d593a851?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=800&q=60",
                    "artist",
                    3));
            add(new Card("Artist 5",
                    "Subtitle1",
                    "https://images.unsplash.com/photo-1552308643-1dc072dab3e4?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=800&q=60",
                    "artist",
                    4));
        }
    };

    public static ArrayList<Card> popularAlbums = new ArrayList<Card>(){
        {
            add(new Card("Title1",
                    "Subtitle1",
                    "https://images.unsplash.com/photo-1525789351284-e1e7de240152?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=800&q=60",
                    "album",
                    0));
            add(new Card("Title1",
                    "Subtitle1",
                    "https://images.unsplash.com/photo-1493225457124-a3eb161ffa5f?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=800&q=60",
                    "album",
                    1));
            add(new Card("Title1",
                    "Subtitle1",
                    "https://images.unsplash.com/photo-1471029093449-ca61fffdc2af?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=800&q=60",
                    "album",
                    2));
            add(new Card("Title1",
                    "Subtitle1",
                    "https://images.unsplash.com/photo-1459305272254-33a7d593a851?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=800&q=60",
                    "album",
                    3));
            add(new Card("Title1",
                    "Subtitle1",
                    "https://images.unsplash.com/photo-1552308643-1dc072dab3e4?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=800&q=60",
                    "album",
                    4));
        }
    };

    /*
    * Songs in our app
     */

    public static ArrayList<Song> songs = new ArrayList<Song>(){
        {
            add(new Song(0,"Song 1", 250, 2, 2));
            add(new Song(1,"Song 2", 350, 3, 1));
            add(new Song(2,"Song 3", 200, 1, 3));
            add(new Song(3,"Song 4", 450, 4, 0));
            add(new Song(4,"Song 5", 220, 3, 1));
            add(new Song(5,"Song 6", 450, 2, 2));
            add(new Song(6,"Song 7", 150, 1, 3));
            add(new Song(7,"Song 8", 258, 1, 3));
            add(new Song(8,"Song 9", 189, 2, 2));
            add(new Song(9,"Song 10", 225, 3, 1));
            add(new Song(10,"Song 11", 390, 4, 0));
            add(new Song(11,"Song 12", 412, 4, 0));
            add(new Song(12,"Song 13", 280, 0, 4));
            add(new Song(13,"Song 14", 320, 1, 3));
            add(new Song(14,"Song 15", 420, 0, 4));
            add(new Song(15,"Song 16", 240, 0, 4));
            add(new Song(16,"Song 17", 204, 2, 2));
            add(new Song(17,"Song 18", 402, 2, 2));
            add(new Song(18,"Song 19", 502, 3, 1));
            add(new Song(19,"Song 20", 125, 3, 1));
        }
    };

    /*
    * Artists in our app
     */

    public static ArrayList<Artist> artists = new ArrayList<Artist>() {
        {
            add(new Artist("Artist 1", "", 3000, new int[]{12, 14, 15}));
            add(new Artist("Artist 2", "", 3000, new int[]{2, 6, 7, 13}));
            add(new Artist("Artist 3", "", 3000, new int[]{0, 5, 8, 16, 17}));
            add(new Artist("Artist 4", "", 3000, new int[]{1, 4, 9, 18, 19}));
            add(new Artist("Artist 5", "", 3000, new int[]{3, 10, 11}));
        }
    };

    /*
    * Albums in our app
     */

    public static ArrayList<Album> albums = new ArrayList<Album>() {
        {
            add(new Album("Album 1", "", new int[]{3, 10, 11}));
            add(new Album("Album 2", "", new int[]{1, 4, 9, 18, 19}));
            add(new Album("Album 3", "", new int[]{0, 5, 8, 16, 17}));
            add(new Album("Album 4", "", new int[]{2, 6, 7, 13}));
            add(new Album("Album 5", "", new int[]{12, 14, 15}));
        }
    };
}
