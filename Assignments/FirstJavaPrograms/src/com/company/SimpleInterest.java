package com.company;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Principle");
        double P = input.nextDouble();
        System.out.println("Enter Time");
        double T = input.nextDouble();
        System.out.println("Enter Rate");
        double R =input.nextDouble();
        double SI = (P*R*T)/100;
        System.out.println("Simple Intrest is "+ SI);
    }
}
