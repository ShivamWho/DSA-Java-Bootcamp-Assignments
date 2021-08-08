package com.company;

import java.util.Scanner;

public class VolumeOfSphere {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter radius of Sphere");
        double radius = input.nextDouble();

        double pi = 3.14;

        double volume = (4*pi*radius*radius*radius)/3;
        System.out.println("Volume is "+volume);
    }
}
