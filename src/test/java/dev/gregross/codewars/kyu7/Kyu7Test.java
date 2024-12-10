package dev.gregross.codewars.kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Kyu7Test {

	@Test
	void getVowelCountTests() {
		assertEquals(5, Kyu7.getVowelCount("abracadabra"));
		assertEquals(0, Kyu7.getVowelCount("bcdfg"));
		assertEquals(3, Kyu7.getVowelCount("aei"));
		assertEquals(3, Kyu7.getVowelCount("hello world"));
		assertEquals(0, Kyu7.getVowelCount(""));
	}
}