package com.company;

import java.util.Scanner;

public class FactorialProgram {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number");
        int num = input.nextInt();
        int fact = 1;
        while (num >= 1) {
            fact = fact * num;
            num--;
        }
        System.out.println("Factorial is " + fact);
    }
}
