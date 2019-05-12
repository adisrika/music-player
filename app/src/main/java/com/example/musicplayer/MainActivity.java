package com.example.musicplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;
import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Card> songCards = Data.recentlyPlayedSongs;
        ArrayList<Card> artistCards = Data.popularArtists;
        ArrayList<Card> albumCards = Data.popularAlbums;

        ArrayList<Card> cards = new ArrayList<>();
        cards.addAll(songCards);
        cards.addAll(artistCards);
        cards.addAll(albumCards);

        Collections.shuffle(cards);

        ArrayCardAdapter itemsAdapter = new ArrayCardAdapter(this, cards);

        GridView gridView = (GridView) findViewById(R.id.home);

        gridView.setAdapter(itemsAdapter);

    }
}
