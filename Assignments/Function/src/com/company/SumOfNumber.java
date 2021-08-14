package com.company;

import java.util.Scanner;

public class SumOfNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter number");
        int num = in.nextInt();
        System.out.println("Sum is " + sum(num));
    }

    static int sum(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum = sum + i;
        }
        return sum;
    }
}
