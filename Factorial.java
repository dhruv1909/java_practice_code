package org.practice;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int a, b, fact=1;

        System.out.println("enter the no to calculate it's factorial");
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();

        if(a<0)
            System.out.println("number should not be negative");
        else{
            for (b=1; b<=a; b++)
                fact = fact*a;
            System.out.println("factorial of "+a+"is = "+fact);
        }


    }
}
