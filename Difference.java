package org.practice;

public class Difference {
    public static void main(String[] args) {
        display(); // calling without object

        Difference t = new Difference();
        t.show(); // calling using object
    }
    static  void display(){
        System.out.println("programming is just fun....");

    }
    void show (){
        System.out.println("java is awesome and cool...");
    }
}
