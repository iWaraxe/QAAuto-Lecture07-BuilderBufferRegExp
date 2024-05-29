package com.coherentsolutions.java.webauto.section02.advanced;

/**
 * Demonstrates the use of StringBuilder's capacity and ensureCapacity methods.
 */
public class Ex12StringBuilderCapacity {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        System.out.println("Initial capacity: " + builder.capacity());
        builder.ensureCapacity(50);
        System.out.println("Capacity after ensureCapacity(50): " + builder.capacity());
    }
}
