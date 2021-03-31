package com.task0.String;

import java.util.Random;

public class RandomString {
    public static void main(String[] args) {
        System.out.println("Generate Random String");
        Random rd = new Random();
        String cominput = rd.toString();
        System.out.println(cominput);
    }
}
