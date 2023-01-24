package org.practice;

public class EnhancedForLoop {
    public static void main(String[] args) {
        int primes[] = {2,3,4,5,7,8,11};
        for(int i: primes) {
            System.out.println(i);
        }
    }
}

// for string
 class EnhancedForLoop1{
    public static void main(String[] args) {
        String languages[] = {"c", "java", "c++","python", ".net"};
        for (String sample: languages){
            System.out.println(sample);

        }
    }
}
