package org.practice;

public class StringMethods {
    public static void main(String[] args) {
        int n;
        String s= "java programming", t = "", u="";
        System.out.println("s");

        // find length of string
        n= s.length();
        System.out.println("number of characters =" +n);

        //replace character in string
        t=s.replace("java", "c++");
        System.out.println(s);
        System.out.println(t);

        //concatenating string with another

        u=s.concat("is fun");
        System.out.println(s);
        System.out.println(u);
    }
}
