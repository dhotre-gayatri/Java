package Strings_06;

import java.util.Scanner;

public class ReturnTotalNumberOfDigitaInTheNumber_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int s = sc.nextInt();
        // // without inbuild function
        // String S = "" + s;
        // System.out.println(S.length());

        // with inbuilt function
        String k = Integer.toString(s);
        System.out.println(k.length());
    }
    
}
