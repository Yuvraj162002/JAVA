package com.task0.DecisionMakingAndLoop;

import java.util.Scanner;

public class NoOfDigitsInInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
        int count = 0;
        String str = Integer.toString(a);

        for (int i = 0; i < str.length(); i++) {
            System.out.println("No of integer is:"+i);
            count++;
        }
    }
}