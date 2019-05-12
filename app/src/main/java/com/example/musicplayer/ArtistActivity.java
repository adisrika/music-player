package com.example.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

public class ArtistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);
        Bundle bundle = getIntent().getExtras();
        int artistId = bundle.getInt("ID");
        Artist artist = Data.artists.get(artistId);
        LayoutInflater inflater = getLayoutInflater();
        View artistHeader = inflater.inflate(R.layout.artist_header,
                null);
        TextView text = (TextView) artistHeader.findViewById(R.id.name);
        text.setText(artist.getmName());
        TextView count = (TextView) artistHeader.findViewById(R.id.count);
        int subScriberCount = artist.getmSubscriberCount();
        count.setText(getString(R.string.subscribers, subScriberCount));

        ArraySongAdapter itemsAdapter = new ArraySongAdapter(this, artist.getSongs(), "Artist");

        ListView listView = (ListView) findViewById(R.id.list);
        listView.addHeaderView(artistHeader);
        listView.setAdapter(itemsAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Song song = (Song) parent.getItemAtPosition(position);
                Intent songIntent = new Intent(ArtistActivity.this, SongActivity.class);
                songIntent.putExtra("ID", song.getmId());

                // Start the new activity
                startActivity(songIntent);
            }
        });
    }
}
