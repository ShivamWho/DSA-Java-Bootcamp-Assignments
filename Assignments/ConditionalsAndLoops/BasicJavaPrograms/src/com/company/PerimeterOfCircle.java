package com.company;

import java.util.Scanner;

public class PerimeterOfCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double pi = 3.14;

        System.out.println("Enter radius of Circle");
        double r = input.nextDouble();

        double perimeter = 2*pi*r;
        System.out.println("Perimeter is "+ perimeter);
    }
}
