package com.task2;
import java.util.*;

public class WordGuessNumber{

    public static void main(String[] args) {
        startGame("SHAMBHO");
    }

    private static void startGame(String s) {

        Scanner scanner = new Scanner(System.in);

        HashSet<Character> vowel = new HashSet<>();
        vowel.add('A');
        vowel.add('E');
        vowel.add('I');
        vowel.add('O');
        vowel.add('U');
        StringBuilder showString = new StringBuilder(s);
        String tempShowString = s;


        HashMap<Character,Integer> positionOfCharacter = new HashMap<>();


        int noOfConsonants = 0;
        int totalChances = 0;
        ArrayList<Integer> tempArrayList = new ArrayList<>();
        for(int i=0;i<s.length();i++)
        {
            if(!vowel.contains(s.charAt(i)))
            {
                showString.setCharAt(i,'_');
                noOfConsonants++;
                positionOfCharacter.put(s.charAt(i),i);
            }
        }

        totalChances = noOfConsonants+3;


        while(totalChances!=0 && !tempShowString.equals(showString.toString()))
        {
            System.out.println("Word : "+showString);
            System.out.println("Chances : "+totalChances);
            System.out.println("Guess : ");
            char input = scanner.next().charAt(0);
            if(!positionOfCharacter.containsKey(input))
            {
                System.out.println("Character not found");
            }
            else
            {
                System.out.println("Character is Present");
                for(int i=0;i<s.length();i++)
                {
                    if(s.charAt(i) == input)
                        showString.setCharAt(i,input);
                }
            }
            totalChances--;
        }


        if(totalChances == 0 && !tempShowString.equals(showString.toString()))
            System.out.println("BETTER LUCK NEXT TIME");
        else System.out.println("YOU WON");

    }

}
