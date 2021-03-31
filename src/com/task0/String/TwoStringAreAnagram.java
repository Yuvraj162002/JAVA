package com.task0.String;

import java.util.Arrays;
import java.util.Scanner;

public class TwoStringAreAnagram {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the first String");
        String name1  = sc.next();

        System.out.println("Enter the Second String");
        String name2  = sc.next();

        if (name1.length() == name2.length()){
            char [] charArray1 = name1.toCharArray();
            char [] charArray2 = name2.toCharArray();
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            boolean result = Arrays.equals(charArray1,charArray2);
            if (result){
                System.out.println(name1+" and \t"+name2+" \t are anagram");
            }
            else {
                System.out.println(name1+ "\t" +name2+ "\t are not an anagram");
            }
        }


    }
}
