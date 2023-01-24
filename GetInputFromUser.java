package org.practice;

import java.util.Scanner;

public class GetInputFromUser {
    public static void main(String[] args) {

        int i;
        Float f;
        String s;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string");
        s = sc.nextLine();
        System.out.println("You entered string "+ s);

        System.out.println("Enter a int");
        i = sc.nextInt();
        System.out.println("You entered int  "+ i);

        System.out.println("Enter a float");
        f = sc.nextFloat();
        System.out.println("You entered float"+ f);

    }
}
