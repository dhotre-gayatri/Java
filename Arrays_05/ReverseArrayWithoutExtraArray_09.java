package Arrays_05;

import java.util.Scanner;

public class ReverseArrayWithoutExtraArray_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of elements you want to add in the array :");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter elements of Array : ");
        for (int i =0; i < n; i++) {

            arr[i] = sc.nextInt();
        }
// Methode : 1

      /*for(int  i = 0 ; i < n/2 ; i++){
        int j = n-1-i;
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

      }
      for (int i = 0; i < n; i++) {
System.out.print(arr[i] + " ");
          
      }*/
//************************************************************************************* 
//Method : 2

      for(int  i = n-1 ; i >= 0 ; i--){
        System.out.print(arr[i] + " ");
      }

    }
}
    

