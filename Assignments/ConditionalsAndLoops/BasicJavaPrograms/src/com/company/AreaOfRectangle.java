package com.company;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter length of rectangle");
        int length = input.nextInt();
        System.out.println("Enter breadth of rectangle");
        int breadth = input.nextInt();

        int area = length*breadth;
        System.out.println("Area is " + area);
    }
}
