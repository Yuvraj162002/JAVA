package com.task0.DecisionMakingAndLoop;

import java.util.Scanner;

public class CharacterIsAlphabetOrNot {
    public static void main(String[]args){
        System.out.println("Enter the  character");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z')){
            System.out.println("this is a character");
        }
        else{
            System.out.println("this is not a character");
        }
    }
}
