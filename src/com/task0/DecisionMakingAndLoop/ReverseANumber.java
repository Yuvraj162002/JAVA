package com.task0.DecisionMakingAndLoop;

import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("BEFORE REVERSING------>>>");
        int reverse = 0;
        //int num = 3456;  ///// 3456--->>>6543...
        System.out.println("Enter the Number is");
        int num = sc.nextInt();
        System.out.println("Number is:-"+num);

        System.out.println("AFTER REVERSING------>>>");

        while (num>0){
            reverse = reverse*10 + num%10;
            num = num/10;

         }
             System.out.println("Number is"+reverse);

       //// 123--->321..
    }
}
