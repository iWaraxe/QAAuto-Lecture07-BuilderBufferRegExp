package com.coherentsolutions.java.webauto.section01.advanced;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdvancedStringMethods {

    public static void main(String[] args) {
        String text = "To be or not to be, that is the question (c)";

        // find occurrences of a character
        System.out.println("Occurrences of 'o': " + countOccurrences(text, 'o'));

        // get vowels from string
        System.out.println("Vowels: " + getVowels(text));

        // get consonants from string
        System.out.println("Consonants: " + getConsonants(text));

        // shuffle words in string
        System.out.println("Shuffled words: " + Arrays.toString(shuffleWords(text)));

        // get unique characters from string
        System.out.println("Unique characters: " + getUniqueCharacters(text));

        // regular expression example
        findPatternInText("The price is 100 dollars.", "\\d+");
    }

    /**
     * Counts the occurrences of the specified character in the given string.
     * @param str the string to search
     * @param ch the character to count
     * @return the number of occurrences of the character
     */
    public static int countOccurrences(String str, char ch) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == ch) {
                count++;
            }
        }
        return count;
    }

    /**
     * Returns a new string consisting of only the vowels from the given string.
     * @param str the string to process
     * @return a string of vowels
     */
    public static String getVowels(String str) {
        return str.replaceAll("[^AEIOUaeiou]", "");
    }

    /**
     * Returns a new string consisting of only the consonants from the given string.
     * @param str the string to process
     * @return a string of consonants
     */
    public static String getConsonants(String str) {
        return str.replaceAll("[AEIOUaeiou\\W\\d]", "");
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

    /**
     * Returns a string consisting only of the characters that appear exactly once in the given string.
     * If no such characters exist, returns a corresponding informational message.
     * @param str the string to process
     * @return a string of unique characters or an informational message
     */
    public static String getUniqueCharacters(String str) {
        StringBuilder result = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (str.indexOf(c) == str.lastIndexOf(c)) {
                result.append(c);
            }
        }
        return result.length() > 0 ? result.toString() : "No unique characters found.";
    }

    /**
     * Finds and prints the first occurrence of the given pattern in the text.
     * @param text the text to search
     * @param patternStr the regular expression pattern to match
     */
    public static void findPatternInText(String text, String patternStr) {
        Pattern pattern = Pattern.compile(patternStr);
        Matcher matcher = pattern.matcher(text);
        if (matcher.find()) {
            System.out.println("Found pattern: " + matcher.group());
        } else {
            System.out.println("Pattern not found.");
        }
    }
}
