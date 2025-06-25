package Strings_06;

import java.util.Scanner;

public class WhatIsCharAtAndLength_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter any String : ");
        String s = sc.nextLine();
        System.out.println(s.charAt(5)); // charAt(index) is used to find element at the given index 
        System.out.println(s.length()); // length() is used to measure the length of string

        // indexOf('character')
        // System.out.println(" Enter any String : ");
        // String s = sc.nextLine();  
        // System.out.println(s.indexOf('a')); // we use indexOf('character') to find index of that given character


        // compareTo()
        // String a = "abc";
        // String b = "aac";
        // System.out.println(a.compareTo(b)); // we use compareTo() to compare Two strings Lexographically means it checks two strings charater by character and subtracts their ascii values
    }
    
}
