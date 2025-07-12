package Strings_06;

public class UpdateAllTheEvenPositionStringToA_08 {
    public static void main(String[] args) {
        String s = "Physics Wallah"; 
        String t = "";

        for(int i = 0; i < s.length(); i++) {
            
            if(i%2==0){
               t= t+ "a";
            }
            else{
                t = t + s.charAt(i);
            }
            
        }
        System.out.println(t);
    }
    
}
