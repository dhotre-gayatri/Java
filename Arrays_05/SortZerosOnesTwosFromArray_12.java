package Arrays_05;
import java.util.Scanner;
public class SortZerosOnesTwosFromArray_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements you want in the array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }

        int noOfZeros = 0, noOfOnes = 0, noOfTwos = 0;
       /*  for(int  i = 0 ; i < n ; i++ ){
            if(arr[i]==0){
                noOfZeros++;
            }
            if(arr[i]==1){
                noOfOnes++;
            }
            if(arr[i]==2){
                noOfTwos++;
            }
        }
        for(int i = 0 ; i < noOfZeros ; i++ ){
            arr[i] = 0;
        }
        for(int i = noOfZeros ; i < noOfZeros+noOfOnes ; i ++ ){
            arr[i] = 1;
        }
        for(int i = noOfZeros+noOfOnes; i < n ; i++){
            arr[i] = 2;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }*/

// Method : 2 

         for(int i = 0 ; i < n ; i++){
           if(arr[i]==0){
                noOfZeros++;
            }
            if(arr[i]==1){
                noOfOnes++;
            }
            if(arr[i]==2){
                noOfTwos++;
            }
         } 
            for(int i = 0 ; i < n ; i++){
               if(i < noOfZeros){
                 arr[i] = 0;
               }
                  else if(i < noOfZeros+noOfOnes){
                   arr[i] = 1;
                  }
                  else{
                  arr[i] = 2;}
            }
            for (int i = 0; i < n; i++) {
                System.out.println(arr[i] + " ");
                
            }


    }
    
}
