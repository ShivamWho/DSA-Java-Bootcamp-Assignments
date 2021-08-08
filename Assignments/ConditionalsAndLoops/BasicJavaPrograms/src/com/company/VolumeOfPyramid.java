package com.company;

import java.util.Scanner;

public class VolumeOfPyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter base length");
        double l = input.nextDouble();
        System.out.println("Enter base width");
        double w = input.nextDouble();
        System.out.println("Enter pyramid height");
        double h = input.nextDouble();

        double volume = (l*w*h)/3;
        System.out.println("Volume is "+volume);
    }
}
