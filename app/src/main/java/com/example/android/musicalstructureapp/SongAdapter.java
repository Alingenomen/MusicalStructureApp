package com.example.android.musicalstructureapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by DTPAdmin on 7/03/2018.
 */

public class SongAdapter extends ArrayAdapter<Song> {

    public SongAdapter(Activity context, ArrayList<Song> Songs) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, Songs);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.song_listitem, parent, false);
        }

        // Get the Word object located at this position in the list
        Song currentSong = getItem(position);

        // Find the TextViews in the song_listitem.xml layout with their IDs
        // Get the information from the current song object and
        // set this text on its TextView

        ImageView songAlbumArtImageView = listItemView.findViewById(R.id.albumArtListItem);
        songAlbumArtImageView.setImageResource(currentSong.getAlbumart());

        TextView songArtistTextView = (TextView) listItemView.findViewById(R.id.songArtistListItem);
        songArtistTextView.setText(currentSong.getArtist());

        TextView songAlbumTextView = (TextView) listItemView.findViewById(R.id.songAlbumListItem);
        songAlbumTextView.setText(currentSong.getAlbum());

        TextView songTitleTextView = (TextView) listItemView.findViewById(R.id.songTitleListItem);
        songTitleTextView.setText(currentSong.getTitle());

        // Return the whole list item layout
        // so that it can be shown in the ListView
        return listItemView;
    }
}
