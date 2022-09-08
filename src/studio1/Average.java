package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {

		Scanner number = new Scanner(System.in);
		System.out.println("Value for the first int: ");
		int x = number.nextInt();
		System.out.println("Value for the second int: ");
		int y = number.nextInt();

		double average = (x + y) / 2.0;
		
		System.out.println("The average of " + x + " and " + y + " is " + average);

		
	}

}
