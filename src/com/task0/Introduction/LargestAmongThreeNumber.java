package com.task0.Introduction;

import java.util.Scanner;

public class LargestAmongThreeNumber {
    public static void main(String[] args) {
        System.out.println("Enter  number1");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        System.out.println("Enter  number2");
        int n2 = sc.nextInt();

        System.out.println("Enter  number3");
        int n3= sc.nextInt();

        if((n1>n2)&&(n2>n3)){
            System.out.println("n1 is greater");
        }
        else if((n2>n3)&&(n3>n1)){
            System.out.println("n2 is greater");
        }
        else {
            System.out.println("n3 is greater");
        }


    }
}