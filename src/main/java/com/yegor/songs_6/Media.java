package com.yegor.songs_6;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * This class contains methods for reading data about songs from file, for sorting them and
 * printing to a console.
 * Created by YegorKost on 01.02.2017.
 */
public class Media {

    private List<Song> songs = new ArrayList<>();

    /**
     * Method sorts songs and prints them to a console.
     * @param sortArtist true if sort songs by artist, otherwise by song title
     */
    public void printSortSongs(boolean sortArtist) {
        if (songs.size() > 0) {
            this.songs.sort(new Comparator<Song>() {
                @Override
                public int compare(Song o1, Song o2) {
                    if (sortArtist){
                        return o1.getArtist().compareTo(o2.getArtist());
                    } else {
                        return o1.getSong().compareTo(o2.getSong());
                    }
                }
            });
            for (Song song: songs) {
                if (sortArtist){
                    System.out.println(song.getArtist()+ " - " + song.getSong() + " - " + song.getRating());
                } else {
                    System.out.println(song.getSong() + " - " + song.getArtist() + " - " + song.getRating());
                }
            }
        } else {
            System.out.println("The songs are not fined");
        }
    }

    /**
     * Method downloads data about songs from file.
     * @param file file that contains data about songs
     */
    public void downloadSongsFromFile(File file) {
        if (file.exists()) {
            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))){

                String line;
                String[] readSong;
                Song song;
                while ((line = bufferedReader.readLine()) != null) {
                    readSong = line.split("/");
                    song = new Song();
                    song.setSong(readSong[0].trim());
                    song.setArtist(readSong[1].trim());
                    song.setRating(Integer.parseInt(readSong[2].trim()));
                    songs.add(song);
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
