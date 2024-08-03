//Take integer inputs from user until he/she presses q 
//( Ask to press q to quit after every integer input ). Print average and product of all numbers.

package assignment2;

import java.util.Scanner;
public class Prog6 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
        int count = 0;
        double sum = 0;
        long product = 1;

        while (true) {
            System.out.print("Enter an integer (or 'q' to quit): ");
            String input = scanner.next();

            if (input.equalsIgnoreCase("q")) {
                break;
            }

            int num = Integer.parseInt(input);
            sum += num;
            product *= num;
            count++;
        }

        if (count == 0) {
            System.out.println("No numbers entered.");
        } else {
            double average = sum / count;
            System.out.println("Average: " + average);
            System.out.println("Product: " + product);
        }
	}
}
