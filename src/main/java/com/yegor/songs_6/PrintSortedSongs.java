package com.yegor.songs_6;

import java.io.File;

/**
 * This class reads data about songs from file, sorts them and
 * prints to a console.
 * Created by YegorKost on 02.02.2017.
 */
public class PrintSortedSongs {

    public static void main(String[] args) {
        Media media = new Media();
        File file = new File("songs6.txt");
        media.downloadSongsFromFile(file);
        media.printSortSongs(false);
    }

}
