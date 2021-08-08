package com.company;

import java.util.Scanner;

public class AreaOfRhombus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter length of Diagonal 1");
        int d1 = input.nextInt();

        System.out.println("Enter length of Diagonal 2");
        int d2 = input.nextInt();

        int area = (d1*d2)/2;
        System.out.println("Area is " + area);
    }
}
