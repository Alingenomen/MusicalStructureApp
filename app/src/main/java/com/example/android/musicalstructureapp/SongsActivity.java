package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class SongsActivity extends AppCompatActivity {

    private TextView textviewPlayer, textviewAlbums, textviewPlaylists, textviewSettings;

    private ArrayList<clsSong> fullSongList;
    private ArrayList<clsPlaylist> playLists;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);

        fullSongList =  (ArrayList<clsSong>) getIntent().getSerializableExtra("fullSongList");
        playLists = (ArrayList<clsPlaylist>) getIntent().getSerializableExtra("playlists");

        initialiseViews();
        initialiseOnClickListeners();

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
                playlistsIntent.putExtra("playlists", playLists);
                playlistsIntent.putExtra("fullSongList", fullSongList);
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
                settingsIntent.putExtra("playlists", playLists);
                settingsIntent.putExtra("fullSongList", fullSongList);
                // Start the new activity
                startActivity(settingsIntent);
            }
        });

    }

    private void initialiseArrayAdapter(){

        // Create an ArrayAdapter, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single TextView, which the adapter will set to
        // display a single word.
        SongAdapter itemsAdapter = new SongAdapter(this, fullSongList);

        // Find the ListView object in the view hierarchy of the Activity.
        // There should be a ListView with the view ID called list, which is declared in the
        // words_listayout file.
        ListView listView = (ListView) findViewById(R.id.allSongsListView);

        // Make the ListView use the ArrayAdapter we created above, so that the
        // ListView will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the ListView object and pass in
        // 1 argument, which is the ArrayAdapter with the variable name itemsAdapter.
        listView.setAdapter(itemsAdapter);
    }
}
