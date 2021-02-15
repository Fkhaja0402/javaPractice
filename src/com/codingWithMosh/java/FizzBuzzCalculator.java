package com.codingWithMosh.java;

import java.util.Scanner;

public class FizzBuzzCalculator {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.print("PLease enter the number:");
        int divident1 = scanner.nextInt();

        if (divident1 % 3 == 0 && divident1 % 5 == 0)
            System.out.println("FizzBuzz");

        else if (divident1 % 3 == 0)
            System.out.print("Buzz");

        else if (divident1 % 5 == 0)
            System.out.println("Fizz");

        else
            System.out.println(divident1);


    }

}
