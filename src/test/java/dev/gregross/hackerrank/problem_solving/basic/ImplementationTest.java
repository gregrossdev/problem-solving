package dev.gregross.hackerrank.problem_solving.basic;

import org.junit.jupiter.api.Test;

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
}