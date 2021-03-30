import java.util.Scanner;

public class DisplayFibonacciSeries {

    public static void main(String[]args){
        int num1 = 0;
        int num2 = 1;
       int num = 0;

        System.out.println("enter the number we find upto the  fibonacci series ");
        Scanner sc = new Scanner(System.in);
         num = sc.nextInt();

        for (int i = 1; i<=num ; i++){
            System.out.println(num1+"");////doubt.................

           int  sum = num1+num2;
            num1 = num2;
            sum = num2;


        }
    }
}
