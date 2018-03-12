package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class PlaylistActivity extends AppCompatActivity {

    private TextView textviewPlayer, textviewAlbums, textviewPlaylists, textviewSettings;
    private ArrayList<clsPlaylist> playlists;
    private ArrayList<clsSong> songListAll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);

        playlists =  (ArrayList<clsPlaylist>) getIntent().getSerializableExtra("playlists");
        songListAll = (ArrayList<clsSong>) getIntent().getSerializableExtra("fullSongList");

        initialiseViews();

        initialiseOnClickListeners();

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
                SongsIntent.putExtra("playlists", playlists);
                SongsIntent.putExtra("fullSongList", songListAll);
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
                settingsIntent.putExtra("playlists", playlists);
                settingsIntent.putExtra("fullSongList", songListAll);
                // Start the new activity
                startActivity(settingsIntent);
                finish();
            }
        });

    }

    private void initialiseArrayAdapter(){

        // Create an ArrayAdapter, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single TextView, which the adapter will set to
        // display a single word.
        PlaylistAdapter itemsAdapter = new PlaylistAdapter(this, playlists);

        // Find the ListView object in the view hierarchy of the Activity.
        // There should be a ListView with the view ID called list, which is declared in the
        // words_listayout file.
        ListView listView = (ListView) findViewById(R.id.allPlaylistsListView);

        // Make the ListView use the ArrayAdapter we created above, so that the
        // ListView will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the ListView object and pass in
        // 1 argument, which is the ArrayAdapter with the variable name itemsAdapter.
        listView.setAdapter(itemsAdapter);
    }

}
