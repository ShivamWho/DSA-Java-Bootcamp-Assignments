package com.company;

import java.util.Scanner;

public class VolumeOfCone {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter radius of cone");
        double radius = input.nextDouble();
        System.out.println("Enter height of cone");
        double height = input.nextDouble();

        double pi = 3.14;

        double volume = (pi*radius*radius*height)/3;
        System.out.println("Volume is "+ volume);
    }
}
