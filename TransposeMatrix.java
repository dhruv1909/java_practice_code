package org.practice;

import java.util.Scanner;

public class TransposeMatrix {
    public static void main(String[] args) {

        int a,b,c,d;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of columns and rows of matrix.");
         a=sc.nextInt();
         b=sc.nextInt();

         int matrix[][]= new int [a][b];
        System.out.println("enter the element of matrix");

        for (c=0; c<a; c++)
            for (d=0; d<b; d++)
                matrix[c][d]=sc.nextInt();
        int transpose [][]= new int [b][a];

        for(c=0;c<a;c++)
        {
            for (d=0;d<b;d++)
                transpose[d][c]= matrix[c][d];
        }
        System.out.println("transpose of entered matrix");
        for (c=0; c<b; c++)
        {
            for (d=0;d<a;d++)
                System.out.println(transpose[c][d]+"\t");
            System.out.println("\n");
        }
    }
}
