package Arrays_05;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLists_18 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       ArrayList<Integer> arr = new ArrayList<>(6);
       arr.add(0, 10);
       arr.add(1, 20);
       arr.add(2, 30);
       arr.add(3, 40);
       arr.add(4, 50);
       arr.add(5, 60);

       for(int i = 0 ; i < arr.size(); i++ ){
        System.out.println(arr.get(i) + " ,");
       }

       arr.set(2, 300);
       for(int i = 0 ; i < arr.size(); i++ ){
        System.out.print(arr.get(i) + " ,");
       }



    }
    
}
