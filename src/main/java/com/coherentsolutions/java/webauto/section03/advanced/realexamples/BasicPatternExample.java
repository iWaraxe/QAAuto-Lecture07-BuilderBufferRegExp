package com.coherentsolutions.java.webauto.section03.advanced.realexamples;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BasicPatternExample {
    public static void main(String[] args) {
        String text = "The rain in Spain falls mainly in the plain.";
        String patternString = "ain";

        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println("Found pattern at index " + matcher.start() + ": " + matcher.group());
        }
    }
}
