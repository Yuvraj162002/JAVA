package com.task0;

import java.util.Scanner;

public class SwapTwoNo {
    public static void main(String[] args) {
        int temp;
        System.out.println("Before Swaping");
        System.out.println("Enter  number1");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        System.out.println("Enter  number2");
        int n2 = sc.nextInt();

        temp = n1;
        n1 = n2;
        n2 = temp;

        System.out.println("After Swaping");
        System.out.println("number1\n"+n1);
        System.out.println("number2\n"+n2);
    }
}
