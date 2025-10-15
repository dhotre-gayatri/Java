import java.util.Scanner;

public class Rotate_2D_Array_by_90_Degree_06 {
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
        System.out.println("Simple Output of 2D Array:");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        //Rotating Square of 2Dimentional Array means Transpose of the 2D Array without using extra Array
        for(int i = 0; i < n; i++){
            for(int j = 0; j <= i; j++){
                
                int temp = arr[i][j] ;
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }


        System.out.println("Rotated Square of 2Dimentional Array means Transpose of the 2D Array without using extra Array:");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        
    }
    
}
