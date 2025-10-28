package Pattern_Printing_08;
import java.util.Scanner;

public class R_cross_C_Stars_Printing_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int r = sc.nextInt();
    int c = sc.nextInt();


    // 1️⃣ Star Square or Rectangle 
    // * * * * *
    // * * * * *
    // * * * * *
    // * * * * *
    for(int i = 0; i < r; i++){
           for(int j = 0 ; j < c; j++){
            System.out.print('*' + " ");
           }
           System.out.println();
    }   
    
    System.out.println();

    // 2️⃣ Number Square or Rectangle 
    // 1 2 3 4
    // 1 2 3 4
    // 1 2 3 4
    // 1 2 3 4

    for(int i = 0; i < r; i++){
           for(int j = 0 ; j < c; j++){
            System.out.print(j + " ");
           }
           System.out.println();
    } 
    
    
      System.out.println();


    // 3️⃣ Alphabetical Square or Rectangle 
    // A B C D
    // A B C D
    // A B C D
    // A B C D

    for(int i = 0; i < r; i++){
           for(int j = 0 ; j < c; j++){
            System.out.print((char)(j+ 65) + " ");
           }
           System.out.println();
    } 

 System.out.println();

    // 4️⃣ Alphabetical Square or Rectangle 
    // a b c d
    // a b c d
    // a b c d
    // a b c d

    for(int i = 0; i < r; i++){
           for(int j = 0 ; j < c; j++){
            System.out.print((char)(j+ 97) + " ");
           }
           System.out.println();
    } 



    
    }
    
}
