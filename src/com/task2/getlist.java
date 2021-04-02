package com.task2;

import java.util.*;
import java.util.stream.Collectors;

public class getlist {
     static List<Integer> getList(String s) {
         String str[] = s.split(";");
        List<Integer> ss = new ArrayList<>(4);
        //String[] ss = number.split("; ");
        for (int j = 0; j < str.length; j++) {
            ss.add(Integer.parseInt(str[j]));

        }
        return ss;

    }
    public static void main(String[] args) {
        //String number = "1;2;3;4";
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String s = sc.next();
        List<Integer> ss = getList(s);
        System.out.println("list:"+ss);

    }
}