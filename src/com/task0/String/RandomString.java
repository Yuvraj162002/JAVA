package com.task0.String;

import java.util.Random;

public class RandomString {
    public static void main(String[] args) {
        System.out.println("Generate Random String");
        String  st[] ={"A","b","c","d","e","f"};
        Random rd = new Random();
        int random = rd.nextInt(st.length);

        System.out.println("the random number is"+st[random]);

    }
}
