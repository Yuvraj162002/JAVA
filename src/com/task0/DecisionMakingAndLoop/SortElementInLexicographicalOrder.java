package com.task0.DecisionMakingAndLoop;

public class SortElementInLexicographicalOrder {
    public static void main(String[] args) {
        String temp;
        String []name = {"yuvraj","rahul","vishal","karan"};
        int n  = 4;
        for (int i = 0 ; i<n;i++){
            System.out.println(name[i]);
        }
        for (int i = 0 ; i<n-1 ; i++){
            for (int j = i+1; j<n;j++)
            if (name[i].compareTo(name[j])>0){
                temp = name[i];
                name[i]=name[j];
                name[j]=temp;
            }
        }
        System.out.println("value after sorting is" );
        for (int i = 0;i<n ; i++){
            System.out.println(name[i]);
        }
    }
}
