package Conditions_02;

import java.util.Scanner;

public class ProfitLoss_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double cp, sp ;
        System.out.println("Enter Cost Price :");
        cp = sc.nextDouble();
        System.out.println("Enter Selling Price :");
        sp = sc.nextDouble();


        double p = sp - cp ;
        double l = cp - sp ;
        if(sp > cp){
            System.out.println("Profit : " + p);
        }
        else if (cp > sp ){
            System.out.println("Loss : " + l);
        }
        else{
            System.out.println("No Profit No Loss");
        }
sc.close();
    }
}
