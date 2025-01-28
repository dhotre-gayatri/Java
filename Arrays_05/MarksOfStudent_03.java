package Arrays_05;

import java.util.Scanner;

public class MarksOfStudent_03 {

     public static void main(String[] args) {

        // here size of the array means total number of students
        System.out.println("Enter the total number of subjects : ");
        Scanner sc = new Scanner(System.in);
        int no_of_students = sc.nextInt();

        // array declaration
        int[] arr = new int[no_of_students];


         // initializing marks in the array
         System.out.println("Enter the Marks of Student : ");
       for (int i = 0 ; i <= no_of_students-1; i++)
        {
            arr[i] = sc.nextInt();
        }


        // here we will print the index number if the students marks are less that 35
       for( int i = 0 ; i <= no_of_students-1 ; i++)
       {
           if(arr[i] < 35 )
           {
               System.out.print(i + " ");
           }
       }
sc.close();
    }
    
}
