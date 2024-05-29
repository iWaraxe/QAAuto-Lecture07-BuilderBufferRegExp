package com.coherentsolutions.java.webauto.section02.advanced;

/**
 * Demonstrates the use of StringBuffer's delete method.
 */
public class Ex09StringBufferDelete {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer("Hello Buffer");
        buffer.delete(5, 12);
        System.out.println(buffer);
    }
}
