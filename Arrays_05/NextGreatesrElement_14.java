package Arrays_05;

import java.util.Scanner;

public class NextGreatesrElement_14 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements you want in the array 1 : ");
        int n = sc.nextInt();
        System.out.print("Enter the elements you want in the array 1 : ");
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }

        int[] ans = new int[n];
        for(int i = 0 ; i < n ; i++){
           // int max = -248984;
            for(int  j = i+1 ; j < n ; j++){
                if(arr[j]> arr[i]){
                    arr[i] = arr[j];
                }
                ans[i] = arr[i];
            }
        }

        for(int i = 0; i < n; i++) {
                System.out.println(ans[i] + " ");                
            }

    
    }
}
