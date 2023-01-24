package org.practice;

import java.math.BigInteger;
import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {
        int x,y,z;
        System.out.println("enter the numbers to calculate their sum");

        Scanner sc= new Scanner(System.in);
        x=sc.nextInt();
        y=sc.nextInt();
        z=x+y;
        System.out.println("sum of those x and y "+z);
    }
}

// for large numbers

class AddingLargeNumbers{
    public static void main(String[] args) {
        String number1, number2;
        Scanner sc= new Scanner(System.in);

        System.out.println("enter the first number");
        number1= sc.nextLine();

        System.out.println("enter the second number");
        number2=sc.nextLine();

        BigInteger first = new BigInteger(number1);
        BigInteger second = new BigInteger(number2);
        BigInteger sum;

        sum = first.add(second);
        System.out.println("result of sum is "+sum);

    }
}
