package com.coherentsolutions.java.webauto.section03;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Demonstrates the use of regular expressions to find numbers in a string.
 */
public class Ex04FindNumbersInText {
    public static void main(String[] args) {
        String text = "Стоимость этой продукции 586 белорусских рублей";
        String numberPattern = "\\d+";

        Pattern pattern = Pattern.compile(numberPattern);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println("Found number: " + matcher.group());
        }
    }
}
