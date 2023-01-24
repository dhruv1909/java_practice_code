package org.practice;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        int x;
        System.out.println("enter the number to check odd or even");

        Scanner sc = new Scanner(System.in);
        x=sc.nextInt();

        if( x%2==0)
            System.out.println("the number is an even");
        else
            System.out.println("the number is an odd");

    }
}
