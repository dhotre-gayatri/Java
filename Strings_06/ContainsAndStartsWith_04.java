package Strings_06;

import java.util.Scanner;

public class ContainsAndStartsWith_04 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String s = sc.nextLine();
        int count = 0 ;
        for (int i = 0; i < s.length(); i++) {
            int ch = s.charAt(i);
          if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
             count++;
          }
            
        }
        System.out.println(count);
    }
    
}
