package com.example.kkb.musicbum;

/**
 * Created by Kbhansali on 12/30/2014.
 */
public class Song {
    //parameters - more could be added as needed
    private long id;
    private String title;
    private String artist;

    public Song(long songID, String songTitle, String songArtist) {
        id=songID;
        title=songTitle;
        artist=songArtist;
    }

    public long getID(){return id;}
    public String getTitle(){return title;}
    public String getArtist(){return artist;}






}
