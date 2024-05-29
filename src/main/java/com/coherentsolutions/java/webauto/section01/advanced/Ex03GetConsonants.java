package com.coherentsolutions.java.webauto.section01.advanced;

public class Ex03GetConsonants {
    public static void main(String[] args) {
        String text = "To be or not to be, that is the question (c)";
        System.out.println("Consonants: " + getConsonants(text));
    }

    /**
     * Returns a new string consisting of only the consonants from the given string.
     * @param str the string to process
     * @return a string of consonants
     */
    public static String getConsonants(String str) {
        return str.replaceAll("[AEIOUaeiou\\W\\d]", "");
    }
}
