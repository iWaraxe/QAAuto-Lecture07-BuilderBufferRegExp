package com.coherentsolutions.java.webauto.section03.advanced.realexamples;

public class ReplacePatternExample {
    public static void main(String[] args) {
        String text = "The rain in Spain falls mainly in the plain.";
        String replacedText = text.replaceAll("ain", "XYZ");

        System.out.println("Original text: " + text);
        System.out.println("Replaced text: " + replacedText);
    }
}
