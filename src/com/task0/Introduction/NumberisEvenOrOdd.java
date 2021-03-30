package com.task0.Introduction;

import java.util.Scanner;

public class NumberisEvenOrOdd {
    public static void main(String[] args) {
        System.out.println("Enter  number1");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
      // int n1 = num%2==0;
         if(num%2==0) {
             System.out.println("number is even");
         }
         else{
             System.out.println("number is odd");
         }


    }
}