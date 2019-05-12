package com.example.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

public class AlbumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);
        Bundle bundle = getIntent().getExtras();
        int artistId = bundle.getInt("ID");
        Album album = Data.albums.get(artistId);
        LayoutInflater inflater = getLayoutInflater();
        View albumHeader = inflater.inflate(R.layout.album_header,
                null);
        TextView text = (TextView) albumHeader.findViewById(R.id.name);
        text.setText(album.getmName());
        TextView info = (TextView) albumHeader.findViewById(R.id.info);
        int numberOfSongs = album.getNumberOfSongs();
        int numberOfMinutes = (int) album.getTotalTimeInMin();
        String subtitle = getString(R.string.album_subtitle, numberOfSongs, numberOfMinutes);
        info.setText(subtitle);

        ArraySongAdapter itemsAdapter = new ArraySongAdapter(this, album.getSongs(), "Album");

        ListView listView = (ListView) findViewById(R.id.list);
        listView.addHeaderView(albumHeader);
        listView.setAdapter(itemsAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Song song = (Song) parent.getItemAtPosition(position);
                Intent songIntent = new Intent(AlbumActivity.this, SongActivity.class);
                songIntent.putExtra("ID", song.getmId());

                // Start the new activity
                startActivity(songIntent);
            }
        });
    }
}
