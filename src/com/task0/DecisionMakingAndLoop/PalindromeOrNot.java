package com.task0.DecisionMakingAndLoop;

import java.util.Scanner;

public class PalindromeOrNot {

    public static void main(String[] args) {
        int number1;
        int reverse  = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
         int num = sc.nextInt();
        number1 = num;

         while (num>0){
             reverse = reverse*10 +num%10;
             num = num/10;
         }
         if (number1==reverse){
             System.out.println("this is an palindrome");
         }
         else {
             System.out.println("this is not an palindrome");
         }
    }

}
