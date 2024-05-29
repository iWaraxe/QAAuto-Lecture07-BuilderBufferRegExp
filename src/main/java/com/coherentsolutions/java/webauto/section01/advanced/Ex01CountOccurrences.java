package com.coherentsolutions.java.webauto.section01.advanced;

public class Ex01CountOccurrences {
    public static void main(String[] args) {
        String text = "To be or not to be, that is the question (c)";
        System.out.println("Occurrences of 'o': " + countOccurrences(text, 'o'));
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
}
