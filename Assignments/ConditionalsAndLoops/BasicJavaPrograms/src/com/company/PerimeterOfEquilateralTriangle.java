package com.company;

import java.util.Scanner;

public class PerimeterOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter side of circle");
        int a = input.nextInt();

        int perimeter = 3*a;

        System.out.println("Perimeter is "+ perimeter);
    }
}
