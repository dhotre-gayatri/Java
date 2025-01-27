package Loops_03;

import java.util.Scanner;

public class ArithmeticProgression_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value of N :");
        int n = sc.nextInt();
        int b = 3;
        /* 
        Method 1 :Print A.P of 3, 5, 7, 9,.......,n

        for(int i = 3 ; i <= 2*n - 1; i+=2 )
        {
            System.out.println(i);
        }*/


        
        // Method 2 : Print A.P of 3, 5, 7, 9,.......,n
        for(int i = 0 ; i <= n ; i++)
       {
           System.out.println(b);
           b +=2;
       }

sc.close();
    } 
}
