package com.coherentsolutions.java.webauto.section02.advanced;

/**
 * Demonstrates the use of StringBuffer's capacity and ensureCapacity methods.
 */
public class Ex11StringBufferCapacity {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer();
        System.out.println("Initial capacity: " + buffer.capacity());
        buffer.ensureCapacity(50);
        System.out.println("Capacity after ensureCapacity(50): " + buffer.capacity());
    }
}
