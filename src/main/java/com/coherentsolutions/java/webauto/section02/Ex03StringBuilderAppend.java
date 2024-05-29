package com.coherentsolutions.java.webauto.section02;

/**
 * Demonstrates the use of StringBuilder and its append method.
 */
public class Ex03StringBuilderAppend {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        builder.append("Hello ");
        builder.append("String");
        builder.append(" ");
        builder.append("Builder");
        System.out.println(builder);
    }
}
