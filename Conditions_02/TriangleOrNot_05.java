package Conditions_02;

import java.util.Scanner;

public class TriangleOrNot_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a , b , c ;
        System.out.println("Enter Number for A : ");
        a = sc.nextDouble();

        System.out.println("Enter Number for B : ");
        b = sc.nextDouble();

        System.out.println("Enter Number for C : ");
        c = sc.nextDouble();

        if(c < a + b && a < c + b && b < a + c)
        {
            System.out.println("It is Triangle");
        }
        else {
            System.out.println("It is not Triangle ");
        }
sc.close();
    }
    
}
