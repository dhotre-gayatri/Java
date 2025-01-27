package Conditions_02;

import java.util.Scanner;

public class EvenOdd_01 {
     public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n ;
        System.out.print("Enter the Number :");
        n = sc.nextInt();

        if(n % 2 == 0)
        {
            System.out.println("Number is Even!!!");
        }
        else
        {
            System.out.println("Number is Odd!!!");
        }
sc.close();
    }
}
