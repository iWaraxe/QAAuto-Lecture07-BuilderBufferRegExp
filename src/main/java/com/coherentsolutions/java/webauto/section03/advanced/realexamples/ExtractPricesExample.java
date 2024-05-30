package com.coherentsolutions.java.webauto.section03.advanced.realexamples;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractPricesExample {
    public static void main(String[] args) {
        String text = "The total cost is $100.50 and the discount price is $75.25.";
        String pricePattern = "\\$\\d+\\.\\d{2}";

        Pattern pattern = Pattern.compile(pricePattern);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println("Found price: " + matcher.group());
        }
    }
}
