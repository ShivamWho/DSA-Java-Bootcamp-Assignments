package com.company;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        System.out.println("Enter number ");

        Scanner input = new Scanner(System.in);

        int num = input.nextInt();

        if(num%2 == 0) {
            System.out.println("Even");
        } else{
            System.out.println("Odd");
        }
    }
}
