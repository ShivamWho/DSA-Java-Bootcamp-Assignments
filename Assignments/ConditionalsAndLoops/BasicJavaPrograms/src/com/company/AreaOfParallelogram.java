package com.company;

import java.util.Scanner;

public class AreaOfParallelogram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter base");
        int base = input.nextInt();

        System.out.println("Enter heigth");
        int height = input.nextInt();

        int area = base * height;

        System.out.println("Area is "+ area);

    }
}
