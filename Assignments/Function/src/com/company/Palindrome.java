package com.company;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number");
        int num = in.nextInt();
        System.out.println(palindrome(num));
    }

    static boolean palindrome(int num) {
        int origional = num;
        int temp = 0;
        while (num > 0) {
            temp = (temp * 10) + num % 10;
            num = num / 10;
        }
        return temp == origional;
    }
}
