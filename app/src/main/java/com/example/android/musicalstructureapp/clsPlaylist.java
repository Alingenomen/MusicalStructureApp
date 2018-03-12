package com.example.android.musicalstructureapp;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by DTPAdmin on 5/03/2018.
 */

public class clsPlaylist implements Serializable {

    private String strName;
    private ArrayList<clsSong> songlist = new ArrayList<>();

    public clsPlaylist(String name, ArrayList<clsSong> listSongs){
        strName = name;
        songlist = listSongs;
    }

    public String getName(){
        return strName;
    }

    public ArrayList<clsSong> getSonglist(){
        return songlist;
    }
}
