package com.task0.String;

import javax.print.attribute.DateTimeSyntax;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class StringToDate {
    public static void main(String[] args){
        String st = "2017-05-25";
       // SimpleDateFormat formatter = new SipleDateFormat("dd-MMM-yyyy");
        //Date date = formatter.parse(st)
        LocalDate date = LocalDate.parse(st, DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println(date);

    }
}
