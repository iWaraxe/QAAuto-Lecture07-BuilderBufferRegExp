package com.coherentsolutions.java.webauto.section03;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Demonstrates the use of regular expressions to find prices in a string.
 */
public class Ex01PricePattern {
    public static void main(String[] args) {
        String pricePattern = "\\d+\\.?\\d{0,2}";
        String text = "The total cost is 1586.50 dollars";

        Pattern pattern = Pattern.compile(pricePattern);
        Matcher matcher = pattern.matcher(text);

        if (matcher.find()) {
            System.out.println("Found price: " + matcher.group());
        } else {
            System.out.println("No price found.");
        }
    }
}
