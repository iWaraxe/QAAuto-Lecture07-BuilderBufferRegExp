package com.coherentsolutions.java.webauto.section03.advanced;

import java.util.regex.Pattern;

/**
 * Demonstrates the use of replaceAll method with regular expressions.
 */
public class Ex07ReplaceAllExample {
    public static void main(String[] args) {
        String text = "The price is 100 dollars";
        String replacedText = text.replaceAll("\\d+", "XXX");

        System.out.println("Original text: " + text);
        System.out.println("Replaced text: " + replacedText);
    }
}
