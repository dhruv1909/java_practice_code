package org.practice;

import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        int c;
        Random r = new Random();

        // random int in 0 to 100

         for (c=1; c<=10; c++){
             System.out.println(r.nextInt(100));
         }

    }
}
