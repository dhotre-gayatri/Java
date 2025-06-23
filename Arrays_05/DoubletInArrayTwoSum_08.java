package Arrays_05;

import java.util.Scanner;

public class DoubletInArrayTwoSum_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of elements you want to add in the array :");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter elements of Array : ");
        for (int i =0; i < n; i++) {

            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();
      for(int  i = 0 ; i < n ; i++){
        for(int j = i+1 ; j < n ; j++){
            if(arr[i] + arr[j] == target){
                System.out.println("The Target Number Sum is : " + arr[i] + " " + arr[j] + " ");
            }
        }
      }

    }
}