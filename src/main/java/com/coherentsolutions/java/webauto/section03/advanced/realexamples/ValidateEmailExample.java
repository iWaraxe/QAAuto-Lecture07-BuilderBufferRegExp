package com.coherentsolutions.java.webauto.section03.advanced.realexamples;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateEmailExample {
    public static void main(String[] args) {
        String emailPattern = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
        String[] emails = {"test@example.com", "invalid-email", "another.test@domain.org"};

        Pattern pattern = Pattern.compile(emailPattern);

        for (String email : emails) {
            Matcher matcher = pattern.matcher(email);
            System.out.println("Is '" + email + "' a valid email? " + matcher.matches());
        }
    }
}
