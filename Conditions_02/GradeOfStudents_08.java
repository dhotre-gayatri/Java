package Conditions_02;

import java.util.Scanner;

public class GradeOfStudents_08 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double per;
        System.out.println("Enter Your Percentage : ");
        per = sc.nextDouble();

        if( per >= 81 && per <=100 )
        {
            System.out.println("Excellent");
        }
        else if(per >= 61 && per <= 80)
        {
            System.out.println("Very Good");
        }
        else if(per >= 41 && per <= 60)
        {
            System.out.println("Average");
        }
        else
        {
            System.out.println("Fail");
        }
sc.close();
    }
}
