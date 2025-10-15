
import java.util.Scanner;


public class Print_Transpose_of_2D_Array_05 {
    public static void main(String[] args) {

        // Tanspose of the matrix means if we print array row and column wise then in the we will print it column and row wise that is mean transpose
        Scanner sc = new Scanner(System.in);

        System.out.print(" Enter no. of Rows :");
        int n = sc.nextInt();

        System.out.print(" Enter no. of Column :");
        int m = sc.nextInt();
        
        int[][] arr = new int[n][m];

        // Input of the 2Dimentional Array
        for(int i = 0; i < n; i++)// rows
        {
            for(int j = 0; j < m; j++)// columns
            {
                arr[i][j] = sc.nextInt();
            }
        }
        
        // Output of the 2Dimentional Array
        System.out.println("Simple Output of 2D Array:");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
System.out.println("Transpose of the 2D Array : ");
        int[][] arr2 = new int[m][n];
        for(int j = 0; j < m; j++){
            for(int i = 0; i < n; i++){
                arr2[j][i] = arr[i][j];
                System.out.print(arr2[j][i] + " ");
            }
            System.out.println();
        }

    }
    
}
