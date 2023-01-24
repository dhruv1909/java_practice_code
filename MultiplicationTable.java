package org.practice;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        int a,b;
        System.out.println("enter an integer to print it's table");
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        System.out.println("multiplication table of"+a+"is:-");
        for (b=1; b<=10; b++)
            System.out.println(a+"*"+b+"="+(a*b));

    }
}
