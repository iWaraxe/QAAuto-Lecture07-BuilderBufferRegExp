package com.coherentsolutions.java.webauto.section02;

/**
 * Demonstrates the use of StringBuilder and its reverse method.
 */
public class Ex04StringBuilderReverse {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        builder.append("Hello ");
        builder.append("String");
        builder.append(" ");
        builder.append("Builder");
        System.out.println(builder.reverse());
    }
}
