package Conditions_02;

import java.util.Scanner;

public class RectanglePerimeterArea_04 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double length, breadth;
        System.out.print("Enter Length of Rectangle :");
        length = sc.nextDouble();

        System.out.print("Enter Breadth of Rectangle :");
        breadth = sc.nextDouble();

        double area = length * breadth ;
        double perimeter = (length + breadth) * 2 ;

        if(area > perimeter)
        {
            System.out.println("Area is greater than perimeter");
        }
        else {
            System.out.println("Perimeter is greater than area");
        }
sc.close();
    }
}
