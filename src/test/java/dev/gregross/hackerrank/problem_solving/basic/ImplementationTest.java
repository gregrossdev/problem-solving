package dev.gregross.hackerrank.problem_solving.basic;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ImplementationTest {

	@Test
	void gradingStudentsTests() {
		List<Integer> grades = Arrays.asList(73, 67, 38, 33);
		List<Integer> expected = Arrays.asList(75, 67, 40, 33);
		List<Integer> result = Implementation.gradingStudents(grades);
		assertEquals(expected, result);
	}

	@Test
	void countApplesAndOrangesTests() {
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
}