package dev.gregross.codewars.kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Kyu7Test {

	Kyu7 kyu7 = new Kyu7();

	@Test
	void getVowelCountTests() {
		assertEquals(5, kyu7.getVowelCount("abracadabra"));
		assertEquals(0, kyu7.getVowelCount("bcdfg"));
		assertEquals(3, kyu7.getVowelCount("aei"));
		assertEquals(3, kyu7.getVowelCount("hello world"));
		assertEquals(0, kyu7.getVowelCount(""));
	}

	@Test
	void disemvowelTests() {
		assertEquals("brcdbr", kyu7.disemvowel("abracadabra"));
		assertEquals("bcdfg", kyu7.disemvowel("bcdfg"));
		assertEquals("", kyu7.disemvowel("aeiou"));
		assertEquals("hll wrld", kyu7.disemvowel("hello world"));
		assertEquals("", kyu7.disemvowel(""));
	}
}