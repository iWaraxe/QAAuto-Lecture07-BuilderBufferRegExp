package com.coherentsolutions.java.webauto.section03.advanced;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Demonstrates the use of advanced regular expressions to find numbers in a string.
 */
public class Ex05AdvancedNumberPattern {
    public static void main(String[] args) {
        String text = "Стоимость этой продукции 586 белорусских рублей";
        String advancedPattern = "[0-9]"; // Using character classes

        Pattern pattern = Pattern.compile(advancedPattern);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println("Found digit: " + matcher.group());
        }
    }
}
