package main;

import java.util.Scanner;

/**
 *<h3>Addition,Subtraction,Multiplication,Divition of two numbers<h3>
 *This program simply calculates Addition,Subtraction,Multiplication,Divition of two given numbers and prints the output on the screen
 *<p>
 *<b><i>Note:<i><b> Giving these comments in any program makes it more readable and user friendly, also smart.
 *
 *@author Abdul_Mozid
 *@version 1.00
 *@since 29-10-2018
 */

public class Calculator {
	/**
	 * This method 'addition' is used to add two integers.
	 * It is the very simplest form of a class method, just to show the usage of various javadoc Tags.
	 * @param num1, This is the 1st parameter to addition method
	 * @param num2, This is the 2nd parameter to addition method
	 * @return , This returns sum of num1 and num2.
	 */
	public double addition(int num1, int num2) {
	return num1 + num2;
	}
	
	/**
	 * This method 'subtraction' is used to add two integers.
	 * It is the very simplest form of a class method, just to show the usage of various javadoc Tags.
	 * @param num1, This is the 1st parameter to subtraction method
	 * @param num2, This is the 2nd parameter to subtraction method
	 * @return , This returns subtract of num1 and num2.
	 */
	public double subtraction(int num1, int num2) {
	return num1 - num2;
	}
	
	/**
	 * This method 'multiplication' is used to add two integers.
	 * It is the very simplest form of a class method, just to show the usage of various javadoc Tags.
	 * @param num1, This is the 1st parameter to multiplication method
	 * @param num2, This is the 2nd parameter to multiplication method
	 * @return , This returns product of num1 and num2.
	 */
	public double multiplication(int num1, int num2) {
	return num1 * num2;
	}
	
	/**
	 * This method 'division' is used to add two integers.
	 * It is the very simplest form of a class method, just to show the usage of various javadoc Tags.
	 * @param num1, This is the 1st parameter to division method
	 * @param num2, This is the 2nd parameter to division method
	 * @return , This returns quotient of num1 and num2.
	 */
	public double division(int num1, int num2) {
	return num1 / num2;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Calculator cal = new Calculator();
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		System.out.println(cal.addition(num1,num2));
		System.out.println(cal.subtraction(num1,num2));
		System.out.println(cal.multiplication(num1,num2));
		System.out.println(cal.division(num1,num2));
	
	}

}