package com.coherentsolutions.java.webauto.section03.advanced.realexamples;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractURLs {
    public static void main(String[] args) {
        String text = "Visit our website at http://www.example.com or https://secure.example.com for more information.";
        String urlPattern = "(http|https)://[\\w\\-\\.]+(\\.[a-z]{2,3})+(/[\\w\\-\\.~]*)*";

        Pattern pattern = Pattern.compile(urlPattern);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println("Found URL: " + matcher.group());
        }
    }
}
