package com.task0.Arrays;

public class Average {
    public static void main(String[] args) {
        int marks[] = {2,4,6,8};
         int sum = 0;
         int average;

        for (int i = 0 ; i<marks.length;i++){
            System.out.println("Array is"+marks[i]);
            sum += marks[i];
           // average = sum/ marks.length;
                }
        System.out.println("Average of the sum is"+sum/ marks.length);


    }
}
