package com.yegor.songs_5;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * This class contains method that reads data from file and prints sorted list of songs to a console.
 * Created by YegorKost on 01.02.2017.
 */
public class GetSongs {

    /**
     * Method reads data from file and prints sorted list of songs to a console.
     * @param file file with songs
     */
    public void printSortedSongs(File file) {
        List<String> sortSongs = new ArrayList<>();
        if (file.exists()) {
            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))){

                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    sortSongs.add(line);
                }
                sortSongs.sort(null);
                for (String s: sortSongs) {
                    System.out.println(s);
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public static void main(String[] args) {
        GetSongs getSongs = new GetSongs();
        getSongs.printSortedSongs(new File("songs5.txt"));


    }

}
