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
 * Created by DTPAdmin on 12/03/2018.
 */

public class PlaylistAdapter extends ArrayAdapter<clsPlaylist> {
    public PlaylistAdapter(Activity context, ArrayList<clsPlaylist> playlists){
        super(context, 0, playlists);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.playlist_listitem, parent, false);
        }

        // Get the playlist object located at this position in the list
        clsPlaylist currentPlaylist = getItem(position);

        // Find the TextView in the playlist_listitem.xml layout with its ID
        // Get the information from the current playlist object and
        // set this text on its TextView

        TextView playListTitleTextView = (TextView) listItemView.findViewById(R.id.playlistTitleListItem);
        playListTitleTextView.setText(currentPlaylist.getName());

        // Return the whole list item layout (containing 3 TextViews)
        // so that it can be shown in the ListView
        return listItemView;
    }

}


