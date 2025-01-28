package Methos_04;


class Calculator{
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

public class NoParameterNoReturnType_01 {
    public static void main(String[] args){
        Calculator C = new Calculator();
        C.add();
    }
} 
