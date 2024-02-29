package com.example.spe;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;
@SpringBootApplication
public class SpeApplication {
	private static final Logger logger = LogManager.getLogger(SpeApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(SpeApplication.class, args);
		Scanner scanner = new Scanner(System.in);

		while (true) {
			//this is an advancecd calculator alsoooooo
			System.out.println("Advanced Calculator");
			System.out.println("1. Addition");
			System.out.println("2. Subtraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Division");
			System.out.println("5. Square Root");
			System.out.println("6. Natural Logarithm");
			System.out.println("7. Factorial");
			System.out.println("8. Power");
			System.out.println("9. Exit");

			System.out.print("Enter your choice (1-9): ");
			int choice = scanner.nextInt();

			if (choice == 9) {
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
				case 8:
					System.out.print("Enter the second number: ");
					num2 = scanner.nextDouble();
					result = power(num1,num2);
					break;
				default:
					System.out.println("Invalid choice. Please enter a number between 1 and 8.");
					continue;
			}

			System.out.println("Result: " + result);
		}

		scanner.close();
	}

	 static double add(double num1, double num2) {
		return num1 + num2;
	}

	 static double subtract(double num1, double num2) {
		return num1 - num2;
	}

	 static double multiply(double num1, double num2) {
		return num1 * num2;
	}

	static double divide(double num1, double num2) {
		if (num2 != 0) {
			return num1 / num2;
		} else {
			System.out.println("Cannot divide by zero. Please enter a non-zero second number.");
			return 0;
		}
	}

	static double squareRoot(double num) {
		if (num >= 0) {
			return Math.sqrt(num);
		} else {
			System.out.println("Cannot find square root of a negative number.");
			return Double.NaN; // Return NaN for invalid input
		}
	}

	static double naturalLog(double num) {
		if (num > 0) {
			return Math.log(num);
		} else {
			System.out.println("Natural logarithm is not defined for negative or zero numbers.");
			return Double.NaN; // Return NaN for invalid input
		}
	}

	static int factorial(int num) {
		if (num < 0) {
			System.out.println("Factorial is not defined for negative numbers.");
			return -1; // Return -1 for invalid input
		} else if (num == 0 || num == 1) {
			return 1;
		} else {
			return num * factorial(num - 1);
		}
	}
	static double power(double base, double exponent) {
		return Math.pow(base, exponent);
	}
}
