package com.task1;

import java.util.Scanner;

public class ModifyString {
    public static String modify(String s, String replacemet) {
        char ch[] = s.toCharArray();
        char ch1[] = replacemet.toCharArray();

        for (int i = 0; i < replacemet.length(); i = i + 2) {
            for (int j = 0; j < s.length(); j++) {
                if (ch1[i] == ch[j]) {
                    ch[j] = ch1[i + 1];
                }
            }

        }
        String str = String.valueOf(ch);
        return str;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String s = sc.next();
        System.out.println("enter the replacement string");
        String rs = sc.next();
        String result = modify(s, rs);
        System.out.println("the string after replacement is " + result);

    }
}