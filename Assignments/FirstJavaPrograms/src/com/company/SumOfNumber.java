package com.company;

import java.util.Scanner;

public class SumOfNumber {
    public static void main(String[] args) {
        System.out.println("Enter numbers");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int sum=0;
        while(num!=0){
            sum+=num;
            num = input.nextInt();
        }

        System.out.println("Sum is "+ sum);
    }
}
