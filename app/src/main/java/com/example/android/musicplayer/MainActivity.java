package com.example.android.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

import java.util.Set;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the CardView for the Player
        CardView playerCardView = findViewById(R.id.menuPlayer);
        // Set a clickListener on that View
        playerCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new Intent to open the PlayerActivity
                Intent intent = new Intent(MainActivity.this, PlayerActivity.class);
                startActivity(intent);
            }
        });

        // Find the CardView for the Playlists
        CardView playlistsCardView = findViewById(R.id.menuPlaylists);
        // Set a clickListener on that View
        playlistsCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new Intent to open the PlaylistsActivity
                Intent intent = new Intent(MainActivity.this, PlaylistsActivity.class);
                startActivity(intent);
            }
        });

        // Find the CardView for the Albums
        CardView albumsCardView = findViewById(R.id.menuAlbums);

        // Set a clickListener on that View
        albumsCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new Intent to open the AlbumsActivity
                Intent intent = new Intent(MainActivity.this, AlbumsActivity.class);
                startActivity(intent);
            }
        });

        // Find the CardView for the Settings
        CardView settingsCardView = findViewById(R.id.menuSettings);

        // Set a clickListener on that View
        settingsCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // // Create a new Intent to open the SettingsActivity
                Intent intent = new Intent(MainActivity.this, SettingsActivity.class);
                startActivity(intent);
            }
        });
    }
}
