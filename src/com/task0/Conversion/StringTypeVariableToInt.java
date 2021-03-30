package com.task0.Conversion;

import java.io.PrintStream;


/*  TO CONVERTING STRING VARIABLE TO INT WE USE THE INTEGER.PARSEINT KEYWORD...   AND IF WE WANT TO ADD TWO STRING
THEN IT WILL GIVE(STR1 = 2323 STR2 = 3434 THEN IT GIVE 23233434 BUT IF WE WANT TO ADD THEN  WE CONVERT THE STRING TO
INT.)
 */

public class StringTypeVariableToInt {
    public  static  void main(String[]args){
    String str1 = "3434";
    //CONVERTING STRING TO INT..
    int a   = Integer.parseInt(str1);
    String str2 = "4545";
    int b = Integer.parseInt(str2);
    int c = a+b;
    System.out.println("the addition of two string is"+c);

    }
}
