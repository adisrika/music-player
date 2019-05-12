package com.example.musicplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class SongActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song);
        Bundle bundle = getIntent().getExtras();
        int songId = bundle.getInt("ID");
        Song song = Data.songs.get(songId);
        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.song_item,
                null);
        TextView name = (TextView) layout.findViewById(R.id.name);
        name.setText(song.getTitle());
        TextView subTitle = (TextView) layout.findViewById(R.id.sub_title);
        subTitle.setText(song.getSubtitle());
        TextView time = (TextView) layout.findViewById(R.id.time);
        time.setText(song.getTime());
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.song);
        linearLayout.addView(layout);
    }
}
