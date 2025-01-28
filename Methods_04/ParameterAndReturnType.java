package Methods_04;

class Calculatorrrr{
   
    int result;

       int add(int x, int y){
        result = x + y ;
        return result;
       }
}
public class ParameterAndReturnType {
    public static void main(String[] args) {
        Calculatorrrr C = new Calculatorrrr();
        int sum = C.add(10,20);
        System.out.println(sum);
        
    }
}
