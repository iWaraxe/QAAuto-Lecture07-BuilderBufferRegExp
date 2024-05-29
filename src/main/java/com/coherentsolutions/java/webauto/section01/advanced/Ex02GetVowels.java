package com.coherentsolutions.java.webauto.section01.advanced;

public class Ex02GetVowels {
    public static void main(String[] args) {
        String text = "To be or not to be, that is the question (c)";
        System.out.println("Vowels: " + getVowels(text));
    }

    /**
     * Returns a new string consisting of only the vowels from the given string.
     * @param str the string to process
     * @return a string of vowels
     */
    public static String getVowels(String str) {
        return str.replaceAll("[^AEIOUaeiou]", "");
    }
}
