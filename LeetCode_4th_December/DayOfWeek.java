package com.java.timest;
import java.time.*;
import java.time.format.DateTimeFormatter;
public class DayOfWeek {
public static void main(String[] args) {
	String days=dayOfWeek("28-05-25");
	System.out.println(days);
}
static String dayOfWeek(String date) {
	LocalDate ref=LocalDate.parse(date , DateTimeFormatter.ofPattern("yy-MM-dd"));
	java.time.DayOfWeek dayOfWeek=ref.getDayOfWeek();
	return dayOfWeek.toString();
}
}
