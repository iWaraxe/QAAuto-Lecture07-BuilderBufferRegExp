package com.coherentsolutions.java.webauto.section01;

public class Ex02Replace {
    public static void main(String[] args) {
        String text = "To be or not to be, that is the question (c)";
        String replacedStr = text.replace('t', 'T');
        System.out.println("Replaced text: " + replacedStr);

        String text2 = "The rain in Spain stays mainly in the plain.";

        // Replace all occurrences of 'a' with 'o'
        String replacedText1 = text2.replace('a', 'o');
        System.out.println(replacedText1);  // "The roin in Spoin stoys moinly in the ploin."

        // Replace all occurrences of "rain" with "snow"
        String replacedText2 = text2.replace("rain", "snow");
        System.out.println(replacedText2);  // "The snow in Spain stays mainly in the plain."
    }
}
