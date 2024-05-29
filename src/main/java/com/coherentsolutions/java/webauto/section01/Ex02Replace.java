package com.coherentsolutions.java.webauto.section01;

public class Ex02Replace {
    public static void main(String[] args) {
        String text = "To be or not to be, that is the question (c)";
        String replacedStr = text.replace('t', 'T');
        System.out.println("Replaced text: " + replacedStr);
    }
}
