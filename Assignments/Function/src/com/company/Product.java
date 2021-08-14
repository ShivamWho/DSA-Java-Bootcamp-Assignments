package com.company;

import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter numbers");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        System.out.println("Product is " + product(num1, num2));
    }

    static int product(int num1, int num2) {
        return num1 * num2;
    }
}
