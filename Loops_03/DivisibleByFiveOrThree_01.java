package Loops_03;

import java.util.Scanner;

public class DivisibleByFiveOrThree_01 {
    public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   int n;
    // Printing table of 3 and 5 both together

   /* for (int i = 0 ; i <= 100 ; i++)
    {
        if(i % 5 == 0 || i % 3 == 0)
        {
            System.out.println(i);
        }

    }*/
    // PrintingTable of 19
     /*for( int i = 19 ; i <= 190 ; i+= 19)
     {
         System.out.println(i);
     }*/

        //Printing the table of n
        System.out.println("Enter the value of N : ");
        n = sc.nextInt();
        for(int i = n ; i <= n*10 ; i+=n)
        {
            System.out.println(i);
 
    }
sc.close();    
  }
}
