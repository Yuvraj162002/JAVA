package com.task0.Introduction;

import java.util.Scanner;

public class FindQuotientAndRemainder {
    public static void main(String[]args){
        System.out.println("Enter  the value of dividend");
        Scanner sc = new Scanner(System.in);
        int dividend = sc.nextInt();
        System.out.println("Enter  the value of divisor");
        int divisor = sc.nextInt();

        int quotient = (dividend/divisor);
        System.out.println("Quotient is\t"+quotient);

        int remainder = (dividend%divisor);
        System.out.println("remainder is\t"+remainder);
    }

}
