package org.practice;

import java.util.Scanner;

public class NestedIfElse {
    public static void main(String[] args) {
        int markObtained, passingMarks;
        char grade;

        passingMarks=40;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the marks you've got into exam");

        markObtained=sc.nextInt();
        if(markObtained>=passingMarks) {
            if (markObtained > 90)
                grade = 'A';
            else if (markObtained > 75)
                grade = 'B';
            else if (markObtained > 60)
                grade = 'C';
            else
                grade = 'D';
            System.out.println("Congratulation, you pass the exam with grade " + grade);

        }
        else {
            grade='F';
            System.out.println("Sorry, you failed the exam. :(");
        }
    }
}
