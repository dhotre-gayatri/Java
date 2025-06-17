package Arrays_05;
import java.util.Scanner;
public class SumOfElementsInArray_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of elements you want to add in the array :");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements of Array : ");
        for (int i =0; i < n; i++) {

            arr[i] = sc.nextInt();
        }

        int sum = 0;
         for (int i = 0; i < n; i++) {
             sum += arr[i];
             
         }
         System.out.println("Sum is :" + sum);


    }
}