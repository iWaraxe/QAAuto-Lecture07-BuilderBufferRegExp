package com.coherentsolutions.java.webauto.section02;

/**
 * Demonstrates the use of StringBuffer and its append method.
 */
public class Ex01StringBufferAppend {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer();
        buffer.append("Hello ");
        buffer.append("String");
        buffer.append(" ");
        buffer.append("Buffer");
        System.out.println(buffer);
    }
}
