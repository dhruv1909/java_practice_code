package org.practice;

public class GarbageCollection {
    public static void main(String[] args) throws Exception
    {
        Runtime r = Runtime.getRuntime();
        System.out.println("free memory in jvm before garbage collection =" +r.freeMemory());
        r.gc();
        System.out.println("free memory in jvm after garbage collection = "+r.freeMemory());

    }
}
