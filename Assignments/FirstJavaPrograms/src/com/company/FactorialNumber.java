package com.company;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();

        int fact = 1;

        for(int i = 1;i<=num;i++){
            fact=fact*i;
        }

        System.out.println("Factorial is");
        System.out.println(fact);
    }
}
