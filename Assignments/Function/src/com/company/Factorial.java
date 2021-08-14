package com.company;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter number");
        int num = in.nextInt();
        System.out.println("Factorial is " + factorial(num));
    }

    static int factorial(int num) {
        int sum = 1;
        for (int i = num; i >= 1; i--) {
            sum = sum * i;
        }
        return sum;
    }
}
