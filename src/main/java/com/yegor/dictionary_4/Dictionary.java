package com.yegor.dictionary_4;

import java.io.*;

/**
 * This class represents a dictionary of java keywords.
 * Created by YegorKost on 01.02.2017.
 */
public class Dictionary {
    private File dictionary = new File("keyWordDictionary.txt");

    /**
     * This method is looking for java keyword in text file and returns it's meaning.
     * @param keyword java keyword
     * @return meaning of a java keyword
     */
    public String meaningOfKeyWord(String keyword) {
        String result = "";

        try (FileReader fileReader = new FileReader(dictionary);
             BufferedReader bufferedReader = new BufferedReader(fileReader)){

            String[] keyValue;
            while ((result = bufferedReader.readLine()) != null) {
                keyValue = result.split(" : ");
                if (keyValue[0].trim().equals(keyword)){
                    result = keyValue[1];
                    break;
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();
        System.out.println("Enter java keyword (type \"exit\" to finish):");
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))){
            String keyword;
            while ((keyword = bufferedReader.readLine()) != null && !keyword.equals("exit")) {
                System.out.println(keyword + " - " + dictionary.meaningOfKeyWord(keyword));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
