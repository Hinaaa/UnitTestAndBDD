package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    }

    //check addition
    public static int add(int a, int b) {
        return a + b;
    }
    //check dividable by 2 - even
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
    //check multiplication
    public static int multiply(int a, int b) {
        return a * b;
    }
    //given string to uperCase
    public static String uppercase(String text) {
        return text.toUpperCase();
    }
    //check given number is positiv
    public static boolean checkPositive(int value) {
        return value>0;
    }
}


