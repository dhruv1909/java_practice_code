package org.practice;

import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        float temperature;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the temperature  in fahrenheit");
        temperature= sc.nextInt();

        temperature = (( temperature - 32) *5/9);
        System.out.println("Temperature is celsius =" + temperature);

    }
}
