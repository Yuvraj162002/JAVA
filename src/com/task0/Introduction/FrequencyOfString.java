package com.task0.Introduction;

public class FrequencyOfString {
    public  static void main(String[]args){
        String str = "My Name Is Yuvarj Pareek";
        char ch = 'a';
        int frequency = 0;

        for (int i = 0; i<str.length();i++){
            if(ch == str.charAt(i)){
                frequency++;
            }
        }
        System.out.println("NO of frequency of a in this string is"+frequency);
    }
}
