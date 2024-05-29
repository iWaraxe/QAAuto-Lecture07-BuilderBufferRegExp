package com.coherentsolutions.java.webauto.section01;

public class Ex04StartsWith {
    public static void main(String[] args) {
        String text = "To be or not to be, that is the question (c)";
        boolean startsWith = text.startsWith("To be");
        System.out.println("Starts with 'To be': " + startsWith);
    }
}
