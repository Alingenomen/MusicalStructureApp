package com.example.android.musicalstructureapp;

import android.graphics.Movie;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.DrawableRes;

import java.io.Serializable;
import java.util.Optional;

/**
 * Created by DTPAdmin on 5/03/2018.
 */

// public Movie(Parcel in) {
//       title = in.readString();
//      overview = in.readString();
//    release_date = in.readString();
//    id = in.readInt();
//   original_language = in.readString();
//  }

public class clsSong implements Serializable{


    private String strTitle;
    private String strArtist;
    private String strAlbum;
    private int albumArtID;

    public clsSong(String title, String artist, String album, int idAlbumArt){
        strTitle = title;
        strArtist = artist;
        strAlbum = album;
        albumArtID = idAlbumArt;
    }

    public String getTitle(){
        return strTitle;
    }

    public String getArtist(){
        return strArtist;
    }

    public String getAlbum() {
        return strAlbum;
    }

    public int getAlbumart(){
        return albumArtID;
    }

}
