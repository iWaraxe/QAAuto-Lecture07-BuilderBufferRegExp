package com.coherentsolutions.java.webauto.section01;

public class Ex09ValueOf {
    public static void main(String[] args) {
        String numStr = String.valueOf(555);
        String doubleStr = String.valueOf(555.55);
        String charStr = String.valueOf('c');
        System.out.println("String value of 555: " + numStr);
        System.out.println("String value of 555.55: " + doubleStr);
        System.out.println("String value of 'c': " + charStr);
    }
}
