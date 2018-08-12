package com.example.android.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        // Find the playerButton
        Button playerButton = findViewById(R.id.playerButton);
        // Set an onClickListener onto that button
        playerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Start the PlaylistsActivity once the button is pressed
                Intent intent = new Intent(SettingsActivity.this, PlayerActivity.class);
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
                Intent intent = new Intent(SettingsActivity.this, PlaylistsActivity.class);
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
                Intent intent = new Intent(SettingsActivity.this, AlbumsActivity.class);
                startActivity(intent);
            }
        });
    }
}
