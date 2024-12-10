package dev.gregross.hackerrank.problem_solving.basic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarmupTest {

	@Test
	void solveMeFirstTest() {
		Warmup warmup = new Warmup();
		assertEquals(5, warmup.solveMeFirst(2, 3));
		assertEquals(0, warmup.solveMeFirst(0, 0));
		assertEquals(-1, warmup.solveMeFirst(-2, 1));
		assertEquals(100, warmup.solveMeFirst(50, 50));
	}
}