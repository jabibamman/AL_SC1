package com.example.al_intro;

public class FizzBuzz {
    public static void main(String[] args) { }
    public static String fizbuzz(int number) {
        if (number < 0) return null;
        switch (number % 15) {
            case 0 -> {return "FizzBuzz";}
            case 3, 6, 9, 12 -> {return "Fizz";}
            case 5, 10 -> {return "Buzz";}
            default -> {return String.valueOf(number);}
        }
    }

    public static void basic_fizzBuzz() {
        for (int i = 1; i <= 100; i++) {
            switch (i % 15) {
                case 0 -> System.out.println("FizzBuzz");
                case 3, 6, 9, 12 -> System.out.println("Fizz");
                case 5, 10 -> System.out.println("Buzz");
                default -> System.out.println(i);
            }
        }
    }
}
