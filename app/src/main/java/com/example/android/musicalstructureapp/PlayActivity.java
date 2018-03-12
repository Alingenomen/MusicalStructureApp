package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class PlayActivity extends AppCompatActivity {

    private TextView textviewPlayer, textviewAlbums, textviewPlaylists, textviewSettings;
    private ArrayList<clsSong> songListAll = new ArrayList<>();
    private ArrayList<clsSong> songListMouvemantMondiale2011 = new ArrayList<>();
    private ArrayList<clsSong> songListIrieRevoltes2015 = new ArrayList<>();

    private ArrayList<clsPlaylist> playlists = new ArrayList<>();
    private clsPlaylist playlist;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

        // Create the objects to work with in this app
        initialiseObjects();

        // Initialise all the views
        initialiseViews();

        // Initialise all the onClickListeners
        initialiseOnclicklisteners();
    }

    private void initialiseViews(){
        textviewAlbums = findViewById(R.id.textviewAlbumsPA);
        textviewPlayer = findViewById(R.id.textviewPlayerPA);
        textviewPlaylists = findViewById(R.id.textviewPlaylistsPA);
        textviewSettings = findViewById(R.id.textviewSettingsPA);
    }

    private void initialiseOnclicklisteners(){
        // Set a click listener on the textviewAlbums
        textviewAlbums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent to open the SongsActivity
                Intent songsIntent = new Intent(PlayActivity.this, SongsActivity.class);
                songsIntent.putExtra("playlists", playlists);
                songsIntent.putExtra("fullSongList", songListAll);
                // Start the new activity
                startActivity(songsIntent);
                finish();
            }
        });

        // Set a click listener on the textviewPlaylists
        textviewPlaylists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent to open the PlaylistActivity
                Intent playlistsIntent = new Intent(PlayActivity.this, PlaylistActivity.class);
                playlistsIntent.putExtra("playlists", playlists);
                playlistsIntent.putExtra("fullSongList", songListAll);
                // Start the new activity
                startActivity(playlistsIntent);
                finish();
            }
        });

        // Set a click listener on the textviewSettings
        textviewSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent to open the PlaylistActivity
                Intent settingsIntent = new Intent(PlayActivity.this, SettingsActivity.class);
                settingsIntent.putExtra("playlists", playlists);
                settingsIntent.putExtra("fullSongList", songListAll);
                // Start the new activity
                startActivity(settingsIntent);
                finish();
            }
        });
    }

    private void initialiseObjects(){

        clsSong songToAdd;

        // Irie revoltes - Irie revoltes (2015)
        songToAdd = new clsSong("01 - Rühe vor dem sturm", "Irie Revoltes", "Irie revoltes (2015)",R.drawable.irie_revoltes_irie_revoltes);
        songListAll.add(songToAdd);
        songListIrieRevoltes2015.add(songToAdd);
        songToAdd = new clsSong("02 - Stopper", "Irie Revoltes", "Irie revoltes (2015)",R.drawable.irie_revoltes_irie_revoltes);
        songListAll.add(songToAdd);
        songListIrieRevoltes2015.add(songToAdd);
        songToAdd = new clsSong("03 - Jamais", "Irie Revoltes", "Irie revoltes (2015)",R.drawable.irie_revoltes_irie_revoltes);
        songListAll.add(songToAdd);
        songListIrieRevoltes2015.add(songToAdd);
        songToAdd = new clsSong("04 - Squatte", "Irie Revoltes", "Irie revoltes (2015)",R.drawable.irie_revoltes_irie_revoltes);
        songListAll.add(songToAdd);
        songListIrieRevoltes2015.add(songToAdd);
        songToAdd = new clsSong("05 - Zu schnell", "Irie Revoltes", "Irie revoltes (2015)",R.drawable.irie_revoltes_irie_revoltes);
        songListAll.add(songToAdd);
        songListIrieRevoltes2015.add(songToAdd);
        songToAdd = new clsSong("06 - Jetzt ist schluss", "Irie Revoltes", "Irie revoltes (2015)",R.drawable.irie_revoltes_irie_revoltes);
        songListAll.add(songToAdd);
        songListIrieRevoltes2015.add(songToAdd);
        songToAdd = new clsSong("07 - A tout prix", "Irie Revoltes", "Irie revoltes (2015)",R.drawable.irie_revoltes_irie_revoltes);
        songListAll.add(songToAdd);
        songListIrieRevoltes2015.add(songToAdd);
        songToAdd = new clsSong("08 - Peur de la liberté", "Irie Revoltes", "Irie revoltes (2015)",R.drawable.irie_revoltes_irie_revoltes);
        songListAll.add(songToAdd);
        songListIrieRevoltes2015.add(songToAdd);
        songToAdd = new clsSong("09 - Danse", "Irie Revoltes", "Irie revoltes (2015)",R.drawable.irie_revoltes_irie_revoltes);
        songListAll.add(songToAdd);
        songListIrieRevoltes2015.add(songToAdd);
        songToAdd = new clsSong("10 - Jetzt!", "Irie Revoltes", "Irie revoltes (2015)",R.drawable.irie_revoltes_irie_revoltes);
        songListAll.add(songToAdd);
        songListIrieRevoltes2015.add(songToAdd);
        songToAdd = new clsSong("11 - Privatisation", "Irie Revoltes", "Irie revoltes (2015)",R.drawable.irie_revoltes_irie_revoltes);
        songListAll.add(songToAdd);
        songListIrieRevoltes2015.add(songToAdd);
        songToAdd = new clsSong("12 - Fäuse hoch", "Irie Revoltes", "Irie revoltes (2015)",R.drawable.irie_revoltes_irie_revoltes);
        songListAll.add(songToAdd);
        songListIrieRevoltes2015.add(songToAdd);
        songToAdd = new clsSong("13 - Décision", "Irie Revoltes", "Irie revoltes (2015)",R.drawable.irie_revoltes_irie_revoltes);
        songListAll.add(songToAdd);
        songListIrieRevoltes2015.add(songToAdd);
        songToAdd = new clsSong("14 - Alles anders", "Irie Revoltes", "Irie revoltes (2015)",R.drawable.irie_revoltes_irie_revoltes);
        songListAll.add(songToAdd);
        songListIrieRevoltes2015.add(songToAdd);

        playlist = new clsPlaylist("Irie revoltes - Irie revoltes (2015)",songListIrieRevoltes2015);
        playlists.add(playlist);

        // Irie revoltes - Mouvement Mondiale (2011)
        songToAdd = new clsSong("01 - Back again", "Irie revoltes", "Mouvement Mondiale (2011)", R.drawable.irie_revoltes_movement_mondiale);
        songListAll.add(songToAdd);
        songListMouvemantMondiale2011.add(songToAdd);
        songToAdd = new clsSong("02 - Explosion", "Irie revoltes", "Mouvement Mondiale (2011)", R.drawable.irie_revoltes_movement_mondiale);
        songListAll.add(songToAdd);
        songListMouvemantMondiale2011.add(songToAdd);
        songToAdd = new clsSong("03 - Travailler", "Irie revoltes", "Mouvement Mondiale (2011)", R.drawable.irie_revoltes_movement_mondiale);
        songListAll.add(songToAdd);
        songListMouvemantMondiale2011.add(songToAdd);
        songToAdd = new clsSong("04 - Merci", "Irie revoltes", "Mouvement Mondiale (2011)", R.drawable.irie_revoltes_movement_mondiale);
        songListAll.add(songToAdd);
        songListMouvemantMondiale2011.add(songToAdd);
        songToAdd = new clsSong("05 - Aufstehn", "Irie revoltes", "Mouvement Mondiale (2011)", R.drawable.irie_revoltes_movement_mondiale);
        songListAll.add(songToAdd);
        songListMouvemantMondiale2011.add(songToAdd);
        songToAdd = new clsSong("06 - Il est là", "Irie revoltes", "Mouvement Mondiale (2011)", R.drawable.irie_revoltes_movement_mondiale);
        songListAll.add(songToAdd);
        songListMouvemantMondiale2011.add(songToAdd);
        songToAdd = new clsSong("07 - Tes yeux", "Irie revoltes", "Mouvement Mondiale (2011)", R.drawable.irie_revoltes_movement_mondiale);
        songListAll.add(songToAdd);
        songListMouvemantMondiale2011.add(songToAdd);
        songToAdd = new clsSong("08 - Antifaschist", "Irie revoltes", "Mouvement Mondiale (2011)", R.drawable.irie_revoltes_movement_mondiale);
        songListAll.add(songToAdd);
        songListMouvemantMondiale2011.add(songToAdd);
        songToAdd = new clsSong("09 - On en a marre", "Irie revoltes", "Mouvement Mondiale (2011)", R.drawable.irie_revoltes_movement_mondiale);
        songListAll.add(songToAdd);
        songListMouvemantMondiale2011.add(songToAdd);
        songToAdd = new clsSong("10 - Des fois", "Irie revoltes", "Mouvement Mondiale (2011)", R.drawable.irie_revoltes_movement_mondiale);
        songListAll.add(songToAdd);
        songListMouvemantMondiale2011.add(songToAdd);
        songToAdd = new clsSong("11 - Utopie", "Irie revoltes", "Mouvement Mondiale (2011)", R.drawable.irie_revoltes_movement_mondiale);
        songListAll.add(songToAdd);
        songListMouvemantMondiale2011.add(songToAdd);
        songToAdd = new clsSong("12 - Manipubation", "Irie revoltes", "Mouvement Mondiale (2011)", R.drawable.irie_revoltes_movement_mondiale);
        songListAll.add(songToAdd);
        songListMouvemantMondiale2011.add(songToAdd);
        songToAdd = new clsSong("13 - Zeit ist geld", "Irie revoltes", "Mouvement Mondiale (2011)", R.drawable.irie_revoltes_movement_mondiale);
        songListAll.add(songToAdd);
        songListMouvemantMondiale2011.add(songToAdd);
        songToAdd = new clsSong("14 - Motivé", "Irie revoltes", "Mouvement Mondiale (2011)", R.drawable.irie_revoltes_movement_mondiale);
        songListAll.add(songToAdd);
        songListMouvemantMondiale2011.add(songToAdd);
        songToAdd = new clsSong("15 - Poulet", "Irie revoltes", "Mouvement Mondiale (2011)", R.drawable.irie_revoltes_movement_mondiale);
        songListAll.add(songToAdd);
        songListMouvemantMondiale2011.add(songToAdd);
        songToAdd = new clsSong("16 - Outro", "Irie revoltes", "Mouvement Mondiale (2011)", R.drawable.irie_revoltes_movement_mondiale);
        songListAll.add(songToAdd);
        songListMouvemantMondiale2011.add(songToAdd);
        songToAdd = new clsSong("17 - Merci (Radio edit)", "Irie revoltes", "Mouvement Mondiale (2011)", R.drawable.irie_revoltes_movement_mondiale);
        songListAll.add(songToAdd);
        songListMouvemantMondiale2011.add(songToAdd);

        playlist = new clsPlaylist("Irie revoltes - Mouvement Mondiale (2011)",songListMouvemantMondiale2011);
        playlists.add(playlist);

    }

}
