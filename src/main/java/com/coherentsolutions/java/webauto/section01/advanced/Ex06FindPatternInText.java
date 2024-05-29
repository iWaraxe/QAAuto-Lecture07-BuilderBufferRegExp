package com.coherentsolutions.java.webauto.section01.advanced;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex06FindPatternInText {
    public static void main(String[] args) {
        findPatternInText("The price is 100 dollars.", "\\d+");
    }

    /**
     * Finds and prints the first occurrence of the given pattern in the text.
     * @param text the text to search
     * @param patternStr the regular expression pattern to match
     */
    public static void findPatternInText(String text, String patternStr) {
        Pattern pattern = Pattern.compile(patternStr);
        Matcher matcher = pattern.matcher(text);
        if (matcher.find()) {
            System.out.println("Found pattern: " + matcher.group());
        } else {
            System.out.println("Pattern not found.");
        }
    }
}
