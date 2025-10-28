package Pattern_Printing_08;

import java.util.Scanner;

public class Horizontally_Filpped_Triangles_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int r = sc.nextInt();
    


    // 1️⃣ Star Horizontally Flipped Triangle
    // * 
    // * * 
    // * * * 
    // * * * * 
    // * * * * *
    for(int i = 1; i <= r; i++){
           for(int j = 1 ; j <= i; j++){
            System.out.print('*' + " ");
           }
           System.out.println();
    }   
    
    System.out.println();




    // 2️⃣ Numbers Horizontally Flipped Triangle
    // 1
    // 1 2
    // 1 2 3
    // 1 2 3 4
    // 1 2 3 4 5
    for(int i = 1; i <= r; i++){
           for(int j = 1 ; j <= i; j++){
            System.out.print(j + " ");
           }
           System.out.println();
    }   
    
    System.out.println();




    // 3️⃣ Alphabets Horizontally Flipped Triangle
    // A
    // A B
    // A B C
    // A B C D
    // A B C D E
    for(int i = 1; i <= r; i++){
           for(int j = 1 ; j <= i; j++){
            System.out.print((char)(j+64) + " ");
           }
           System.out.println();
    }   
    
    System.out.println();


    // 4️⃣ Aplhabets Horizontally Flipped Triangle
    // a
    // a b
    // a b c
    // a b c d
    // a b c d e
    for(int i = 1; i <= r; i++){
           for(int j = 1 ; j <= i; j++){
            System.out.print((char)(j+96) + " ");
           }
           System.out.println();
    }   
    
    System.out.println();



    // 5️⃣ Numbers on Odd and Alphabets on even Horizontally Flipped Triangle
    // 1
    // a b
    // 1 2 3
    // a b c d
    // 1 2 3 4 5
    for(int i = 1; i <= r; i++){
           for(int j = 1 ; j <= i; j++){
            if(i%2!=0){
                System.out.print(j + " ");
            }
            else{
                System.out.print((char)(j+96) + " ");
            }
           }
           System.out.println();
    }   
    
    System.out.println();


    }
    
}
