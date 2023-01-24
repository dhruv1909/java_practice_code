package org.practice;

public class CompareString {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = "there";
        String s4 = "rethe";
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s3));
        System.out.println(s1.compareTo(s4));
    }
}
