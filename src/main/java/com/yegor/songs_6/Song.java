package com.yegor.songs_6;

/**
 * This class represents Song object.
 * Created by YegorKost on 01.02.2017.
 */
public class Song {
    private String song;
    private String artist;
    private int rating;

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int raiting) {
        this.rating = raiting;
    }

}
