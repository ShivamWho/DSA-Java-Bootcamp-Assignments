package com.company;

import java.util.Scanner;

public class AreaOfCircle {

    public static void main(String[] args) {
        System.out.println("Enter radius of circle");
        Scanner input = new Scanner(System.in);

        int radius = input.nextInt();
        double pi = 3.14;
        double area = pi*radius*radius;

        System.out.println("Area is "+ area);
    }
}
