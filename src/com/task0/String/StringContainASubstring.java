package com.task0.String;

import java.util.Scanner;

public class StringContainASubstring {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the string1");
        String name1 = sc.nextLine();
        if (name1.contains("pareek")){
            System.out.println("yes the substring is present");
        }
        else {
            System.out.println("no substring is not present");
        }
     //  System.out.println(name1.substring(1));
        //System.out.println(name1.contains("yuvraj"));

    }
}
