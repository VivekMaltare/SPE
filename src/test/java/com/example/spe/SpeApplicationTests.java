package com.example.spe;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpeApplicationTests {
	@Test
	public void testAdd() {
		double result = SpeApplication.add(3, 4);
		assertEquals(7, result, 0.0001,"testing addition of two numbers"); // Delta is used for double comparison
	}

	@Test
	public void testSubtract() {
		double result = SpeApplication.subtract(8, 5);
		assertEquals(3, result, 0.0001,"testing subtraction of two numbers");
	}

	@Test
	public void testMultiply() {
		double result = SpeApplication.multiply(2, 6);
		assertEquals(12, result, 0.0001,"testing multiplication of two numbers");
	}

	@Test
	public void testDivide() {
		double result = SpeApplication.divide(9, 3);
		assertEquals(3, result, 0.0001,"testing division of two numbers of two numbers");
	}

	@Test
	public void testDivideByZero() {
		double result = SpeApplication.divide(9, 0);
		assertEquals(0, result, 0.0001,"testing divide by zero exception of two numbers"); // Check for the expected result when dividing by zero
	}

	@Test
	public void testSquareRoot() {
		double result = SpeApplication.squareRoot(25);
		assertEquals(5, result, 0.0001,"testing square root of a number");
	}

	@Test
	public void testNaturalLog() {
		double result = SpeApplication.naturalLog(1);
		assertEquals(0, result, 0.0001,"testing natural log of a number");
	}

	@Test
	public void testFactorial() {
		int result = SpeApplication.factorial(5);
		assertEquals(120, result,"testing factorial of a number");
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
}
