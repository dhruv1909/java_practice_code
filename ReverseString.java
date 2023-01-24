package org.practice;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        String original, reverse="";
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a string to reverse");
        original=sc.nextLine();

        int length=original.length();

        for(int i=length-1;i>=0;i--)
            reverse=reverse+original.charAt(i);
        System.out.println("reverse of entered string is:"+reverse);
    }
}

//using internal java method
class InteernalString{
    public static void main(String[] args) {
        StringBuffer a = new StringBuffer("java programming is fun");
        System.out.println(a.reverse());
    }
}

