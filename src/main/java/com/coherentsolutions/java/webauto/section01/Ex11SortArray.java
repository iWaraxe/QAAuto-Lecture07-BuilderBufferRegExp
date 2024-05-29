package com.coherentsolutions.java.webauto.section01;

import java.util.Arrays;

public class Ex11SortArray {
    public static void main(String[] args) {
        String[] strArray = {"apple", "banana", "cherry", "date"};
        Arrays.sort(strArray);
        printArray(strArray);
    }

    public static void printArray(String[] array) {
        for (String str : array) {
            System.out.println(str);
        }
    }
}
