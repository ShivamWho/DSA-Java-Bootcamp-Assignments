package com.company;

import java.util.Scanner;

public class FactorsNumber {
    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println("Factors are");
        for(int i=1;i<=num;i++){
            if(num%i==0){
                System.out.println(i);
            }
        }
    }
}
