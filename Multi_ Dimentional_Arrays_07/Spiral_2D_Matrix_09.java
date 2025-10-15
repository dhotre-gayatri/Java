import java.util.Scanner;

public class Spiral_2D_Matrix_09 {
        
    public static void main(String[] args) {
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
        System.out.println("Simple 2Dimentional Array");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
