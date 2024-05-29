package com.coherentsolutions.java.webauto.section03;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Demonstrates the use of regular expressions to find email addresses in a string.
 */
public class Ex03EmailPattern {
    public static void main(String[] args) {
        String emailPattern = "\\w+@\\w+\\.[a-z]{2,3}";
        String text = "Please contact us at support@example.com for further assistance";

        Pattern pattern = Pattern.compile(emailPattern);
        Matcher matcher = pattern.matcher(text);

        if (matcher.find()) {
            System.out.println("Found email: " + matcher.group());
        } else {
            System.out.println("No email found.");
        }
    }
}
