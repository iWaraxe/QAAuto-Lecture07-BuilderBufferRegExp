package com.coherentsolutions.java.webauto.section03.advanced.realexamples;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateCreditCardNumber {
    public static void main(String[] args) {
        String creditCardPattern = "^(?:4[0-9]{12}(?:[0-9]{3})?|5[1-5][0-9]{14}|3[47][0-9]{13}|3(?:0[0-5]|[68][0-9])[0-9]{11}|6(?:011|5[0-9]{2})[0-9]{12}|(?:2131|1800|35\\d{3})\\d{11})$";
        String[] creditCardNumbers = {"4111111111111111", "5500000000000004", "340000000000009", "30000000000004", "invalid-cc-number"};

        Pattern pattern = Pattern.compile(creditCardPattern);

        for (String ccNumber : creditCardNumbers) {
            Matcher matcher = pattern.matcher(ccNumber);
            System.out.println("Is '" + ccNumber + "' a valid credit card number? " + matcher.matches());
        }
    }
}
