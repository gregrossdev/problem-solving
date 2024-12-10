package dev.gregross.hackerrank.problem_solving.basic;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class WarmupTest {

	Warmup warmup = new Warmup();

	@Test
	void solveMeFirstTest() {
		assertEquals(5, warmup.solveMeFirst(2, 3));
		assertEquals(0, warmup.solveMeFirst(0, 0));
		assertEquals(-1, warmup.solveMeFirst(-2, 1));
		assertEquals(100, warmup.solveMeFirst(50, 50));
	}

	@Test
	void simpleArraySumTest() {
		assertEquals(6, warmup.simpleArraySum(Arrays.asList(1, 2, 3)));
		assertEquals(0, warmup.simpleArraySum(Arrays.asList()));
		assertEquals(-6, warmup.simpleArraySum(Arrays.asList(-1, -2, -3)));
		assertEquals(15, warmup.simpleArraySum(Arrays.asList(1, 2, 3, 4, 5)));
	}
}