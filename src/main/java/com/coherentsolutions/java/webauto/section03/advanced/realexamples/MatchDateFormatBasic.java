package com.coherentsolutions.java.webauto.section03.advanced.realexamples;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchDateFormatBasic {
    public static void main(String[] args) {
        String datePattern = "^\\d{4}-\\d{2}-\\d{2}$";
        String[] dates = {"2023-05-12", "12/05/2023", "2023-5-12", "3023-13-42"}; // last example is true, it's only pattern

        Pattern pattern = Pattern.compile(datePattern);

        for (String date : dates) {
            Matcher matcher = pattern.matcher(date);
            System.out.println("Does '" + date + "' match the date format YYYY-MM-DD? " + matcher.matches());
        }
    }
}
