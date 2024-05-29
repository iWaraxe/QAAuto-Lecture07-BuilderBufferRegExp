package com.coherentsolutions.java.webauto.section01;

public class Ex13StringFormat {
    public static void main(String[] args) {
        System.out.println(getSum(5, 10));
    }

    public static String getSum(int a, int b) {
        int sum = a + b;
        return String.format("Sum of variable %d and variable %d is %d \n", a, b, sum);
    }
}
