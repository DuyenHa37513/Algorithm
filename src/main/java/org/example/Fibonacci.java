package org.example;

public class Fibonacci {
    public static void main(String[] args) {
        int number1 = 0;
        int number2 = 1;
        System.out.println(number1);
        System.out.println(number2);
        for(int i = 0; i < 8; i++){
            int number3 = number1 + number2;
            number1 = number2;
            number2 = number3;
            System.out.println(number3);
        }
    }
}
