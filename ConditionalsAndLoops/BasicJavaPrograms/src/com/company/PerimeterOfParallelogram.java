package com.company;

import java.util.Scanner;

public class PerimeterOfParallelogram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter side");
        int a = input.nextInt();
        System.out.println("Enter base");
        int b = input.nextInt();

        int perimeter = 2*(a+b);
        System.out.println("Perimeter is "+ perimeter);
    }
}
