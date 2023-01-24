package org.practice;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        int marksObtained, passingMarks;
        passingMarks=40;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the marks you've got ");

        marksObtained=sc.nextInt();

        if(marksObtained>=passingMarks){
            System.out.println("congratulation you passed the exam.");
        }
        else {
            System.out.println("sorry, you failed into the exam. :(");
        }

    }
}
