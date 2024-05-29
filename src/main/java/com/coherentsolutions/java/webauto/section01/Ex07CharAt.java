package com.coherentsolutions.java.webauto.section01;

public class Ex07CharAt {
    public static void main(String[] args) {
        String text = "To be or not to be, that is the question (c)";
        for (int i = 0; i < text.length(); i++) {
            System.out.print(text.charAt(i) + " ");
        }
        System.out.println();
    }
}
