package Methos_04;

class Calculator{
    int a;
    int b;
    int result;

       int add(){
        a = 10;
        b = 20;
        result = a + b ;
        return result;
       }
}
public class NoParameterButReturnValue_02 {
    public static void main(String[] args) {
        Calculator C = new Calculator();
        int sum = C.add();
        System.out.println(sum);
    }
}
