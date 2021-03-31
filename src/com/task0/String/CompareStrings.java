package com.task0.String;

import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the string1");
        String name1 = sc.next();

        System.out.println("Enter the string2");
        String name2 = sc.next();


        System.out.println(name1.equals(name2));
    }
}
