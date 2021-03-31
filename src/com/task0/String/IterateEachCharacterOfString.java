package com.task0.String;

import java.util.Scanner;

public class IterateEachCharacterOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the course name");
        String course ="yuvraj";
        //String cousre[] = new String[6];

        for (int i = 0;i<course.length();i++){
           // System.out.println("characetr is"+i);
            char a = course.charAt(i);
            System.out.println(a);
        }

    }
}
