import java.util.Scanner;

public class Rotate_Array_to_Rigth_by_One_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int m = 0; m < n ; m++){
            arr[m] = sc.nextInt();
        }

System.out.println();
        int i = 0;
        int j = n-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }


        i = 0;
        j = n-2;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
      
         for(int m = 0; m < n ; m++){
            System.out.print( arr[m] + " "); 
        }
         System.out.println();

    }
}