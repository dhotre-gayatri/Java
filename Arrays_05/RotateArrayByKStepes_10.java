package Arrays_05;

import java.util.Scanner;

public class RotateArrayByKStepes_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of elements you want to add in the array :");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter elements of Array : ");
        for (int i =0; i < n; i++) {

            arr[i] = sc.nextInt();
        }

        int  k  = sc.nextInt();
        k = k%n;
// reverse  whole array
        int start = 0;
        int  end = n-1;
        while(start < end){
            int temp = arr[start];
            arr[start]= arr[end];
            arr[end] = temp; 
            start++;
            end--;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
            
        }
        System.out.println();

        
// reverse k elements
          start = 0;
          end = k-1;
       while(start < end ){
            int temp = arr[start];
            arr[start]= arr[end];
            arr[end] = temp;
            start++;
            end--;
            
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

 
// reverse remaining elements
          start = k;
          end = n-1;
       while(start < end) {
            int j = n-1;
            int temp = arr[start];
            arr[start]= arr[end];
            arr[end] = temp; 
            start++;
            end--;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
            
        }
        
    
}
}