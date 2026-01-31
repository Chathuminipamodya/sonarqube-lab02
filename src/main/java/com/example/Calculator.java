package com.example;

public class Calculator {

    public int calculate(int a, int b, String operation) {
        switch(operation) {
            case "add":
                return a + b;
            case "sub":
                return a - b;
            case "mul":
                return a * b;
            case "div":
                return (b != 0) ? a / b : 0;
            case "mod":
                return a % b;
            case "pow":
                return power(a, b);
            default:
                return 0;
        }
    }

    private int power(int base, int exponent) {
        int result = 1;
        for(int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }
}