package com.aruntech._01_operators;

import java.util.Scanner;

/**
 * Convert Fahrenheit value to Celsius
 * E.g: f=100 output is 37
 */
public class ConvertFahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Fahrenheit value:");
        int f = sc.nextInt();
        int c = (f-32) * 5/9;
        System.out.println("Celsius value of Fahrenheit value "+f+" is "+c);
        sc.close();
    }
}
