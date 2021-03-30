package com.task0.DecisionMakingAndLoop;

public class CreatePyramidAndPattern {
    public static void main(String[] args) {
        System.out.println("Create a pattern");
        int n = 5;

        for (int i = 0;i<=n;i++){
            for (int j = 0;j<=i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
