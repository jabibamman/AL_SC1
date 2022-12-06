package com.example.al_intro;

public class Conditions {
    public static float Calculatrice (int left, int right, char operator) {
        switch(operator) {
            case '+' -> {
                return left + right;
            }
            case '-' -> {
                return left - right;
            }
            case 'x' -> {
                return left * right;
            }
            case '/' -> {
                if(left > right) {
                    return left/right;
                }
                return right/left;
            }
            case '^' -> {
                return left ^ right;
            }
            default -> {
                throw new IllegalArgumentException("unknown operation");
            }
        }
    }
}
