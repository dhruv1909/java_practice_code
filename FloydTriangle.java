package org.practice;

import java.util.Scanner;

public class FloydTriangle {
    public static void main(String[] args) {
        int n,num=1,c,d;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of rows of floyd's triangle you want");
        n=sc.nextInt();
        System.out.println("floyd's triangle :-");
        for (c=1; c<=n;c++)
        {
            for (d=1; d<=c;d++)
            {
                System.out.println(num+"");
                num++;
            }
            System.out.println();
        }

    }
}
