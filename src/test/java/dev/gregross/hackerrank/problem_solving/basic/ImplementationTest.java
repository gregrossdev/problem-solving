package dev.gregross.hackerrank.problem_solving.basic;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ImplementationTest {

	@Test
	void testGradingStudents() {
		List<Integer> grades = Arrays.asList(73, 67, 38, 33);
		List<Integer> expected = Arrays.asList(75, 67, 40, 33);
		List<Integer> result = Implementation.gradingStudents(grades);
		assertEquals(expected, result);
	}

	@Test
	void testCountApplesAndOranges() {
		List<Integer> apples = Arrays.asList(-2, 2, 1);
		List<Integer> oranges = Arrays.asList(5, -6);
		int s = 7, t = 11, a = 5, b = 15;

		// Redirecting System.out to capture the output
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));

		Implementation.countApplesAndOranges(s, t, a, b, apples, oranges);

		// Resetting System.out to its original state
		System.setOut(System.out);

		String expectedOutput = "1\n1\n";
		assertEquals(expectedOutput, outContent.toString());
	}

	@Test
	void testKangaroo() {
			assertEquals("YES", Implementation.kangaroo(0, 3, 4, 2));
			assertEquals("NO", Implementation.kangaroo(0, 2, 5, 3));
			assertEquals("NO", Implementation.kangaroo(21, 6, 47, 3));
			assertEquals("YES", Implementation.kangaroo(14, 4, 98, 2));
	}


	@Test
	void testGetTotalX() {
			List<Integer> a = Arrays.asList(2, 4);
			List<Integer> b = Arrays.asList(16, 32, 96);
			int expected = 3;
			int result = Implementation.getTotalX(a, b);
			assertEquals(expected, result);

			a = Arrays.asList(3, 4);
			b = Arrays.asList(24, 48);
			expected = 2;
			result = Implementation.getTotalX(a, b);
			assertEquals(expected, result);

			a = Arrays.asList(1);
			b = Arrays.asList(100);
			expected = 9;
			result = Implementation.getTotalX(a, b);
			assertEquals(expected, result);
	}

	@Test
	void testBreakingRecords() {
			List<Integer> scores = Arrays.asList(10, 5, 20, 20, 4, 5, 2, 25, 1);
			List<Integer> expected = Arrays.asList(2, 4);
			List<Integer> result = Implementation.breakingRecords(scores);
			assertEquals(expected, result);

			scores = Arrays.asList(3, 4, 21, 36, 10, 28, 35, 5, 24, 42);
			expected = Arrays.asList(4, 0);
			result = Implementation.breakingRecords(scores);
			assertEquals(expected, result);
	}

	@Test
	void testBirthday() {
			List<Integer> s = Arrays.asList(2, 2, 1, 3, 2);
			int d = 4;
			int m = 2;
			int expected = 2;
			int result = Implementation.birthday(s, d, m);
			assertEquals(expected, result);

			s = Arrays.asList(1, 2, 1, 3, 2);
			d = 3;
			m = 2;
			expected = 2;
			result = Implementation.birthday(s, d, m);
			assertEquals(expected, result);

			s = Arrays.asList(1, 1, 1, 1, 1, 1);
			d = 3;
			m = 2;
			expected = 0;
			result = Implementation.birthday(s, d, m);
			assertEquals(expected, result);
	}

	@Test
	void testDivisibleSumPairs() {
			List<Integer> ar = Arrays.asList(1, 3, 2, 6, 1, 2);
			int n = 6;
			int k = 3;
			int expected = 5;
			int result = Implementation.divisibleSumPairs(n, k, ar);
			assertEquals(expected, result);

			ar = Arrays.asList(1, 2, 3, 4, 5, 6);
			n = 6;
			k = 5;
			expected = 3;
			result = Implementation.divisibleSumPairs(n, k, ar);
			assertEquals(expected, result);

			ar = Arrays.asList(1, 1, 1, 1, 1, 1);
			n = 6;
			k = 2;
			expected = 15;
			result = Implementation.divisibleSumPairs(n, k, ar);
			assertEquals(expected, result);
	}

	@Test
	void testMigratoryBirds() {
			List<Integer> arr = Arrays.asList(1, 1, 2, 2, 3);
			int expected = 1;
			int result = Implementation.migratoryBirds(arr);
			assertEquals(expected, result);

			arr = Arrays.asList(1, 4, 4, 4, 5, 3);
			expected = 4;
			result = Implementation.migratoryBirds(arr);
			assertEquals(expected, result);

			arr = Arrays.asList(1, 1, 2, 2, 3, 3, 3);
			expected = 3;
			result = Implementation.migratoryBirds(arr);
			assertEquals(expected, result);
	}

	@Test
	void testDayOfProgrammer() {
			assertEquals("13.09.2017", Implementation.dayOfProgrammer(2017));
			assertEquals("12.09.2016", Implementation.dayOfProgrammer(2016));
			assertEquals("26.09.1918", Implementation.dayOfProgrammer(1918));
			assertEquals("12.09.2000", Implementation.dayOfProgrammer(2000));
			assertEquals("13.09.2100", Implementation.dayOfProgrammer(2100));
	}

	@Test
	void testBonAppetit() {
			List<Integer> bill = Arrays.asList(3, 10, 2, 9);
			int k = 1;
			int b = 12;

			ByteArrayOutputStream outContent = new ByteArrayOutputStream();
			System.setOut(new PrintStream(outContent));

			Implementation.bonAppetit(bill, k, b);

			System.setOut(System.out);

			String expectedOutput = "5\n";
			assertEquals(expectedOutput, outContent.toString());

			bill = Arrays.asList(3, 10, 2, 9);
			k = 1;
			b = 7;

			outContent = new ByteArrayOutputStream();
			System.setOut(new PrintStream(outContent));

			Implementation.bonAppetit(bill, k, b);

			System.setOut(System.out);

			expectedOutput = "Bon Appetit\n";
			assertEquals(expectedOutput, outContent.toString());
	}

	@Test
	void testSockMerchant() {
			List<Integer> ar = Arrays.asList(10, 20, 20, 10, 10, 30, 50, 10, 20);
			int n = 9;
			int expected = 3;
			int result = Implementation.sockMerchant(n, ar);
			assertEquals(expected, result);

			ar = Arrays.asList(1, 2, 1, 2, 1, 3, 2);
			n = 7;
			expected = 2;
			result = Implementation.sockMerchant(n, ar);
			assertEquals(expected, result);

			ar = Arrays.asList(1, 1, 1, 1, 1, 1);
			n = 6;
			expected = 3;
			result = Implementation.sockMerchant(n, ar);
			assertEquals(expected, result);
	}

	@Test
	void testPageCount() {
			assertEquals(1, Implementation.pageCount(6, 2));
			assertEquals(0, Implementation.pageCount(5, 4));
	}

	@Test
	void testCountingValleys() {
			assertEquals(1, Implementation.countingValleys(8, "UDDDUDUU"));
			assertEquals(2, Implementation.countingValleys(12, "DDUUDDUDUUUD"));
			assertEquals(0, Implementation.countingValleys(10, "UUUUUUUUUU"));
	}

	@Test
	void testGetMoneySpent() {
			int[] keyboards = {40, 50, 60};
			int[] drives = {5, 8, 12};
			int b = 60;
			int expected = 58;
			int result = Implementation.getMoneySpent(keyboards, drives, b);
			assertEquals(expected, result);

			keyboards = new int[]{4};
			drives = new int[]{5};
			b = 5;
			expected = -1;
			result = Implementation.getMoneySpent(keyboards, drives, b);
			assertEquals(expected, result);

			keyboards = new int[]{3, 1};
			drives = new int[]{5, 2, 8};
			b = 10;
			expected = 9;
			result = Implementation.getMoneySpent(keyboards, drives, b);
			assertEquals(expected, result);
	}


}