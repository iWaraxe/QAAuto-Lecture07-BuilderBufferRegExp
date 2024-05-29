package com.coherentsolutions.java.webauto.section02.advanced;

/**
 * Demonstrates the use of StringBuilder's insert method.
 */
public class Ex08StringBuilderInsert {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("Hello Builder");
        builder.insert(5, " Inserted");
        System.out.println(builder);
    }
}
