package com.coherentsolutions.java.webauto.section01;

public class Ex03ReplaceAll {
    public static void main(String[] args) {
        String text = "To be or not to be, that is the question (c)";
        String replacedAllStr = text.replaceAll("be", "exist");
        System.out.println("Replaced all 'be' with 'exist': " + replacedAllStr);
    }
}
