package com.coherentsolutions.java.webauto.section01;

import java.util.Locale;

public class Ex06ToUpperCaseAndToLowerCase {
    public static void main(String[] args) {
        String text = "To be or not to be, that is the question (c)";

        String upperCase = text.toUpperCase();
        System.out.println("Uppercase: " + upperCase);

        String lowerCase = text.toLowerCase(Locale.ENGLISH);
        System.out.println("Lowercase: " + lowerCase);
    }
}
