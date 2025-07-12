package Strings_06;

public class ToggleCharactersOfString_10 {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("GaYAtrI");

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int ascii = (int)c;
            if(ascii >= 65 && ascii <= 90){
                ascii = ascii + 32;
                c = (char)ascii;
                str.setCharAt(i, c);
            }
            else if(ascii >= 97 && ascii <= 122){
                ascii = ascii - 32;
                c = (char)ascii;
                str.setCharAt(i, c);
            }
            
        }
        System.out.println(str);
    }
    
}
