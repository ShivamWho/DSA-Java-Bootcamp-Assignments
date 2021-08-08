package com.company;

import java.util.Scanner;

public class AreaOfIsoscelesTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter base of triangle");
        double base = input.nextDouble();

        System.out.println("Enter height of triangle");
        double height = input.nextDouble();

        double area = (base*height)/2;

        System.out.println("Area is "+ area);

    }
}
