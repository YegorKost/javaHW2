package com.yegor.console;

import java.io.*;

/**
 * This class contains methods to write the text from console to file, and read from one.
 * Created by YegorKost on 31.01.2017.
 */
public class WriteConsoleToFile {

    /**
     * Method writes data from stream {@code Reader} to file.
     * @param in a character-input stream
     * @param file the file to use as the destination for character-output stream
     */
    void writeToFile(Reader in, File file) {
        if (!file.canWrite()){
            System.out.println("The file can not be written!");
        } else {
            try (BufferedReader bufferedReader = new BufferedReader(in);
                 BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))){

                String line;
                System.out.println("Write text to the file (" + file.getName() + ")\n" +
                        "Type \"exit\" in new line to finish");
                while ((line = bufferedReader.readLine()) != null ) {
                    if (!line.equals("exit")){
                        bufferedWriter.write(line);
                        bufferedWriter.newLine();
                    } else {
                        break;
                    }
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    /**
     * Method reads data from file and return string.
     * @param file the file to use as the source for character-input stream
     * @return string that was read from file
     */
    String readFromFile(File file) {
        String result = "";
        if (!file.canRead()){
            System.out.println("The file can not be read!");
        } else {
            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))){

                String line;
                while ((line = bufferedReader.readLine()) != null){
                    result = result.concat(line + "\n");
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return result;
    }

    public static void main(String[] args) {
        WriteConsoleToFile writeConsoleToFile = new WriteConsoleToFile();

        try (BufferedReader bufferedReaderIn = new BufferedReader(new InputStreamReader(System.in))){
            String line;
            System.out.print("Read from file or write to (r/w)?:");
            if ((line = bufferedReaderIn.readLine()) != null && line.equals("w")) {
                System.out.println("Enter file pathname");
                if ((line = bufferedReaderIn.readLine()) != null){
                    File file = new File(line);
                    if (file.createNewFile()) {
                        writeConsoleToFile.writeToFile(bufferedReaderIn, file);
                    }
                }
            } else {
                System.out.println("Enter file pathname");
                if ((line = bufferedReaderIn.readLine()) != null) {
                    File file = new File(line);
                    if (file.exists()) {
                        System.out.println(writeConsoleToFile.readFromFile(file));
                    } else {
                        System.out.println("File was not found");
                    }
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
