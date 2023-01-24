package org.practice;


import java.util.*;

// WAP
public class Loop {

    public static void main(String[] args) {
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the casw which you want to check");
        s = sc.nextLine();
        // == EQUAL TO
        // != NOT EQUAL TO
        // || OR
        // && AND
        switch (s) {
            case "vish":
                System.out.println("my name is vish");
                break;
            case "dhruv":
                System.out.println("dhruv");
                break;
            default:
                System.out.println("nobody");
        }
//        String[] array = {"vish", "dhruv", "aniket"};
//
//        for (int i = 0; i < array.length; i++) {
//
//
//        }

    }

}
