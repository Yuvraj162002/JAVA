package com.task0.Introduction;

import java.util.Scanner;

public class Addingtwointeger {
    public   static  void main(String[]args){
        System.out.println("enter the value of integer 1");
        Scanner sc = new Scanner(System.in);
        int  a1 = sc.nextInt();
        System.out.println("enter the value of integer 2");
        int a2 = sc.nextInt();
        System.out.println("add two number");
        System.out.println(a1+a2);
    }
}
