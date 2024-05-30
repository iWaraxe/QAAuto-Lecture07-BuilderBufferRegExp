package com.coherentsolutions.java.webauto.section03.advanced.realexamples;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchDateFormatAdvanced {
    public static void main(String[] args) {
        String datePattern = "^(?:(?:(?:19|20)[0-9]{2})-(?:(?:0[1-9]|1[0-2]))-(?:(?:0[1-9]|1\\d|2\\d|3[01]))$)";
        String[] dates = {"2023-05-12", "12/05/2023", "2023-13-12", "2023-05-32", "2021-02-29", "2020-02-29"};

        Pattern pattern = Pattern.compile(datePattern);

        for (String date : dates) {
            Matcher matcher = pattern.matcher(date);
            if (matcher.matches() && isValidDate(date)) {
                System.out.println("Does '" + date + "' match the date format YYYY-MM-DD and is a valid date? " + "Yes");
            } else {
                System.out.println("Does '" + date + "' match the date format YYYY-MM-DD and is a valid date? " + "No");
            }
        }
    }

    /**
     * Validates if the date is real, considering month days and leap years.
     * @param date the date string in format YYYY-MM-DD
     * @return true if the date is valid, false otherwise
     */
    public static boolean isValidDate(String date) {
        String[] parts = date.split("-");
        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);

        if (month < 1 || month > 12) {
            return false;
        }

        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // Check for leap year
        if (month == 2 && isLeapYear(year)) {
            daysInMonth[1] = 29;
        }

        return day > 0 && day <= daysInMonth[month - 1];
    }

    /**
     * Checks if the given year is a leap year.
     * @param year the year to check
     * @return true if the year is a leap year, false otherwise
     */
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
