package com.task0.DecisionMakingAndLoop;

import java.util.Scanner;

public class CalculatorUsingSwitchCase {
    public static void main(String[] args) {
        float result = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("WE ARE MAKING AN CALCULATOR::---");
        System.out.println("Enter the first number");
        float num1 = sc.nextFloat();

        System.out.println("Enter the second number");
        float num2 = sc.nextFloat();

        System.out.println("enter the opeartor :*,+,-,/");
        char operator = sc.next().charAt(0);

        switch (operator){
            case '+':
                System.out.println("add two number");
                result = num1+num2;
               break;

            case '-':
                System.out.println("subtract two number");
                result = num1-num2;
                break;

            case '*':
                result = num1*num2;
                break;

            case '/':
                System.out.println("divide two number");
                result = num1/num2;
                break;

            default:
                System.out.println("enter operand is invalid");
        }
        System.out.println("num1"+operator+"num2 ="+result);

    }
}
