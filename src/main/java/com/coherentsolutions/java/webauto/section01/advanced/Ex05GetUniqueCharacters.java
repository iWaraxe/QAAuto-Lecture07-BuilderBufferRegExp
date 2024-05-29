package com.coherentsolutions.java.webauto.section01.advanced;

public class Ex05GetUniqueCharacters {
    public static void main(String[] args) {
        String text = "To be or not to be, that is the question (c)";
        System.out.println("Unique characters: " + getUniqueCharacters(text));
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
}
