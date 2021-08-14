package com.company;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter radius of circle");
        int radius = in.nextInt();
        circumference(radius);
        area(radius);
    }

    static void circumference(int radius) {
        double circumference = 2 * 3.14 * radius;
        System.out.println("Circumference is " + circumference);
    }

    static void area(int radius) {
        double area = 3.14 * radius * radius;
        System.out.println("Area is " + area);
    }
}
