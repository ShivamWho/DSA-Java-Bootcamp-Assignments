package com.company;

import java.util.Scanner;

public class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter length");
        int l = input.nextInt();
        System.out.println("Enter width");
        int w = input.nextInt();

        int perimeter = 2*(l+w);

        System.out.println("Perimeter is "+ perimeter);
    }
}
