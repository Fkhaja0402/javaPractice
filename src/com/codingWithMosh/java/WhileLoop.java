package com.codingWithMosh.java;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String input = "";
		while(!input.equalsIgnoreCase("quit")) {
		System.out.print("input:");
		input = scanner.next();
		if (!input.equalsIgnoreCase("quit"))
			System.out.println(input);

		}
	}
	

}
