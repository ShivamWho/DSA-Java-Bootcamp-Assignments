package com.company;

import java.util.Scanner;

public class LargestOfAll {
    public static void main(String[] args) {
        System.out.println("Enter numbers");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int large = 0;
        while(num!=0){
            if(num>large){
                large = num;
            }
            num = input.nextInt();
        }
        System.out.println("Largest number in "+ large);

    }
}
