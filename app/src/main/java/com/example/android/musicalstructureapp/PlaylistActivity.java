package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

public class PlaylistActivity extends AppCompatActivity {

    private TextView textviewPlayer, textviewAlbums, textviewPlaylists, textviewSettings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);

        // Initialise all the views
        initialiseViews();

        // Initialise all the onClickListeners
        initialiseOnClickListeners();

        // Initialise the ArrayAdapter
        initialiseArrayAdapter();
    }

    private void initialiseViews(){
        textviewAlbums = findViewById(R.id.textviewAlbumsPLA);
        textviewPlayer = findViewById(R.id.textviewPlayerPLA);
        textviewPlaylists = findViewById(R.id.textviewPlaylistsPLA);
        textviewSettings = findViewById(R.id.textviewSettingsPLA);
    }

    private void initialiseOnClickListeners(){
        // Set a click listener on that View
        textviewPlayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent playerIntent = new Intent(PlaylistActivity.this, PlayActivity.class);
                playerIntent.putExtra("alreadyLoaded",PlayActivity.alreadyLoaded);
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
                Intent SongsIntent = new Intent(PlaylistActivity.this, SongsActivity.class);
                // Start the new activity
                startActivity(SongsIntent);
                finish();
            }
        });

        // Set a click listener on that View
        textviewSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent settingsIntent = new Intent(PlaylistActivity.this, SettingsActivity.class);
                // Start the new activity
                startActivity(settingsIntent);
                finish();
            }
        });
    }

    private void initialiseArrayAdapter(){
        // Create an ArrayAdapter, whose data source is a list of playlists. The
        // adapter knows how to create layouts for each item in the list, using the
        // playlist_listitem.xml layout resource defined in the Android framework.
        // This list item layout contains one TextView, which the adapter will set to
        // display the information.
        PlaylistAdapter itemsAdapter = new PlaylistAdapter(this, PlayActivity.playlists);

        // Find the ListView object in the view hierarchy of the Activity.
        // There should be a ListView with the view ID called allPlaylistsListView, which is declared in the
        // PlaylistActivity layout file.
        ListView listView = (ListView) findViewById(R.id.allPlaylistsListView);

        // Make the ListView use the ArrayAdapter we created above, so that the
        // ListView will display list items for each playlist in the list of playlists.
        // Do this by calling the setAdapter method on the ListView object and pass in
        // 1 argument, which is the ArrayAdapter with the variable name itemsAdapter.
        listView.setAdapter(itemsAdapter);
    }

}
