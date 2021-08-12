package com.company;

import java.util.Scanner;

public class DistanceTwoPoints {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter point 1");
        int point1 = input.nextInt();
        System.out.println("Enter point 2");
        int point2 = input.nextInt();

        int distance = point2 - point1;
        System.out.println("Distance is " + distance);
    }
}
