package Arrays_05;

import java.util.Scanner;

public class CountNumberOfElementsInTheArrayGreaterThanTarget_14 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements you want in the array 1 : ");
        int n = sc.nextInt();
        System.out.print("Enter the elements you want in the array 1 : ");
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the 'x' value so based on that you can find numbers of greater values : ");
        int x = sc.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
                  if(arr[i] > x ){
                    count++;
                  }            
        }
        
            System.out.println("Number of greater elemets are : " + count);
            
    
}
}