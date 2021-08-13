package com.company;

public class StringExample {
    public static void main(String[] args) {
        String message = greet();
        System.out.println(message);

        String perso = myGreet("Shivam Sindhi");
        System.out.println(perso);
    }

    static String myGreet(String name) {
        String message = "Hello "+ name;
        return message;
    }

    static String greet(){
        String greeting = "How are you ";
        return greeting;
    }
}
