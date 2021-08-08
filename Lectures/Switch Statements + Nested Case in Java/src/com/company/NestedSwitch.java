package com.company;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int empId = input.nextInt();
        String department = input.next();

        switch (empId){
            case 1 -> System.out.println("Shivam Sindhi");
            case 2 -> System.out.println("Rahul Rana");
            case 3 -> {
                System.out.println("Emp no 3");
                switch (department){
                    case "IT" -> System.out.println("IT Department");
                    case "Management" -> System.out.println("Management Department");
                    default -> System.out.println("Enter valid department");
                }
            }
            default -> System.out.println("Enter valid EmpId");
        }
    }
}
