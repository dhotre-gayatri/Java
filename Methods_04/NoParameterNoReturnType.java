package Methods_04;

class Calculatorr{
    int a;
    int b;
    int result;

       void add(){
        a = 10;
        b = 20;
        result = a + b ;
        System.out.println(result);
       }
}
public class NoParameterNoReturnType {
    public static void main(String[] args) {
        Calculatorr C = new Calculatorr();
        C.add();
        
    }
}
