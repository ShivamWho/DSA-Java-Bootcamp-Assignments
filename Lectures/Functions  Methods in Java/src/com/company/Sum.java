package com.company;

import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {
        sum();
        int ans = sum2();
        System.out.println("Sum2 ans is " + ans);
        int ans2 = sum3(20,30);
        System.out.println("sum is "+ ans2);
    }

    static int sum3(int a, int b) {
        int sum = a + b;
        return sum;
    }

    static int sum2() {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        int num1 = in.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = in.nextInt();

        int sum = num1 + num2;
        return sum;
    }

    static void sum() {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        int num1 = in.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = in.nextInt();

        int sum = num1 + num2;
        System.out.println("Sum is " + sum);
    }
}
