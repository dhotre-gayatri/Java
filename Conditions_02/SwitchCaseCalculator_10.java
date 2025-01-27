package Conditions_02;

import java.util.Scanner;

public class SwitchCaseCalculator_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b;
        char op;
        a = sc.nextDouble();
        op = sc.next().charAt(0);
        b = sc.nextDouble();
//Using Simple if
       /* if(op == '+')
        {
            System.out.println(a + b);
        }
        if(op == '-')
        {
            System.out.println(a + b);
        }
        if(op == '*')
        {
            System.out.println(a + b);
        }
        if(op == '/')
        {
            System.out.println(a + b);
        }*/
             // Using Switch Case
        switch (op)
        {
            case '+' :  System.out.println(a + b); break;
            case '-' :  System.out.println(a - b); break;
            case '*' :  System.out.println(a * b); break;
            case '/' :  System.out.println(a / b); break;
        }
sc.close();
    }
}
