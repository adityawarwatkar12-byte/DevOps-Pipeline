package com.devops;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("DevOps Pipeline Application");
        System.out.println("Addition: " + calculator.add(10, 20));
        System.out.println("Multiplication: " + calculator.multiply(5, 4));
    }
}
