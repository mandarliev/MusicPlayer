package com.example.android.musicplayer;

public class Set {

    // Artist name
    private String mArtistName;

    // Name of the song
    private String mSongName;

    public Set(String artistName, String songName){

        mArtistName = artistName;
        mSongName = songName;
    }

    // Return the name of the Artist
    public String getArtistName(){
        return mArtistName;
    }

    // Return the name of the song
    public String getSongName(){
        return  mSongName;
    }
}
