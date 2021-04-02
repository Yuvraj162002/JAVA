//package com.task1;
package com.task1;

import java.util.Scanner;

public class DirectlyProportional {
    static boolean isDirectlyProportional(int[] x,int[] y){
      //  int count=0,count2=0;
        for(int i=0;i<x.length;i++){
            for(int j=0;j<y.length;j++){
                if(y[i]%x[j]==0){
        //            count++;
                    break;
                }
            }
        }
        for(int i=0;i<x.length;i++){
            for(int j=0;j<y.length;j++){
                if(x[i]%y[j]==0){
                //    count2++;
                    break;
                }
            }
            //boolean ans = DirectlyProportional(x,y);

        }

        if(x.length != y.length){
            return false;
        } else{
            return false;
        }

    }
    public static void main(String[] args) {
        int x[] = new int[3];
        int y[] = new int[3];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements in x : ");
       /// int x = sc.nextInt();
        for(int i=0;i<x.length;i++){
          //  System.out.println(x.);
            x[i] = sc.nextInt();

        }
        System.out.println("Enter the elements in y : ");
        for(int i=0;i<x.length;i++){
            y[i] = sc.nextInt();
        }
        boolean result = isDirectlyProportional(x,y);
        if(result){
            System.out.println("x and y are directly proportional");
        }
        else{
            System.out.println("x and y are not proportional");
        }
    }
}
//public class DirectlyProportional {
//}
