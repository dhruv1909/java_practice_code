package org.practice;

import java.util.Scanner;

public class SwapNumbers2 {
    public static void main(String[] args)
    {
        int x,y;
        System.out.println("enter x and y");
        Scanner sc = new Scanner(System.in);

        x=sc.nextInt();
        y=sc.nextInt();

        System.out.println("before swapping \nx = "+x+"\ny = "+y);
        x= x+y;
        y=x-y;
        x=x-y;

        System.out.println("after swapping \nx = "+x+" \ny = "+y);
    }
}
