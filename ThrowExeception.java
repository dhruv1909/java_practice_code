package org.practice;

public class ThrowExeception {
    static void validate(int age) {
        if (age<18)
            throw new ArithmeticException("you are to young!");
        else
            System.out.println("yolo,Welcome to club");
    }

    public static void main(String[] args) {
        validate(13);
    }
}
