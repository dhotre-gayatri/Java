import java.util.Scanner;

public class SquareOfNumbers_04 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no1 ,sqr;
        System.out.print("Enter the Number : ");
        no1 = sc.nextInt();
        sqr = no1 * no1 ;
        System.out.println("Square of Number is : "+ sqr);
sc.close();
    }
}
