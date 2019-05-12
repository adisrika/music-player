package com.example.musicplayer;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class ArraySongAdapter extends ArrayAdapter<Song> {
    private String type;
    public ArraySongAdapter(@NonNull Context context, @NonNull List<Song> objects, String type) {
        super(context, 0, objects);
        this.type = type;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.song_item, parent, false);
        }

        // Get the {@link Song} object located at this position in the list
        Song currentSong = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID name
        TextView nameView = (TextView) listItemView.findViewById(R.id.name);
        // Get the title from the current Song object and
        // set this text on the name TextView
        nameView.setText(currentSong.getTitle());

        // Find the TextView in the list_item.xml layout with the ID time
        TextView timeView = (TextView) listItemView.findViewById(R.id.time);
        // Get the time from the current Song object and
        // set this text on the number TextView
        timeView.setText(currentSong.getTime());

        TextView subTitleView = (TextView) listItemView.findViewById(R.id.sub_title);
        if (this.type.equals("Artist")) {
            subTitleView.setText(currentSong.getAlbumName());
        } else if (this.type.equals("Album")) {
            subTitleView.setText(currentSong.getArtistName());
        }

        return listItemView;
    }
}
