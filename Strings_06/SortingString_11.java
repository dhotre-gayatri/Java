package Strings_06;
import java.util.Arrays;
public class SortingString_11 {
    public static void main(String[] args) {
      
        String s = "gayatri";
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        for (int i = 0; i < ch.length; i++) {
              System.out.print(ch[i]);
        }

    }
    
}
