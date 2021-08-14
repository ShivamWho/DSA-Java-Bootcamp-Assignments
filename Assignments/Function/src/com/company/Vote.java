package com.company;

import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter age");
        int age = in.nextInt();
        checkVote(age);
    }

    static void checkVote(int age){
        if(age<=0){
            System.out.println("Enter valid age");
            return;
        }
        if(age>=18){
            System.out.println("Eligible");
        }else{
            System.out.println("Not eligible");
        }
    }
}
