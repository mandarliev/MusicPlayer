package com.example.android.musicplayer;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class SetAdapter extends ArrayAdapter<Set>{

    public SetAdapter(Activity context, ArrayList<Set> sets){
        super(context, 0, sets);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        // Get the object located at this position in the list
        Set currentSet = getItem(position);

        // Find the TextView in the list_item with the ID
        TextView artistNameTextView = listItemView.findViewById(R.id.artistName);

        // Set the text
        artistNameTextView.setText(currentSet.getArtistName());

        // Find the TextView
        TextView songNameTextView = listItemView.findViewById(R.id.songName);

        // Set the text
        songNameTextView.setText(currentSet.getSongName());

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
