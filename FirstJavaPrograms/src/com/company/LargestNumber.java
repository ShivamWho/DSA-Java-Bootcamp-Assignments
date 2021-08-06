package com.company;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        System.out.println("Enter numbers");
        Scanner input = new Scanner(System.in);

        int n1 = input.nextInt();
        int n2 = input.nextInt();

        if(n1>n2){
            System.out.println(n1+" is largest");
        }
        if(n2>n1){
            System.out.println(n2 + " is largest");
        }
    }
}
