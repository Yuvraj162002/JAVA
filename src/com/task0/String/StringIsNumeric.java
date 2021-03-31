package com.task0.String;

//// Here we do ..we convert string to numeric and if we enter the non-numeric string then it will throw a NumberformatException

import java.util.Scanner;

public class StringIsNumeric {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.next();

        int a = Integer.parseInt(str);
        try {
            System.out.println(a);
           // throw  new NumberFormatException();
        }catch (NumberFormatException e){
            System.out.println(" the reason for this is");
            System.out.println(e);
        }

        }
        }