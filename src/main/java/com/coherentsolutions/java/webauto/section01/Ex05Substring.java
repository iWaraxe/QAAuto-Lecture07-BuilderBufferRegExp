package com.coherentsolutions.java.webauto.section01;

public class Ex05Substring {
    public static void main(String[] args) {
        String text = "To be or not to be, that is the question (c)";

        String substring1 = text.substring(6);
        System.out.println("Substring from index 6: " + substring1);

        String substring2 = text.substring(0, 5);
        System.out.println("Substring from index 0 to 5: " + substring2);
    }
}
