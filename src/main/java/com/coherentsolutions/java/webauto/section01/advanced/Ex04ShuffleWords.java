package com.coherentsolutions.java.webauto.section01.advanced;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ex04ShuffleWords {
    public static void main(String[] args) {
        String text = "To be or not to be, that is the question (c)";
        System.out.println("Shuffled words: " + Arrays.toString(shuffleWords(text)));
    }

    /**
     * Returns an array of the individual words of the string in shuffled order.
     * @param str the string to process
     * @return an array of shuffled words
     */
    public static String[] shuffleWords(String str) {
        String[] words = str.split(" ");
        List<String> wordList = Arrays.asList(words);
        Collections.shuffle(wordList);
        return wordList.toArray(new String[0]);
    }
}
