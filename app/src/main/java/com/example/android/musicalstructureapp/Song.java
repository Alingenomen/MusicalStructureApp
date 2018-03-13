package com.example.android.musicalstructureapp;

import java.io.Serializable;

/**
 * Created by DTPAdmin on 5/03/2018.
 */

public class Song implements Serializable{
    private String strTitle;
    private String strArtist;
    private String strAlbum;
    private int albumArtID;

    public Song(String title, String artist, String album, int idAlbumArt){
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
