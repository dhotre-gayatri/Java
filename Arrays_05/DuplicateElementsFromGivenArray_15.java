package Arrays_05;
import java.util.Scanner;
public class DuplicateElementsFromGivenArray_15{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of elements you want in the array  : ");
        int n = sc.nextInt();
        System.out.print("Enter the elements you want in the array  : ");
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
             for (int j = i+1 ; j < n; j++) {
                if(arr[i] == arr[j]){
                    count++;
                    System.err.println("Duplicate Elements are : " +  arr[i]);
                }
                 
             } 

        }
        System.out.println("The count of duplicate elements is : " + count);

    }
}