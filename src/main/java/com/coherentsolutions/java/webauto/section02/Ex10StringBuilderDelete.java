package com.coherentsolutions.java.webauto.section02.advanced;

/**
 * Demonstrates the use of StringBuilder's delete method.
 */
public class Ex10StringBuilderDelete {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("Hello Builder");
        builder.delete(5, 12);
        System.out.println(builder);
    }
}
