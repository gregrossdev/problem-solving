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
}