package com.example.android.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class AlbumsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_albums);

        // Find the playlistButton
        Button playerButton = findViewById(R.id.playerButton);
        // Set an onClickListener onto that button
        playerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Start the PlaylistsActivity once the button is pressed
                Intent intent = new Intent(AlbumsActivity.this, PlayerActivity.class);
                startActivity(intent);
            }
        });

        // Find the playlistButton
        Button playlistsButton = findViewById(R.id.playlistsButton);
        // Set an onClickListener onto that button
        playlistsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Start the PlaylistsActivity once the button is pressed
                Intent intent = new Intent(AlbumsActivity.this, PlaylistsActivity.class);
                startActivity(intent);
            }
        });

        // Find the settingsButton
        Button settingsButton = findViewById(R.id.settingsButton);
        // Set an onClickListener onto that button
        settingsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Start the PlaylistsActivity once the button is pressed
                Intent intent = new Intent(AlbumsActivity.this, SettingsActivity.class);
                startActivity(intent);
            }
        });

        ArrayList<Set> albums = new ArrayList<>();
        albums.add(new Set("Kanye West", "Ye"));
        albums.add(new Set("Travis Scott", "Astroworld"));
        albums.add(new Set("Luciano", "Eiskalt"));
        albums.add(new Set("Azet", "Fast Life"));
        albums.add(new Set("50 Cent", "The Big 10"));
        albums.add(new Set("Chris Brown", "Heartbreak on a Full Moon"));
        albums.add(new Set("Dardan", "Hallo Deutschrap"));

        // Create a SetAdapter whose data source is a list of playlists.
        // The adapter knows to create list items for each item in the list
        SetAdapter adapter = new SetAdapter(this, albums);

        // Find the listView object in the view hierarchy of the Activity.
        // There should a listView with the view ID called list, which is declated in the
        // song_list layout file
        ListView listView = findViewById(R.id.list);

        // Make the listView use the setAdapter we created above, so that the
        // listView will display list items for each Playlist in the list
        listView.setAdapter(adapter);
    }
}
