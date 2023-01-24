package org.practice;

import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        String s1, s2;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first sting");
        s1=sc.nextLine();

        System.out.println("enter the second string");
        s2=sc.nextLine();

        if(s1.compareTo(s2)>0)
            System.out.println("first sting is greater than second");
        else if (s1.compareTo(s2)<0)
            System.out.println("first string is smaller than second");
        else
            System.out.println("both strings are equal");

    }
}
