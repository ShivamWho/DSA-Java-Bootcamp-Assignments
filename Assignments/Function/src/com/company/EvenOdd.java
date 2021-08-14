package com.company;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number");
        int num = in.nextInt();
        if (checkEvenOdd(num)) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }
    }

    static boolean checkEvenOdd(int num) {
        return num % 2 == 0;
    }
}
