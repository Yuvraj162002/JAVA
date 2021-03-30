package com.task0.DecisionMakingAndLoop;

public class CreatePyramidAndPattern2 {
    public static void main(String[] args) {
        System.out.println("Create a Pyramid");
        int n = 3;

        for (int i = 1; i <= n; i++) {
            for (int k = 3; k >= i; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.print("\n");
        }

    }
}