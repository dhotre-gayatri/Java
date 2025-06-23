package Arrays_05;

import java.util.Scanner;

public class SortZerosAndOnesFromArray_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of elements you want to add in the array :");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter elements of Array : ");
        for (int i =0; i < n; i++) {

            arr[i] = sc.nextInt();
        }

        int noOfZeros = 0, noOfOnes = 0;

        for(int i = 0 ; i < n ; i++){
            if(arr[i]==0){
                noOfZeros++;
            }
            else{
                noOfOnes++;
            }
        }

        for (int i = 0; i < noOfZeros; i++) {
            arr[i] = 0;
        }
        for (int i = noOfZeros; i < n; i++) {
            arr[i] = 1;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
            
        }
    
}
}