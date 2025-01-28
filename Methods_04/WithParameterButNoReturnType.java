package Methods_04;

class Calculatorrr{

    int result;

       void add(int x , int y){
        result = x + y ;
        System.out.println(result);
       }
}


public class WithParameterButNoReturnType {
    public static void main(String[] args) {
        Calculatorrr C = new Calculatorrr();
        C.add(10,20);
        
    }
}


