package Arrays_05;
import java.util.Scanner;
public class Passing_Array_To_Methods_07{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of elements you want to add : ");
        int ele = sc.nextInt();
        int[] arr = new int[ele];
        
        System.out.println("Enter elements for array : ");
        for(int  i = 0 ; i < ele ; i++){
            arr[i] = sc.nextInt();
        }

        change(arr);
        System.out.println(arr[0]);
    }
    public static void change(int[]x){ // here x is reference variable of arr it means that x is an another name of arr 
        x[0] = 90;
    }
    
}

// if we do same thing with integer value insted of array then this become pass by value