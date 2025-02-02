package OOPS;
import java.util.*;
class Account{
  Scanner sc = new Scanner(System.in);
    // access modifire is private for data security
    private double balance;
   
   
    // withdrawing the money
    public double getter(double balance){
      System.out.println("Enter Valid username : ");
      String username = sc.nextLine();
      System.out.println("Enter Valid password : ");
      String password = sc.nextLine();
      if(validate(username,password)==true){
            this.balance = this.balance - balance;
            System.out.println(this.balance + ", is debited from the account");
            return balance;
          }
          else{
            System.out.println("Please enter valid username and password");
            return 0.0;
          }
        
    } 


    
    // depositing the money
    public void setter(double balance){
      System.out.println("Enter Valid username : ");
      String username = sc.nextLine();
      System.out.println("Enter Valid password : ");
      String password = sc.nextLine();
      if(validate(username,password)==true){
        this.balance = this.balance + balance;
        System.out.println(this.balance + ", is Credited to the account");
      }
      else{
        System.out.println("Please enter valid username and password");
      }
        
    }


    
    // for authentication
    public boolean validate (String username, String password){
        return username.equals("gayatridhotre") && password.equals("dhotregayatri");
    }

}



public class Account_01 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
       Account ac = new Account();
       System.out.println("Enter the amount : ");
       double amt = sc.nextDouble();
       ac.setter(amt);
       System.out.println("Enter the amount : ");
       amt = sc.nextDouble();
       ac.getter(amt);
       System.out.println("Enter the amount : ");
       amt = sc.nextDouble();
       ac.setter(amt);
       sc.close();

      }

  }
