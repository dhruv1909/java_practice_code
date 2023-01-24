package org.practice;

import java.util.Scanner;

public class Largestno {
    public static void main(String[] args) {
        int x,y,z;
        System.out.println("enter three numbers");
        Scanner sc = new Scanner(System.in);

        x=sc.nextInt();
        y=sc.nextInt();
        z=sc.nextInt();

        if (x>y && x>z)
            System.out.println("first number is largest");
        else if (y>x && y>z)
            System.out.println("second number is largest");
        else if (z>x && z>y)
            System.out.println("third number is largest");
        else
            System.out.println("enter number are nit distinct");




    }
}
