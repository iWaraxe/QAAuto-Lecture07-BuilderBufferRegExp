package com.coherentsolutions.java.webauto.section01;

public class Ex01IndexOf {
    public static void main(String[] args) {
        String text = "To beer or not to beer, that is the question (c)";
        int index = text.indexOf('r');
        System.out.println("Index of 'r': " + index);
    }
}
