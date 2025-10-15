//package Multi_Dimentional_Arrays_07;
import java.util.Scanner;

public class Find_Largest_Element_in_Array_03 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter No of Rows :");
      int n = sc.nextInt();

      System.out.println("Enter No of Columns :");
      int m = sc.nextInt();

      int[][] arr = new int[n][m];

      for(int i = 0; i < n; i++)
      {
        for(int j = 0; j < m; j++)
        {
            System.out.println("Enter Element of 2 Dimentional Array :");
            arr[i][j]= sc.nextInt();
        }
      }

      System.out.println("2 Dimentional Array :");
      for(int i = 0; i < n; i++)
      {
        for(int j = 0; j < m; j++)
        {
            System.out.print(arr[i][j] + " ");
           
        }
        System.out.println();
      }

      int max = -6792505;
      for(int i = 0; i < n; i++)
      {
        for(int j = 0; j < m; j++)
        {
            if(arr[i][j] >= max)
            {
               max = arr[i][j];
            }
           
        }
        
      }
      System.out.println("Maximum element is : "+ max);

    }
}
