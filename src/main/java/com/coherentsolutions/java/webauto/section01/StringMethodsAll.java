package com.coherentsolutions.java.webauto.section01;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Locale;

public class StringMethodsAll {

    public static void main(String[] args) {
        String text = "To be or not to be, that is the question (c)";

        // indexOf example
        int index = text.indexOf('r');
        System.out.println("Index of 'r': " + index);

        // replace example
        String replacedStr = text.replace('t', 'T');
        System.out.println("Replaced text: " + replacedStr);

        // replaceAll example
        String replacedAllStr = text.replaceAll("be", "exist");
        System.out.println("Replaced all 'be' with 'exist': " + replacedAllStr);

        // startsWith example
        boolean startsWith = text.startsWith("To be");
        System.out.println("Starts with 'To be': " + startsWith);

        // substring example
        String substring1 = text.substring(6);
        System.out.println("Substring from index 6: " + substring1);

        String substring2 = text.substring(0, 5);
        System.out.println("Substring from index 0 to 5: " + substring2);

        // toUpperCase and toLowerCase example
        String upperCase = text.toUpperCase();
        System.out.println("Uppercase: " + upperCase);

        String lowerCase = text.toLowerCase(Locale.ENGLISH);
        System.out.println("Lowercase: " + lowerCase);

        // charAt example
        for (int i = 0; i < text.length(); i++) {
            System.out.print(text.charAt(i) + " ");
        }
        System.out.println();

        // trim example
        String trimmedStr = "   " + text + "   ";
        System.out.println("Trimmed text: \"" + trimmedStr.trim() + "\"");

        // valueOf example
        String numStr = String.valueOf(555);
        String doubleStr = String.valueOf(555.55);
        String charStr = String.valueOf('c');
        System.out.println("String value of 555: " + numStr);
        System.out.println("String value of 555.55: " + doubleStr);
        System.out.println("String value of 'c': " + charStr);

        // compareTo example
        String str1 = "apple";
        String str2 = "banana";
        System.out.println("Comparing 'apple' to 'banana': " + str1.compareTo(str2));

        // Sorting string array
        String[] strArray = {"apple", "banana", "cherry", "date"};
        Arrays.sort(strArray);
        printArray(strArray);

        // Sorting in descending order
        Arrays.sort(strArray, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s2.compareTo(s1);
            }
        });
        printArray(strArray);

        // String formatting example
        System.out.println(getSum(5, 10));
    }

    /**
     * Prints the elements of the given array.
     * @param array the array to print
     */
    public static void printArray(String[] array) {
        for (String str : array) {
            System.out.println(str);
        }
    }

    /**
     * Calculates the sum of two integers and returns a formatted string.
     * @param a the first integer
     * @param b the second integer
     * @return a formatted string representing the sum
     */
    public static String getSum(int a, int b) {
        int sum = a + b;
        return String.format("Sum of variable %d and variable %d is %d \n", a, b, sum);
    }
}
