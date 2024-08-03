//Write a program to find greatest common divisor (GCD) or highest common factor (HCF) of given two numbers

package assignment2;

import java.util.Scanner;
public class Prog7 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);

		System.out.println("Enter the first number: ");
		int n1 = s.nextInt();

		System.out.println("Enter the second number: ");
		int n2 = s.nextInt();

		int small = n1<n2 ? n1 : n2 ;

		while (true)
		{
			if (n1%small==0 && n2%small==0)
			{
				System.out.println(small + " is the HCF of " + n1 + " and " + n2);
				break;
			}

			small -- ;
		}
	}

}
