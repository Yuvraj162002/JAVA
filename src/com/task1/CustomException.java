package com.task1;

import java.util.Scanner;

class  InvalidReplcamentException extends Exception{
    public InvalidReplcamentException(String s){
        super(s);
        System.out.println(s);
    }
}
public class CustomException {
    public static void main(String[] args) {
        //public static String modify(String s, String replacemet)
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String s = sc.next();
        System.out.println("Enter the replacement string");
        String rep = sc.next();
        String reg = "([0-9][A-Z])*$";
        if (rep.matches(reg)){
            System.out.println("valid string");
        }
        else {
            try{
                throw  new InvalidReplcamentException(rep);
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
    }
}
