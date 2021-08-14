package com.company;

import java.util.Scanner;

public class MaximumMinimum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter numbers");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        maximum(a, b, c);
        minimum(a, b, c);

    }

    static void maximum(int a, int b, int c) {
        if (a > b) {
            if (a > c) {
                System.out.println(a + " is maximum");
            } else {
                System.out.println(c + " is maximum");
            }
        } else {
            if (b > c) {
                System.out.println(b + " is maximum");
            } else {
                System.out.println(c + " is maximum");
            }
        }
    }

    static void minimum(int a, int b, int c) {
        if (a < b) {
            if (a < c) {
                System.out.println(a + " is minimum");
            } else {
                System.out.println(c + " is minimum");
            }
        } else {
            if (b < c) {
                System.out.println(b + " is minimum");
            } else {
                System.out.println(c + " is minimum");
            }
        }
    }
}
