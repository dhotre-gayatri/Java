import java.util.Scanner;

public class CharDataType_08 {
     public static void main(String[] args) {
        // a b c d....z
        // A B C D....Z
        // 0 1 2 3....9
        // ! @ # $ % ^ & *.....

        //ACSII values
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Character : " );
        char ch = sc.next().charAt(0);
        System.out.println(ch +" : " + (int)ch);

sc.close(); 
    }
}
