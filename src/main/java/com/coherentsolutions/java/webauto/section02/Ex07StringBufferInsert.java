package com.coherentsolutions.java.webauto.section02.advanced;

/**
 * Demonstrates the use of StringBuffer's insert method.
 */
public class Ex07StringBufferInsert {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer("Hello Buffer");
        buffer.insert(5, " Inserted");
        System.out.println(buffer);
    }
}
