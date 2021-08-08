package com.company;

import java.util.Scanner;

public class LateralSurfaceAreaOfCube {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter side of cube");
        int side = input.nextInt();

        int LSA = 4*side*side;
        System.out.println("Lateral Surface Area of Cube is " + LSA);
    }
}
