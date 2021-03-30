package com.task0.Arrays;

import java.util.Arrays;

public class ConcatenateTwoArrays {
    public static void main(String[] args) {
        //int marks1[] , marks2[] , marks3[];
         String marks1[]= {"yuvi","yuuuurt"};
         String marks2[] = {"tunu","munu"};

       String result[]= new String [marks1.length+ marks2.length];

       System.arraycopy(marks1,0,result,0,marks1.length);
       System.arraycopy(marks2,0,result,marks1.length,marks2.length);

       System.out.println(Arrays.toString(result));

    }
}
