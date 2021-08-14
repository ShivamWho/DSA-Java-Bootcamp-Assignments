package com.company;

import java.util.Scanner;

public class PythagoreanTriplet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter numbers");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        System.out.println(checkPythagorean(a, b, c));
    }

    static boolean checkPythagorean(int a, int b, int c) {
        return (a * a) + (b * b) == (c * c);
    }
}
