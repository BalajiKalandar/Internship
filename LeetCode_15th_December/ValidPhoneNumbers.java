package com.java.dec15;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidPhoneNumbers {

    public static void main(String[] args) {
        String[] phoneNumbers = {
            "987-123-4567",
            "123 456 7890",
            "(123) 456-7890"
        };

        for (String phoneNumber : phoneNumbers) {
            if (isValidPhoneNumber(phoneNumber)) {
                System.out.println(phoneNumber);
            }
        }
    }

    private static boolean isValidPhoneNumber(String phoneNumber) {
        // Define the pattern for valid phone numbers
        String regex = "^(\\d{3}-\\d{3}-\\d{4}|\\(\\d{3}\\) \\d{3}-\\d{4})$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phoneNumber);

        return matcher.matches();
    }
}

