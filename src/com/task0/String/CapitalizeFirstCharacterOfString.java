package com.task0.String;

import java.util.Locale;
import java.util.Scanner;

public class CapitalizeFirstCharacterOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name");
        String name =sc.nextLine();

       String firstletter = name.substring(0,1);
       String remainingletter = name.substring(1,name.length());

        firstletter = firstletter.toUpperCase(Locale.ROOT);

         String result = firstletter + remainingletter;
         System.out.println(result);

      //  System.out.println(name.toUpperCase());

    }
}
