package com.company;

import java.util.Scanner;

public class RupeeToDollar {
    public static void main(String[] args) {
        System.out.println("Enter in rupee");
        Scanner input = new Scanner(System.in);
        double rupee = input.nextDouble();
        double dollar = 0.013;
        System.out.println("In dollar is "+ rupee*dollar);
    }
}
