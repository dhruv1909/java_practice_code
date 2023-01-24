package org.practice;

import java.util.Scanner;

public class AddTwoMatrix {
    public static void main(String[] args) {
        int a,b,c,d;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number of rows and columns of matrix");
        a=sc.nextInt();
        b=sc.nextInt();

        int first[][] = new int [a][b];
        int second[][]= new int [a][b];
        int sum[][]= new int[a][b];
        System.out.println("enter the element of first matrix");

        for ( c = 0 ; c < a ; c++ )
            for ( d = 0 ; d < b ; d++ )
                first[c][d] = sc.nextInt();
        System.out.println("enter the element of second matrix");

        for ( c = 0 ; c < a ; c++ )
            for ( d = 0 ; d < b ; d++ )
                second[c][d] = sc.nextInt();
        for ( c = 0 ; c < a ; c++ )
            for ( d = 0 ; d < b ; d++ )
                sum[c][d] = first[c][d] + second[c][d];
        System.out.println("Sum of entered matrices:-");
        for ( c = 0 ; c < a ; c++ ) {
            for (d = 0; d < b; d++)
                System.out.print(sum[c][d] + "\t");
            System.out.println();
        }
    }
}
