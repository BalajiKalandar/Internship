package com.java.s28thdsa;

import java.time.LocalDate;

public class DayOfYearFinder {
    public static int dayOfYear(String date) {
        LocalDate localDate = LocalDate.parse(date);
        return localDate.getDayOfYear();
    }

    public static void main(String[] args) {
        String date1 = "2019-01-07";
        int dayOfYear1 = dayOfYear(date1);
        System.out.println("Day of the year: " + dayOfYear1); // Output: 7

    }
}

