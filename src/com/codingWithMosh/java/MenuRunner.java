//package codingWithMosh.java;
//
//import java.util.Scanner;
//
//
//
//public class MenuRunner {
//
//	public static void main(String[] args) {
//		
//		
//		
//	
//		//creating a scanner is similar to creating an object for a class
//		//ex: Type objectName = new Type(argument);
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.print("Enter Number1 =");
//		int number1 = scanner.nextInt();
//		//System.out.println("The Number You Entered is : " +number1); 
//		
//		System.out.print("Enter Number2 =");
//		int number2 = scanner.nextInt();
//		//System.out.println("The Number You Entered is : " +number2); 
//		
//		System.out.println("what do you like to do to these two values?");
//		int operator = scanner.nextInt();
//		
//		
//		
//		//performigUsingSwitchMethod(number1, number2, operator); //improvised 
//	
//	
//	
//		
//	
//		
//		public static void performigUsingSwitchMethod(int number1, int number2, int operator) {  //improvised method 
//			switch(operator){
//			
//			case 1: 
//				System.out.println("Result" + (number1 + number2));
//			break;
//			
//			case 2: System.out.println("Result" + (number1 - number2));
//			break;
//			
//			case 3: System.out.println("Result" + (number1 *number2));
//			break;
//			
//			case 4: System.out.println("Result " + (number1 /number2));
//			break;
//			
//			default: System.out.println("invalid Operation");
//			}
//		
//	}
//			
//	
//			
//		
//		
//		if (operator.equalsIgnoreCase("add")){
//			
//		System.out.println(addition(number1, number2));
//	}
//		else if (operator.equalsIgnoreCase("subtract")){
//			
//			System.out.println(subtarction(number1, number2));
//		}
//		else if (operator.equalsIgnoreCase("Multiply")){
//			System.out.println(multiplication(number1, number2));
//		}
//		else if (operator.equalsIgnoreCase("Divide")){
//			
//			System.out.println(division(number1, number2));
//		}
//		else {
//			System.out.println("Invlaid Operation");
//			
//		}
//			
//		
//	
//	
//	
//		
//	public static boolean addition(int number1, int number2) {
//		System.out.println(number1+number2);
//		return true;
//		
//		
//		
//	}
//	public static boolean subtarction(int number1, int number2) {
//		
//		System.out.println(number1-number2);
//		return true;
//		
//	}
//	public static boolean multiplication(int number1, int number2) {
//		
//		System.out.println(number1*number2);
//		return false;
//	}
//	public static boolean division(double number1, double number2) {
//		
//		System.out.println(number1/number2);
//		return true;
//	}
//	
//	
//
//}
