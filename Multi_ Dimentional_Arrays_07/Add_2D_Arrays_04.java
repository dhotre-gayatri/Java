import java.util.Scanner;

public class Add_2D_Arrays_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter no. of Rows :");
        int m= sc.nextInt();

        System.out.print(" Enter no. of Rows :");
        int n= sc.nextInt();

        
        int[][] arr1 = new int[m][n]; // arr1
        int[][] arr2 = new int[m][n]; // arr2
        int[][] arr3 = new int[m][n]; // arr3

        // Input of the 2Dimentional Array arr1
        for(int i = 0; i < m; i++)// rows
        {
            for(int j = 0; j < n; j++)// columns
            {
                arr1[i][j] = sc.nextInt();
            }
        }


         // Input of the 2Dimentional Array arr2
        for(int i = 0; i < m; i++)// rows
        {
            for(int j = 0; j < n; j++)// columns
            {
                arr2[i][j] = sc.nextInt();
            }
        }

        
        // Output of the 2Dimentional Array arr1
        System.out.println("Roll number and Marks of the students are :");
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }


        // Output of the 2Dimentional Array arr2
        System.out.println("Roll number and Marks of the students are :");
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }


        // Addition of the 2Dimentional Array in arr3
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                arr3[i][j] = arr1[i][j] + arr2[i][j];
            }
            System.out.println();
        }


        System.out.println("Addition of arr1 and arr2 are :");
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }

    }
    
}
