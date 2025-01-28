package Arrays_05;
import java.util.*;
public class EffecientArray_02 {
    public static void main(String[] args) {
        // we will declare scanner object to get input from keyboard
        Scanner sc = new Scanner(System.in);

        // getting the size of the array
        System.out.print("Enter size of array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        //getting elements or values with loop
        System.out.print("Enter elements of array : ");
        for(int i = 0 ; i < size ; i++){
             arr[i] = sc.nextInt();
        }
        //displaying or printing the array
        System.out.print ("Printing Array : ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
sc.close();
    }
}
