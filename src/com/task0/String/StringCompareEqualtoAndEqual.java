package com.task0.String;

import java.util.Scanner;

public class StringCompareEqualtoAndEqual {
    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
       // System.out.println("Enter the string1");
        //String name1 = sc.next();
        String name2="yuvraj";
        String name1="yuvraj";
        String name3 = new String("yuvraj");
        //System.out.println("Enter the string2");
        //String name2 = sc.next();


        System.out.println(name1.equals(name2));//Equals to check the value of two variable....
        System.out.println(name1.equals(name3));
        System.out.println(name1==name2);///(==)this operator check the refernce of two variable it not check the value..
        System.out.println(name1==name3);

    }
}
