package org.practice;

import java.util.Scanner;

public class BreakContinueWhileLoop {
    public static void main(String[] args) {
        int n;

        Scanner sc= new Scanner(System.in);
        while(true){
            System.out.println("inter an integer");
            n=sc.nextInt();

            if(n!=0) {
                System.out.println("you entered" + n);
                continue;
            }
            else
                break;
            }
        }
    }

