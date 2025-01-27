import java.util.Scanner;

public class TypeCasting_06 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A number : ");
        int a = sc.nextInt();
        double b = (double) a ;
        System.out.println("Half is : "+ b/2 ) ;
sc.close();
    }
}
