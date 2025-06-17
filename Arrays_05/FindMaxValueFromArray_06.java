package Arrays_05;
import java.util.Scanner;

public class FindMaxValueFromArray_06{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no. of elements you want to add in the array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i< n ;i++){
            arr[i] = sc.nextInt();
        }
        int max = -2147483; 
        for(int i = 0; i< n ;i++){
            if(arr[i] > max ){
                max = arr[i];
            }
        
        }
        System.out.println("Max value is : " + max);
    }
}