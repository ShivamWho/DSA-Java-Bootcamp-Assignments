package com.company;

import java.util.Scanner;

public class DiscountOfProduct {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter price of product");
        double price = input.nextDouble();
        System.out.println("Enter % of discount");
        double dis = input.nextDouble();
        dis = price * (dis / 100);

        System.out.println("You have to pay " + (price - dis));
    }
}
