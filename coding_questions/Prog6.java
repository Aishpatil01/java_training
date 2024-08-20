//Write a program to convert Fahrenheit into Celsius. Input the value using scanner

package coding_questions;

import java.util.Scanner;
public class Prog6 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the temperature: ");
		double temp = scanner.nextDouble();
		
		System.out.println("Fahrenheit to Celsius: " + fahrenheitToCelsius(temp));
	}
	
	public static double fahrenheitToCelsius(double temp) {
		
		double celsius = (temp-32)*(0.5556);
		return celsius ;
	}
}
