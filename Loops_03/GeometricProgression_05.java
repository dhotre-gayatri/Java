package Loops_03;

import java.util.Scanner;

public class GeometricProgression_05 {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Print 1 , 2, 4 , 8 , 16 , 32...n



        /*System.out.println("Enter the value of N : ");
        int n = sc.nextInt();
        int a = 1;
        for (int i = 0 ; i <= n ; i++)
        {
            System.out.println(a);
            a *= 2 ;
        }*/

        int  n = sc.nextInt();
        for (int i =0 ; i < n ; i++){
            for (int j = 0 ; j < i ; j++){
                System.out.println("Print Me");
            }
        }
sc.close();
    }
}
