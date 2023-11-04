package com.ginomarin;

import junit.framework.TestCase;

public class WordsServiceTest extends TestCase {

    public void testGetWords_case_1() {
        String text = "cat dog dog car Cat doG sun";
        String expectedResult = "cat2dog3car1sun1";
        WordsService wordsService = new WordsService();
        String actualResult = wordsService.getWords(text);
        assertEquals(expectedResult, actualResult);
    }

    public void testGetWords_case_2() {
        String text = "keys house HOUSE house keys";
        String expectedResult = "keys2house3";
        WordsService wordsService = new WordsService();
        String actualResult = wordsService.getWords(text);
        assertEquals(expectedResult, actualResult);
    }

    public void testGetWords_case_3() {
        String text = "cup te a cup";
        String expectedResult = "cup2te1a1";
        WordsService wordsService = new WordsService();
        String actualResult = wordsService.getWords(text);
        assertEquals(expectedResult, actualResult);
    }

    public void testGetWords_case_4() {
        String text = "houses house housess";
        String expectedResult = "houses1house1housess1";
        WordsService wordsService = new WordsService();
        String actualResult = wordsService.getWords(text);
        assertEquals(expectedResult, actualResult);
    }
}