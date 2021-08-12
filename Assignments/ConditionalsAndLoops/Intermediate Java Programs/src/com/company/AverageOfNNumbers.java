package com.company;

import java.util.Scanner;

public class AverageOfNNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many numbers are there");
        int N = input.nextInt();
        System.out.println("Enter numbers");
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += input.nextInt();
        }
        double ave = (double) sum / N;
        System.out.println("Average is " + ave);
    }
}
