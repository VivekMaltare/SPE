package com.example.spe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;
@SpringBootApplication
public class SpeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpeApplication.class, args);
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("Advanced Calculator");
			System.out.println("1. Addition");
			System.out.println("2. Subtraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Division");
			System.out.println("5. Square Root");
			System.out.println("6. Natural Logarithm");
			System.out.println("7. Factorial");
			System.out.println("8. Exit");

			System.out.print("Enter your choice (1-8): ");
			int choice = scanner.nextInt();

			if (choice == 8) {
				System.out.println("Exiting the calculator. Goodbye!");
				break;
			}

			System.out.print("Enter the first number: ");
			double num1 = scanner.nextDouble();

			double result = 0;

			switch (choice) {
				case 1:
					System.out.print("Enter the second number: ");
					double num2 = scanner.nextDouble();
					result = add(num1, num2);
					break;
				case 2:
					System.out.print("Enter the second number: ");
					num2 = scanner.nextDouble();
					result = subtract(num1, num2);
					break;
				case 3:
					System.out.print("Enter the second number: ");
					num2 = scanner.nextDouble();
					result = multiply(num1, num2);
					break;
				case 4:
					System.out.print("Enter the second number: ");
					num2 = scanner.nextDouble();
					result = divide(num1, num2);
					break;
				case 5:
					result = squareRoot(num1);
					break;
				case 6:
					result = naturalLog(num1);
					break;
				case 7:
					result = factorial((int) num1);
					break;
				default:
					System.out.println("Invalid choice. Please enter a number between 1 and 8.");
					continue;
			}

			System.out.println("Result: " + result);
		}

		scanner.close();
	}

	private static double add(double num1, double num2) {
		return num1 + num2;
	}

	private static double subtract(double num1, double num2) {
		return num1 - num2;
	}

	private static double multiply(double num1, double num2) {
		return num1 * num2;
	}

	private static double divide(double num1, double num2) {
		if (num2 != 0) {
			return num1 / num2;
		} else {
			System.out.println("Cannot divide by zero. Please enter a non-zero second number.");
			return 0;
		}
	}

	private static double squareRoot(double num) {
		return Math.sqrt(num);
	}

	private static double naturalLog(double num) {
		return Math.log(num);
	}

	private static int factorial(int num) {
		if (num == 0 || num == 1) {
			return 1;
		} else {
			return num * factorial(num - 1);
		}
	}
}
