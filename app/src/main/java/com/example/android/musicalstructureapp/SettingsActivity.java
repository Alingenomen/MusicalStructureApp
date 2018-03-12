package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class SettingsActivity extends AppCompatActivity {

    TextView textviewPlayer, textviewAlbums, textviewPlaylists, textviewSettings;

    private ArrayList<clsPlaylist> playlists;
    private ArrayList<clsSong> songListAll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        playlists =  (ArrayList<clsPlaylist>) getIntent().getSerializableExtra("playlists");
        songListAll = (ArrayList<clsSong>) getIntent().getSerializableExtra("fullSongList");

        initialiseViews();
        initialiseOnClickListeners();
    }

    private void initialiseViews(){
        textviewAlbums = findViewById(R.id.textviewAlbumsSE);
        textviewPlayer = findViewById(R.id.textviewPlayerSE);
        textviewPlaylists = findViewById(R.id.textviewPlaylistsSE);
        textviewSettings = findViewById(R.id.textviewSettingsSE);
    }

    private void initialiseOnClickListeners(){
        // Set a click listener on that View
        textviewPlayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent playerIntent = new Intent(SettingsActivity.this, PlayActivity.class);
                // Start the new activity
                startActivity(playerIntent);
                finish();
            }
        });

        // Set a click listener on that View
        textviewAlbums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent songsIntent = new Intent(SettingsActivity.this, SongsActivity.class);
                songsIntent.putExtra("playlists", playlists);
                songsIntent.putExtra("fullSongList", songListAll);
                // Start the new activity
                startActivity(songsIntent);
                finish();
            }
        });

        // Set a click listener on that View
        textviewPlaylists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent playlistIntent = new Intent(SettingsActivity.this, PlaylistActivity.class);
                playlistIntent.putExtra("playlists", playlists);
                playlistIntent.putExtra("fullSongList", songListAll);
                // Start the new activity
                startActivity(playlistIntent);
                finish();
            }
        });

    }
}
