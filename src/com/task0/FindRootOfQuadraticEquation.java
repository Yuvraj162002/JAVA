package com.task0;

import java.util.Scanner;

public class FindRootOfQuadraticEquation {
    public static void main(String[] args) {
        double root1, root2, imaginary, real;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  value of a");
        double a = sc.nextDouble();
        System.out.println("Enter the  value of b");
        double b = sc.nextDouble();
        System.out.println("Enter the  value of c");
        double c = sc.nextDouble();

        double D = ((b * b) - 4 * a * c);

        if (D > 0) {
            root1 = (-b + Math.sqrt(D) / (2 * a));
            root2 = (-b - Math.sqrt(D) / (2 * a));
            System.out.format("two distinct real roots:- root1=%.2f and root2=%.2f",root1,root2);
           // System.out.println("two distinct real roots" + root2);
        } else if (D == 0) {
            root1 = root2 = (-b / 2 * a);
            System.out.format("two equal and real roots exits root1=%.2f and root2 = %.2f",root1,root2);
           // System.out.println("two equal and real roots exits" + root2);
        } else {
            real = (-b / 2 * a);
            imaginary = (Math.sqrt(-D) / 2 * a);
            System.out.format("two distinct complex root root1 = %.2f+%.2fi  ",real,imaginary);
            System.out.format("two distinct complex root root2 = %.2f-%.2fi",real,imaginary);
            //System.out.println("two distinct complex root" + imaginary);
        }

    }
}