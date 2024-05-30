package com.coherentsolutions.java.webauto.section03.advanced.realexamples;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindWordsExample {
    public static void main(String[] args) {
        String text = "The quick brown fox jumps over the lazy dog.";
        String wordPattern = "\\b\\w+\\b";

        Pattern pattern = Pattern.compile(wordPattern);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println("Found word: " + matcher.group());
        }
    }
}
