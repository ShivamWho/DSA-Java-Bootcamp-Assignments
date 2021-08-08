package com.company;

import java.util.Scanner;

public class PerimeterOfSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter side of Square");
        int side = input.nextInt();

        int perimeter = 4*side;
        System.out.println("Perimeter is "+ perimeter);
    }
}
