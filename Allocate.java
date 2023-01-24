package org.practice;

// WAP of advantage of finally in exception handling.
public class Allocate{
    public static void main(String[] args) {

        try {
            long data[]= new long[250000000];
        }
        catch(Exception e){
            System.out.println(e);

        }
        finally {
            System.out.println("finally block will execute as always");

        }
    }
}
