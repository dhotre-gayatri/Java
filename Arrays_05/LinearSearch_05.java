package Arrays_05;

import java.util.Scanner;

public class LinearSearch_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of elements you want to add in the array :");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
         arr[i] = sc.nextInt();   
        }
        System.out.println("Enter the element you want to search in the array :");
        int ele = sc.nextInt();

        for (int i = 0; i < n; i++) {
         if(ele == arr[i]){
            System.out.println("Index of the element is :" + i);
            
         }  
        }

    }
}