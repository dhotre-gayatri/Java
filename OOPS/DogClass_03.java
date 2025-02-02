package OOPS;
import java.util.*;
class Dog{
    // Private Access Modifier for Security 
    // Security means we cannot access these private data directly but we must access it indirectly
    private String breed;
    private String color;
    private int price;

    // to access the private data we have methods (setter = takes the input data...this method does not return any value and getter = provied the resultant operation on private data using this getter method....remember this getter method alwys return a value)
    public void set_properties(String breed, String color, int price){
        this.breed = breed;
       
        this.color = color;
        
        this.price = price;
    }

    public String get_breed(){
        return breed;
    }

    public String get_color(){
        return color;
    }

    public int get_price(){
        return price;
    }

}

public class DogClass_03{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Dog D = new Dog();

        String breed;
        System.out.print("Enter the Dog Breed : ");
        breed = sc.nextLine();
        System.out.println();


        String color;
        System.out.print("Enter the Dog Colour : ");
        color = sc.next();
        System.out.println();


        int price;
        System.out.print("Enter the Dog price : ");
        price = sc.nextInt();
        System.out.println();


        D.set_properties(breed, color, price);


        System.out.println("the breed of dog is : " + D.get_breed());
        System.out.println("The Color of Dog is : " + D.get_color());
        System.out.println("The price of Dog is : " + D.get_price());
    
sc.close();
    }
}