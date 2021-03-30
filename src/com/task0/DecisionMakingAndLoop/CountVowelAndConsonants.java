package com.task0.DecisionMakingAndLoop;

import java.util.Locale;
import java.util.Scanner;

public class CountVowelAndConsonants {
    public static void main(String[] args) {
        int vCount = 0;
        int cCount = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the sentence");
        String sentence = sc.nextLine();

        sentence = sentence.toLowerCase();


        for (int i = 0; i<sentence.length(); i++){
            if(sentence.charAt(i)=='a'||sentence.charAt(i)=='e'||sentence.charAt(i)=='i'||sentence.charAt(i)=='o'||sentence.charAt(i)=='u'){
                vCount++;
            }
            else if(sentence.charAt(i)>='a'&& sentence.charAt(i)<='z'){
                cCount++;
            }
        }
        System.out.println("Vowel no"+vCount);
        System.out.println("Consonants no"+cCount);

    }
}
