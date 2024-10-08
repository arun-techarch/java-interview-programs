package com.aruntech._03_conditional_loop;

import java.util.Scanner;

/**
 * program to print square of n numbers
 * cube of a = a*a*a
 * e.g: range=5 then print 1 8 27 64 125
 */
public class PrintCubeOfNNumbers {
    public static void main(String[] args) {
        System.out.println("Cube of N-Numbers:");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range of print cube numbers: ");
        int range = sc.nextInt();
        sc.close();

        if(range <= 0) {
            System.out.println("Invalid input!");
        } else {
            for(int i=1; i<=range; i++) {
                System.out.print((i*i*i) +" ");
            }
        }
    }
}
