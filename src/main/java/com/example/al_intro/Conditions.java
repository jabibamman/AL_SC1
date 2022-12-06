package com.example.al_intro;

public class Conditions {
    public static float Calculatrice (int left, int right, char operator) {
        switch(operator) {
            case '+' -> { return left + right; }
            case '-' -> { return left - right; }
            case 'x' -> { return left * right; }
            case '/' -> {
                if(right == 0) throw new ArithmeticException("Division by zero");
                return (float) left / right;
            }
            case '^' -> { return (float) Math.pow(left, right); }
            default -> throw new IllegalArgumentException("unknown operation");
        }
    }
}
