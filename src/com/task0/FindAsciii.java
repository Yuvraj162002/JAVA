package com.task0;

import java.util.Scanner;

public class FindAsciii {
    public  static  void main(String[]args){
        System.out.println("enter the character");
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        int ascii = c;
        System.out.println("the ascii value"+c+"is"+ascii);
    }

}
