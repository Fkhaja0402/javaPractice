package com.codingWithMosh.java;

import java.util.Arrays;

public class ArrayTest {
	public static void main(String[] args) {
		String [] dayOfWeek = new String[8]; //Always define the length when declaring an Array
		dayOfWeek[0]="Monday";
		dayOfWeek[1]="Monday";
		dayOfWeek[2]="Monday";
		dayOfWeek[3]="Monday";
		dayOfWeek[4]="Thursday";
		dayOfWeek[5]="Friday";
		dayOfWeek[6]="Saturday";
		dayOfWeek[7]="Monday";

		System.out.print(Arrays.toString(dayOfWeek));
		
	}
}
