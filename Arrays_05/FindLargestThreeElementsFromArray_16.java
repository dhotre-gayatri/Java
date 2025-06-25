package Arrays_05;

import java.util.Scanner;
public class FindLargestThreeElementsFromArray_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of elements you want in the array  : ");
        int n = sc.nextInt();
        System.out.print("Enter the elements you want in the array  : ");
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }

    int max = -24138789;
    int smax = -24138789;
    int tmax = -24138789;
    
    for(int i= 0 ;i < n; i++){
        if(arr[i] > max){
            max = arr[i];
        }
    }

    for(int i= 0 ;i < n; i++){
        if(arr[i] > smax && arr[i] !=max){
            smax = arr[i];
        }
    }

    for(int i= 0 ;i < n; i++){
        if(arr[i] > tmax && arr[i] != max && arr[i] != smax){
            tmax = arr[i];
        }
    }
      System.err.println("The three largest elements are : " + max + " " + smax + " " + tmax);    
    }
    
}
