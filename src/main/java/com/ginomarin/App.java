package com.ginomarin;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {
        WordsService wordsService = new WordsService();
        System.out.println("-------------------------------------------");
        System.out.println(wordsService.getWords(loadWords()));
        System.out.println("-------------------------------------------");
    }

    public static String loadWords() throws IOException {
        return new String(Files.readAllBytes(Paths.get("src/main/java/com/ginomarin/words.txt")));
    }
}
