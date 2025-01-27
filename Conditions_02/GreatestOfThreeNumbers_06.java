package Conditions_02;

import java.util.Scanner;

public class GreatestOfThreeNumbers_06 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c;
        System.out.println("Enter Number for A : ");
        a = sc.nextDouble();

        System.out.println("Enter Number for B : ");
        b = sc.nextDouble();

        System.out.println("Enter Number for C : ");
        c = sc.nextDouble();

        if(a > b && a > c)
        {
            System.out.println("The number A is greater");
        }
        else if(b > a && b > c)
        {
            System.out.println("The number B is greater");
        }
        else if(c > b && c > a)
        {
            System.out.println("The number C is greater");
        }
        else
        {
            System.out.println("All A B C are equal");
        }
sc.close();
    }
}
