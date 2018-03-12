package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

public class SongsActivity extends AppCompatActivity {

    private TextView textviewPlayer, textviewAlbums, textviewPlaylists, textviewSettings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);

        // Initialise all the views
        initialiseViews();

        // Initialise all the onClickListeners
        initialiseOnClickListeners();

        // Initialise the ArrayAdapter
        initialiseArrayAdapter();
    }

    private void initialiseViews(){
        textviewAlbums = findViewById(R.id.textviewAlbumsAL);
        textviewPlayer = findViewById(R.id.textviewPlayerAL);
        textviewPlaylists = findViewById(R.id.textviewPlaylistsAL);
        textviewSettings = findViewById(R.id.textviewSettingsAL);
    }

    private void initialiseOnClickListeners(){
        // Set a click listener on that View
        textviewPlayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent playerIntent = new Intent(SongsActivity.this, PlayActivity.class);
                playerIntent.putExtra("alreadyLoaded",PlayActivity.alreadyLoaded);
                // Start the new activity
                startActivity(playerIntent);
            }
        });

        // Set a click listener on that View
        textviewPlaylists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent playlistsIntent = new Intent(SongsActivity.this, PlaylistActivity.class);
                // Start the new activity
                startActivity(playlistsIntent);
            }
        });

        // Set a click listener on that View
        textviewSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent settingsIntent = new Intent(SongsActivity.this, SettingsActivity.class);
                // Start the new activity
                startActivity(settingsIntent);
            }
        });

    }

    private void initialiseArrayAdapter(){

        // Create an ArrayAdapter, whose data source is a list of Songs. The
        // adapter knows how to create layouts for each item in the list, using the
        // song_listitem.xml layout resource defined in the Android framework.
        // This list item layout contains a TextViews and an Imageview, which the adapter will set to
        // display the information.
        SongAdapter itemsAdapter = new SongAdapter(this, PlayActivity.songListAll);

        // Find the ListView object in the view hierarchy of the Activity.
        // There should be a ListView with the view ID called allSongsListView, which is declared in the
        // SongActivity layout file.
        ListView listView = findViewById(R.id.allSongsListView);

        // Make the ListView use the ArrayAdapter we created above, so that the
        // ListView will display list items for each song in the list of songs.
        // Do this by calling the setAdapter method on the ListView object and pass in
        // 1 argument, which is the ArrayAdapter with the variable name itemsAdapter.
        listView.setAdapter(itemsAdapter);
    }
}
