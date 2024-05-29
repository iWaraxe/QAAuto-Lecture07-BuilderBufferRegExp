package com.coherentsolutions.java.webauto.section03;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Demonstrates the use of regular expressions to find numbers in a string.
 */
public class Ex02NumberPattern {
    public static void main(String[] args) {
        String numberPattern = "\\d+";
        String text = "There are 123 apples in the basket";

        Pattern pattern = Pattern.compile(numberPattern);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println("Found number: " + matcher.group());
        }
    }
}
