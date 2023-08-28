package com.java.s28thdsa;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class DayOfWeekFinder {
    public static String findDay(int day, int month, int year) {
        LocalDate date = LocalDate.of(year, month, day);
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        
        String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        return daysOfWeek[dayOfWeek.getValue() - 1];
    }

    public static void main(String[] args) {
        int day = 15;
        int month = 8;
        int year = 2023;
        
        String dayOfWeek = findDay(day, month, year);
        System.out.println("Day of the week: " + dayOfWeek); // Output: "Monday"
    }
}
