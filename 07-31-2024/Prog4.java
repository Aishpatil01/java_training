//Take 10 integers from keyboard using loop and print their average value on the screen

package assignment2;

import java.util.Scanner;
public class Prog4 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter number " + i + ": ");
            int num = scanner.nextInt();
            sum += num;
        }

        double average = (double) sum / 10;
        System.out.println("Average: " + average);
    }
	
}
