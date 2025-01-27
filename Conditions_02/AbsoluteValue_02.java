package Conditions_02;

import java.util.Scanner;

public class AbsoluteValue_02 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n ;
        System.out.print("Enter the Number :");
        n = sc.nextInt();

        if(n<0)
        {
            System.out.println("Print : " + -n);
        }
        else{
            System.out.println("Else Print : " + n);
        }

sc.close();
    }
}
