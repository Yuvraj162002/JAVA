package com.task0;

public class StringIsEmptyOrNull {
    public static  void main(String[]args){
        String str1 = "Yuvraj";
        String str2 = "";
        boolean result;
        result = (str1==null || str1.isEmpty() );
            System.out.println(" string1 is empty or null?"+result);

            result = (str2==null||str2.isEmpty());
            System.out.println("string2 is empty or null?"+result);
        }
    }

