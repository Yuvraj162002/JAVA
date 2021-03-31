package com.task0.String;

import java.util.Scanner;

public class IterateEachCharacterOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  name");
        String name ="yuvraj";
        //String cousre[] = new String[6];

        for (int i = 0;i<name.length();i++){
           // System.out.println("characetr is"+i);
            char a = name.charAt(i);
            System.out.println(a);
        }

    }
}
