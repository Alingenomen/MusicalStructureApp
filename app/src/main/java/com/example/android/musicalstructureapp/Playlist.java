package com.example.android.musicalstructureapp;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by DTPAdmin on 5/03/2018.
 */

public class Playlist implements Serializable {

    private String strName;
    private ArrayList<Song> songlist = new ArrayList<>();

    public Playlist(String name, ArrayList<Song> listSongs){
        strName = name;
        songlist = listSongs;
    }

    public String getName(){
        return strName;
    }

    public ArrayList<Song> getSonglist(){
        return songlist;
    }
}
