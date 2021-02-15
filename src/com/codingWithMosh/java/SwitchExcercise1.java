package com.codingWithMosh.java;

import java.util.Scanner;

public class SwitchExcercise1 {

    public static void main(String[] args) {
//Scanner scanner = new Scanner(System.in);
//System.out.println("enter number 0-6 to find if is a weekday");
//int dayNumber = scanner.nextInt();


//		String [] dayNumber = new String[7]; 
//			dayNumber[0]="Sunday";
//			dayNumber[1]="Monday";
//			dayNumber[2]="Tuseday";
//			dayNumber[3]="Wednesday";
//			dayNumber[4]="Thursday";
//			dayNumber[5]="Friday";
//			dayNumber[6]="Saturday";
        isWeekDay(0);
        nameOfaDay(0);


    }

    public static boolean isWeekDay(int dayNumber) {
        switch (dayNumber) {

            default:
                System.out.println("not a week day");
                break;
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;


        }
        return false;
    }

    public static String nameOfaDay(int dayName) {

        switch (dayName) {

            case 0:
                return "monday";
            case 1:
                return "tuesday";
            case 2:
                return "wednesday";


        }
        return "invalid day";
    }
}