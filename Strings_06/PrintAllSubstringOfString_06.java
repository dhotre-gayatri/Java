package Strings_06;

public class PrintAllSubstringOfString_06 {
    public static void main(String[] args) {
      
        String s = "ABCD";
        for(int i = 0; i < 5 ; i++){
            for(int j = i+1; j < 5 ; j++){
                System.out.println(s.substring(i,j));
            }

        }
         // in this substring(1,3) here 1 and 3 are index and in this 1 is inclusive means it ill print substring from 2 to 4



    }
    
}