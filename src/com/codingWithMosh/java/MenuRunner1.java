package com.codingWithMosh.java;

import java.util.Scanner;

public class MenuRunner1 {

    public static void main(String[] args) {

        //creating a scanner is similar to creating an object for a class
        //ex: Type objectName = new Type(argument);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Number1 =");
        int number1 = scanner.nextInt();
        //System.out.println("The Number You Entered is : " +number1);

        System.out.print("Enter Number2 =");
        int number2 = scanner.nextInt();
        //System.out.println("The Number You Entered is : " +number2);

        System.out.println("what do you like to do to these two values?");
        String operator = scanner.next();

        if (operator.equalsIgnoreCase("add")) {
            System.out.println(addition(number1, number2));
        } else if (operator.equalsIgnoreCase("subtract")) {
            subtarction(number1, number2);
        } else if (operator.equalsIgnoreCase("Multiply")) {
            multiplication(number1, number2);
        } else if (operator.equalsIgnoreCase("Divide")) {

            division(number1, number2);
        }

    }

    public static int addition(int number1, int number2) {
        return number1 + number2;
        //System.out.println(number1+number2);
    }

    public static int subtarction(int number1, int number2) {
        return number1 - number2;
    }

    public static int multiplication(int number1, int number2) {
        return number1 * number2;
    }

    public static boolean division(double number1, double number2) {
        System.out.println(number1 / number2);
        return true;
    }
}