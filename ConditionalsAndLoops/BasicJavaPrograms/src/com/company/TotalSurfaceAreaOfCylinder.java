package com.company;

import java.util.Scanner;

public class TotalSurfaceAreaOfCylinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter height of Cylinder");
        double h = input.nextDouble();
        System.out.println("Enter radius of Cylinder");
        double r = input.nextDouble();

        double pi = 3.14;

        double TSA = 2*pi*r*(h+r);
        System.out.println("TSA of Cylinder is "+ TSA);
    }
}
