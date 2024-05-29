package com.coherentsolutions.java.webauto.section01;

import java.util.Arrays;
import java.util.Comparator;

public class Ex12SortArrayDescending {
    public static void main(String[] args) {
        String[] strArray = {"apple", "banana", "cherry", "date"};
        Arrays.sort(strArray, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s2.compareTo(s1);
            }
        });
        printArray(strArray);
    }

    public static void printArray(String[] array) {
        for (String str : array) {
            System.out.println(str);
        }
    }
}
