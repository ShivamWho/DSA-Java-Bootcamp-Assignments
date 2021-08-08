package com.company;

import java.util.Scanner;

public class AreaOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter side of triangle");
        double side = input.nextDouble();

        double area = (1.73 * side * side)/4;

        System.out.println("Area is " + area);
    }
}
