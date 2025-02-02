package OOPS;

import java.util.*;


class Student{
    private int roll_no;
    private String name;
    private int marks;
    
    public void set_roll_no(int roll_no){
        this.roll_no = roll_no;

    }
    public void set_name(String name){
        this.name = name;
    }
    public void set_marks(int marks){
        this.marks = marks;
    }
    public int get_roll_no(){
        return roll_no;
    }
    public String get_name(){
        return name;
        
    }
    public int get_marks(){
        return marks;
        
    }
}

public class Student_02{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student S = new Student();
        System.out.print("Enter Roll Number : ");
        int r = sc.nextInt();
        System.out.println();
        S.set_roll_no(r);

        System.out.print("Enter name : ");
        String n = sc.next();
        System.out.println();
        S.set_name(n);


        System.out.print("Enter marks : ");
        int m = sc.nextInt();
        System.out.println();
        S.set_marks(m);

        System.out.println(S.get_roll_no());
        System.out.println(S.get_name());
        System.out.println(S.get_marks());

sc.close();
    }
}