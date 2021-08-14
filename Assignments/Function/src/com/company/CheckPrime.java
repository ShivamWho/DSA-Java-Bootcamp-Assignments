package com.company;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter number");
        int num = in.nextInt();
        System.out.println(checkPrime(num));
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
