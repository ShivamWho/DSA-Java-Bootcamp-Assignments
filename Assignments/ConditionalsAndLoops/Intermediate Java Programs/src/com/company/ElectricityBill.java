package com.company;

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter price of 1 unit");
        double perUnit = input.nextDouble();

        System.out.println("Enter units consumed");
        double units = input.nextDouble();

        double bill = units * perUnit;
        System.out.println("Your Bill is " + bill);
    }
}
