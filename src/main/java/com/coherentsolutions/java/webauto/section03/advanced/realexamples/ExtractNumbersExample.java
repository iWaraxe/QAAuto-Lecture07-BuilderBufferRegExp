package com.coherentsolutions.java.webauto.section03.advanced.realexamples;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractNumbersExample {
    public static void main(String[] args) {
        String text = "The price is 100 dollars and 50 cents.";
        String numberPattern = "\\d+";

        Pattern pattern = Pattern.compile(numberPattern);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println("Found number: " + matcher.group());
        }
    }
}
