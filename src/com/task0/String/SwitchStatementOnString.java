package com.task0.String;

import java.util.Scanner;

public class SwitchStatementOnString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the course name");
        String course = sc.next();

        switch (course) {
            case "computer Science":
                System.out.println(" if you are good in computer then opt  cs");
               break;
            case "IT":
                System.out.println(" if you have interest in technology then opt  IT");
                break;

            case "Electrical Engineering":
                System.out.println(" if you are good in electrical then take electrical engineering");
                break;
            default:
                System.out.println("opt any other stream");
        }
    }
}