package com.task0.Introduction;

public class RemoveWhiteSpaces {
    public static void main(String[]args){
        String name = "WE WANT  TO    REMOVE ALL   WHITESPACE ";
        System.out.println(name);
        System.out.println(name.replaceAll("\\s",""));

    }

}
