package com.example.spe;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
//test file to check test cases
@SpringBootTest
class SpeApplicationTests {
	@Test
	public void testAdd() {
		// Test Case 1
		double result1 = SpeApplication.add(3, 4);
		assertEquals(7, result1, 0.0001, "Testing addition of two positive numbers");

		// Test Case 2
		double result2 = SpeApplication.add(-2, 5);
		assertEquals(3, result2, 0.0001, "Testing addition of a negative and a positive number");

		// Test Case 3
		double result3 = SpeApplication.add(-3, -7);
		assertEquals(-10, result3, 0.0001, "Testing addition of two negative numbers");

		// Test Case 4
		double result4 = SpeApplication.add(0, 0);
		assertEquals(0, result4, 0.0001, "Testing addition of two zeros");

		// Test Case 5
		double result5 = SpeApplication.add(7.5, 2.5);
		assertEquals(10, result5, 0.0001, "Testing addition of two decimal numbers");
	}

	@Test
	public void testSubtract() {
		// Test Case 1
		double result1 = SpeApplication.subtract(8, 5);
		assertEquals(3, result1, 0.0001, "Testing subtraction of two positive numbers");

		// Test Case 2
		double result2 = SpeApplication.subtract(-2, 5);
		assertEquals(-7, result2, 0.0001, "Testing subtraction of a negative from a positive number");

		// Test Case 3
		double result3 = SpeApplication.subtract(-3, -7);
		assertEquals(4, result3, 0.0001, "Testing subtraction of a negative from a negative number");

		// Test Case 4
		double result4 = SpeApplication.subtract(0, 0);
		assertEquals(0, result4, 0.0001, "Testing subtraction of two zeros");

		// Test Case 5
		double result5 = SpeApplication.subtract(7.5, 2.5);
		assertEquals(5, result5, 0.0001, "Testing subtraction of two decimal numbers");
	}

	@Test
	public void testMultiply() {
		// Test Case 1
		double result1 = SpeApplication.multiply(2, 6);
		assertEquals(12, result1, 0.0001, "Testing multiplication of two positive numbers");

		// Test Case 2
		double result2 = SpeApplication.multiply(-2, 5);
		assertEquals(-10, result2, 0.0001, "Testing multiplication of a negative and a positive number");

		// Test Case 3
		double result3 = SpeApplication.multiply(-3, -7);
		assertEquals(21, result3, 0.0001, "Testing multiplication of two negative numbers");

		// Test Case 4
		double result4 = SpeApplication.multiply(0, 5);
		assertEquals(0, result4, 0.0001, "Testing multiplication by zero");

		// Test Case 5
		double result5 = SpeApplication.multiply(2.5, 3);
		assertEquals(7.5, result5, 0.0001, "Testing multiplication of a decimal and an integer");
	}

	@Test
	public void testDivide() {
		// Test Case 1
		double result1 = SpeApplication.divide(9, 3);
		assertEquals(3, result1, 0.0001, "Testing division of two positive numbers");

		// Test Case 2
		double result2 = SpeApplication.divide(-10, 2);
		assertEquals(-5, result2, 0.0001, "Testing division of a negative number by a positive number");

		// Test Case 3
		double result3 = SpeApplication.divide(15, -3);
		assertEquals(-5, result3, 0.0001, "Testing division of a positive number by a negative number");

		// Test Case 4
		double result4 = SpeApplication.divide(0, 5);
		assertEquals(0, result4, 0.0001, "Testing division of zero by a positive number");

		// Test Case 5
		double result5 = SpeApplication.divide(7.5, 2.5);
		assertEquals(3, result5, 0.0001, "Testing division of two decimal numbers");
	}

	@Test
	public void testDivideByZero() {
		double result = SpeApplication.divide(9, 0);
		assertEquals(0, result, 0.0001,"testing divide by zero exception of two numbers"); // Check for the expected result when dividing by zero
	}

	@Test
	public void testSquareRoot() {
		// Test Case 1
		double result1 = SpeApplication.squareRoot(25);
		assertEquals(5, result1, 0.0001, "Testing square root of a positive number");

		// Test Case 2
		double result2 = SpeApplication.squareRoot(0);
		assertEquals(0, result2, 0.0001, "Testing square root of zero");

		// Test Case 3
		double result3 = SpeApplication.squareRoot(144);
		assertEquals(12, result3, 0.0001, "Testing square root of a perfect square");

		// Test Case 4
		double result4 = SpeApplication.squareRoot(-25);
		assertTrue(Double.isNaN(result4), "Testing square root of a negative number");

		// Test Case 5
		double result5 = SpeApplication.squareRoot(2.5);
		assertEquals(Math.sqrt(2.5), result5, 0.0001, "Testing square root of a decimal number");
	}

	@Test
	public void testNaturalLog() {
		// Test Case 1
		double result1 = SpeApplication.naturalLog(1);
		assertEquals(0, result1, 0.0001, "Testing natural log of 1");

		// Test Case 2
		double result2 = SpeApplication.naturalLog(10);
		assertEquals(2.3026, result2, 0.0001, "Testing natural log of a positive number");

		// Test Case 3
		double result3 = SpeApplication.naturalLog(Math.E); // Natural log of e should be 1
		assertEquals(1, result3, 0.0001, "Testing natural log of Euler's number (e)");

		// Test Case 4
		double result4 = SpeApplication.naturalLog(-5);
		assertTrue(Double.isNaN(result4), "Testing natural log of a negative number");

		// Test Case 5
		double result5 = SpeApplication.naturalLog(0);
		assertTrue(Double.isNaN(result5), "Testing natural log of zero");
	}

	@Test
	public void testFactorial() {
		// Test Case 1
		int result1 = SpeApplication.factorial(5);
		assertEquals(120, result1, "Testing factorial of 5");

		// Test Case 2
		int result2 = SpeApplication.factorial(0);
		assertEquals(1, result2, "Testing factorial of 0");

		// Test Case 3
		int result3 = SpeApplication.factorial(1);
		assertEquals(1, result3, "Testing factorial of 1");

		// Test Case 4
		int result4 = SpeApplication.factorial(3);
		assertEquals(6, result4, "Testing factorial of 3");

		// Test Case 5
		int result5 = SpeApplication.factorial(-2);
		assertEquals(-1, result5, "Testing factorial of a negative number");
	}

	@Test
	public void testFactorialZero() {
		int result = SpeApplication.factorial(0);
		assertEquals(1, result,"testing factorial  of 0");
	}

	@Test
	public void testFactorialOne() {
		int result = SpeApplication.factorial(1);
		assertEquals(1, result,"testing factorial of 1");
	}

	@Test
	public void testPower() {
		// Test Case 1
		double result1 = SpeApplication.power(2, 3);
		assertEquals(8, result1, 0.0001, "Testing power function with positive integers");

		// Test Case 2
		double result2 = SpeApplication.power(5, 0);
		assertEquals(1, result2, 0.0001, "Testing power function with exponent as zero");

		// Test Case 3
		double result3 = SpeApplication.power(-2, 2);
		assertEquals(4, result3, 0.0001, "Testing power function with a negative base and positive exponent");

		// Test Case 4
		double result4 = SpeApplication.power(3.5, 2);
		assertEquals(12.25, result4, 0.0001, "Testing power function with a decimal base and positive exponent");

		// Test Case 5
		double result5 = SpeApplication.power(4, -1);
		assertEquals(0.25, result5, 0.0001, "Testing power function with a positive base and negative exponent");
	}

}
