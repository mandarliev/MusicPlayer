package com.example.android.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class PlaylistsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlists);

        // Find the playlistButton
        Button playerButton = findViewById(R.id.playerButton);
        // Set an onClickListener onto that button
        playerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Start the PlaylistsActivity once the button is pressed
                Intent intent = new Intent(PlaylistsActivity.this, PlayerActivity.class);
                startActivity(intent);
            }
        });

        // Find the playlistButton
        Button albumsButton = findViewById(R.id.albumsButton);
        // Set an onClickListener onto that button
        albumsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Start the PlaylistsActivity once the button is pressed
                Intent intent = new Intent(PlaylistsActivity.this, AlbumsActivity.class);
                startActivity(intent);
            }
        });

        Button settingsButton = findViewById(R.id.settingsButton);
        // Set an onClickListener onto that button
        settingsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Start the PlaylistsActivity once the button is pressed
                Intent intent = new Intent(PlaylistsActivity.this, SettingsActivity.class);
                startActivity(intent);
            }
        });

        ArrayList<Set> playlists = new ArrayList<>();
        playlists.add(new Set("Dardan", "Lastly played"));
        playlists.add(new Set("Azet", "Most listened"));
        playlists.add(new Set("Luciano", "Single hits"));
        playlists.add(new Set("50 Cent", "Favorites"));
        playlists.add(new Set("Travis Scott", "Latest hits"));
        playlists.add(new Set("Kanye West", "Best Songs"));
        playlists.add(new Set("Chris Brown", "Collabs"));

        // Create a SetAdapter whose data source is a list of playlists.
        // The adapter knows to create list items for each item in the list
        SetAdapter adapter = new SetAdapter(this, playlists);

        // Find the listView object in the view hierarchy of the Activity.
        // There should a listView with the view ID called list, which is declated in the
        // song_list layout file
        ListView listView = findViewById(R.id.list);

        // Make the listView use the setAdapter we created above, so that the
        // listView will display list items for each Playlist in the list
        listView.setAdapter(adapter);
    }

}
