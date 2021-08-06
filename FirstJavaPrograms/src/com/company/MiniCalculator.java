package com.company;

import java.util.Scanner;

public class MiniCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number");
        int n1 = input.nextInt();
        int n2 = input.nextInt();

        char ope = input.next().charAt(0);

        if(ope == '+'){
            System.out.println("Sum is "+ (n1+n2));
        }
        if(ope == '-'){
            System.out.println("Sub is "+(n1-n2));
        }
        if(ope=='*'){
            System.out.println("Mul is "+(n1*n2));
        }
        if(ope=='/'){
            System.out.println("Div is "+(n1/n2));
        }
    }
}
