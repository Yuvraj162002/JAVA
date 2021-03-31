package com.task0.String;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class StringToDate {
    public static void main(String[] args) {

        String date = "July 25, 2017";
        //String date = "2021-05-12";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy", Locale.ENGLISH);
        LocalDate sdate = LocalDate.parse(date, formatter);
        System.out.println(sdate);

    }
}
