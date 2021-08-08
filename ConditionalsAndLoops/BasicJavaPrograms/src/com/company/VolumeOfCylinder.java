package com.company;

import java.util.Scanner;

public class VolumeOfCylinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter radius");
        double radius = input.nextDouble();
        System.out.println("Enter height");
        double height = input.nextDouble();

        double pi = 3.14;

        double volume = pi*radius*radius*height;

        System.out.println("Volume is "+ volume);
    }
}
