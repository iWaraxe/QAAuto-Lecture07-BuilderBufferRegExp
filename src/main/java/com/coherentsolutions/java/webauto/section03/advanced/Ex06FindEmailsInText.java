package com.coherentsolutions.java.webauto.section03.advanced;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Demonstrates the use of regular expressions to find multiple email addresses in a string.
 */
public class Ex06FindEmailsInText {
    public static void main(String[] args) {
        String text = "Contact us at support@example.com and info@example.org";
        String emailPattern = "\\w+@\\w+\\.[a-z]{2,3}";

        Pattern pattern = Pattern.compile(emailPattern);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println("Found email: " + matcher.group());
        }
    }
}
