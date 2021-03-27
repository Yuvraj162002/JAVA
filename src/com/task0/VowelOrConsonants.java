package com.task0;

import java.util.Scanner;

public class VowelOrConsonants {
    public  static  void main(String[]args){
        System.out.println("enter the character");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        //ch= ['A','E','I','0','U'];


        if((ch == 'A'||ch=='E'||ch=='I'||ch=='0'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')){

            System.out.println("this is the vowel");
        }
        else{
            System.out.println("this is a consonant");
        }

    }

}
