package com.coherentsolutions.java.webauto.section03.advanced.realexamples;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePhoneNumber {
    public static void main(String[] args) {
        String phoneNumberPattern = "^\\+?\\d{1,3}?[- .]?\\(?(\\d{1,4})\\)?[- .]?\\d{1,4}[- .]?\\d{1,4}[- .]?\\d{1,9}$";
        String[] phoneNumbers = {"+1-800-555-5555", "123-456-7890", "(123) 456-7890", "123 456 7890", "invalid-phone-number"};

        Pattern pattern = Pattern.compile(phoneNumberPattern);

        for (String phoneNumber : phoneNumbers) {
            Matcher matcher = pattern.matcher(phoneNumber);
            System.out.println("Is '" + phoneNumber + "' a valid phone number? " + matcher.matches());
        }
    }
}
