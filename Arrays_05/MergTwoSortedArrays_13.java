package Arrays_05;
import java.util.Scanner;
public class MergTwoSortedArrays_13{
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements you want in the array 1 : ");
        int n1 = sc.nextInt();
        System.out.print("Enter the elements you want in the array 1 : ");
        int[] arr1 = new int[n1];
        for(int i = 0 ; i < n1 ; i++){
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter the number of elements you want in the array 2: ");
        int n2 = sc.nextInt();
        System.out.print("Enter the number of elements you want in the array 2: ");
        int[] arr2 = new int[n2];
        for(int i = 0 ; i < n2 ; i++){
            arr2[i] = sc.nextInt();
        }

        int[] arr3 = new int[n1+n2];
        int  i = 0;
        int j = 0;
        int k = 0;
       while(i < n1 && j < n2){
                      if(arr1[i] <= arr2[j]){
                        arr3[k] = arr1[i];
                        i++;
                        k++;
                      }
                      else{
                        arr3[k] = arr2[j];
                        j++;
                        k++;
                      } 
                }
                     if(i == n1){
                        while(j < n2){
                           arr3[k] = arr2[j];
                        j++;
                        k++; 
                        }
                     }
                       if(j == n2){
                        while(i < n1){
                           arr3[k] = arr1[i];
                        i++;
                        k++; 
                        }
                     }
            for(int a= 0 ; a < n1+n2; a++){
                System.out.print(arr3[a] + " ");
            }
        
     }
    
}
