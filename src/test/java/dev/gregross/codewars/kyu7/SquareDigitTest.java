package dev.gregross.codewars.kyu7;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

public class SquareDigitTest {

	private void assertSolution(int expected, int n) {
		int actual = assertDoesNotThrow(() -> new SquareDigit().squareDigits(n), "Unexpected exception thrown by user solution for n=" + n);
		assertEquals(expected, actual, "Incorrect answer for n=" + n);
	}

	@Test
	public void test() {
		assertSolution(811181, 9119);
		assertSolution(9414, 3212);
		assertSolution(4114, 2112);
		assertSolution(0, 0);
	}

	@Test
	public void randomTest() {
		Random random = new Random();
		for (int i = 0; i < 100; i++) {
			int test = 0;
			test += random.nextInt(10);
			test += random.nextInt(10) * 10;
			test += random.nextInt(10) * 10 * 10;
			test += random.nextInt(10) * 10 * 10 * 10;

			assertSolution(squareDigits(test), test);
		}
	}

	private int squareDigits(int n) {

		String strDigits = String.valueOf(n);
		String result = "";

		for (char c : strDigits.toCharArray()) {
			int digit = Character.digit(c, 10);
			result += digit * digit;
		}
		return Integer.parseInt(result);
	}

}