import java.util.Scanner;

public class Print_2D_Array_in_Wave_Format_08 {
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

        // // Converting into wave format
        // for(int i = 1; i < n; i++){
        //     int a = 0;
        //     int b = n-1;
        //     if(i%2 != 0){
        //     while(a<b){
        //         int temp = arr[i][a];
        //         arr[i][a] = arr[i][b];
        //         arr[i][b] = temp;
        //         a++;
        //         b--;
        //     }}
        //     System.out.println();
        // }

        // ⬆️⬆️⬆️⬆️⬆️⬆️
        // above code will give answer like this
        // 1 2 3 4
        // 8 7 6 5
        // 9 10 11 12 
        // 16 15 14 13
        




        // Converting into wave format
        for(int i = 0; i < n; i++){
            int a = 0;
            int b = n-1;
            if(i%2 == 0){
            while(a<b){
                int temp = arr[i][a];
                arr[i][a] = arr[i][b];
                arr[i][b] = temp;
                a++;
                b--;
            }}
            System.out.println();
        }

          // ⬆️⬆️⬆️⬆️⬆️⬆️
        // above code will give answer like this
        // 4 3 2 1
        // 5 6 7 8
        // 12 11 10 9 
        // 13 14 15 16


        // Output of the Converted into wave format of 2Dimentional Array
        System.out.println("Converted into wave format of 2Dimentional Array");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
    
}
