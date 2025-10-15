//package Multi_Dimentional_Arrays_07;
import java.util.*;

public class Store_RollNumber_and_Marks_of_Students_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter no. of Rows :");
        int m= sc.nextInt();

        
        int[][] arr = new int[m][2];

        // Input of the 2Dimentional Array
        for(int i = 0; i < m; i++)// rows
        {
            for(int j = 0; j < 2; j++)// columns
            {
                arr[i][j] = sc.nextInt();
            }
        }
        
        // Output of the 2Dimentional Array
        System.out.println("Roll number and Marks of the students are :");
        for(int i = 0; i < m; i++){
            for(int j = 0; j < 2; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
    
}
