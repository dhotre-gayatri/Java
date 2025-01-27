package Conditions_02;

import java.util.Scanner;

public class TernaryOperator_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n;
        System.out.println("Enter the Number : ");
        n = sc.nextDouble();
        System.out.println((n%2==0) ? "Even" : "Odd");
sc.close();
    }
}
