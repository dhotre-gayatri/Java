package Loops_03;

import java.util.Scanner;

public class CompositNumbers_04 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Print 1 , 2, 4 , 8 , 16 , 32...n
        System.out.println("Enter the value of N : ");
        int n = sc.nextInt();
        int x = 0;
        // Composit Numbers are the number that they can be divided by 1 and at least one any other number
        /*
        //Method 1
        for(int i = 2 ; i <= n-1 ; i++){
            if(n % i == 0)
            {
                System.out.println("Composite Number");
                break;
            }
            else {
                System.out.println("Prime Number");
                break;
            }

        }*/

        // Method 2 Using flag in this case x is a flag
        for (int i = 2 ; i <= n-1 ; i++) {
            if (n % i == 0) {
                System.out.println("Composite Number");
                x = 1;
                break;

            }
        }
            if(x == 0)
            {
                System.out.println("Prime Number");
            }
sc.close();
        }

}
