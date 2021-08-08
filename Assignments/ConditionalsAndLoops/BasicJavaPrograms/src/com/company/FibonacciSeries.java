package com.company;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int p = 0;
        int i = 1;
        int count = 2;
        System.out.println(p);
        System.out.println(i);

        while(count < n){
            int temp = i;
            i = i+p;
            System.out.println(i);
            p = temp;
            count++;
        }
    }
}
