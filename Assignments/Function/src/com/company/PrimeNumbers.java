package com.company;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number");
        int num1 = in.nextInt();
        int num2 = in.nextInt();

        for (int i = num1; i <= num2; i++) {
            if (checkPrime(i)) {
                System.out.println(i);
            }

        }

    }

    static boolean checkPrime(int num) {
        if (num <= 1) {
            return false;
        }
        int c = 2;
        while (c * c <= num) {
            if (num % c == 0) {
                return false;
            }
            c++;
        }
        return c * c > num;
    }
}
