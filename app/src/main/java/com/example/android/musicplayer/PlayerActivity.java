package com.example.android.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PlayerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);

        // Find the playlistButton
        Button playlistsButton = findViewById(R.id.playlistsButton);
        // Set an onClickListener onto that button
        playlistsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Start the PlaylistsActivity once the button is pressed
                Intent intent = new Intent(PlayerActivity.this, PlaylistsActivity.class);
                startActivity(intent);
            }
        });

        // Find the albumsButton
        Button albumsButton = findViewById(R.id.albumsButton);
        // Set an onClickListener onto that button
        albumsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Start the AlbumsActivity once the button is pressed
                Intent intent = new Intent(PlayerActivity.this, AlbumsActivity.class);
                startActivity(intent);
            }
        });

        // Find the settingsButton
        Button settingsButton = findViewById(R.id.settingsButton);
        // Set an onClickListener onto that button
        settingsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Start the SettingsActivity once the button is pressed
                Intent intent = new Intent(PlayerActivity.this, SettingsActivity.class);
                startActivity(intent);
            }
        });
    }
}
