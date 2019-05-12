package com.example.musicplayer;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class ArrayCardAdapter extends ArrayAdapter<Card> {
    private Context mContext;

    public ArrayCardAdapter(@NonNull Context context, @NonNull List<Card> objects) {
        super(context, 0, objects);
        mContext = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.card, parent, false);
        }

        // Get the {@link Card} object located at this position in the list
        final Card currentCard = getItem(position);
        String type = currentCard.getmType();

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView titleView = (TextView) listItemView.findViewById(R.id.title);
        // Get the title from the current Card object and
        // set this text on the name TextView
        titleView.setText(currentCard.getmTitle());

        // Find the TextView in the list_item.xml layout with the ID sub_title
        TextView subTitleView = (TextView) listItemView.findViewById(R.id.sub_title);
        // Get the sub_title from the current Card object and
        // set this text on the number TextView
        subTitleView.setText(currentCard.getmSubTitle());

        TextView typeView = (TextView) listItemView.findViewById(R.id.type);
        if (type.equals("song")) {
            typeView.setText(mContext.getResources().getString(R.string.recently_played_song));
            listItemView.setOnClickListener(new View.OnClickListener() {
                // The code in this method will be executed when the colors category is clicked on.
                @Override
                public void onClick(View view) {
                    // Create a new intent to open the {@link SongActivity}
                    Intent songIntent = new Intent(mContext, SongActivity.class);
                    songIntent.putExtra("ID", currentCard.getmId());

                    // Start the new activity
                    mContext.startActivity(songIntent);
                }
            });
        } else if(type.equals("artist")) {
            typeView.setText(mContext.getResources().getString(R.string.popular_artist));
            listItemView.setOnClickListener(new View.OnClickListener() {
                // The code in this method will be executed when the colors category is clicked on.
                @Override
                public void onClick(View view) {
                    // Create a new intent to open the {@link ArtistActivity}
                    Intent songIntent = new Intent(mContext, ArtistActivity.class);
                    songIntent.putExtra("ID", currentCard.getmId());

                    // Start the new activity
                    mContext.startActivity(songIntent);
                }
            });
        } else {
            typeView.setText(mContext.getResources().getString(R.string.popular_album));
            listItemView.setOnClickListener(new View.OnClickListener() {
                // The code in this method will be executed when the colors category is clicked on.
                @Override
                public void onClick(View view) {
                    // Create a new intent to open the {@link AlbumActivity}
                    Intent songIntent = new Intent(mContext, AlbumActivity.class);
                    songIntent.putExtra("ID", currentCard.getmId());

                    // Start the new activity
                    mContext.startActivity(songIntent);
                }
            });
        }

        return listItemView;
    }
}