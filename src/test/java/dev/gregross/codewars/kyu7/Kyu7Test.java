package dev.gregross.codewars.kyu7;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

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

	@Test
	void squareDigitsTests() {
		assertEquals(811181, kyu7.squareDigits(9119));
		assertEquals(14916, kyu7.squareDigits(1234));
		assertEquals(0, kyu7.squareDigits(0));
		assertEquals(4114, kyu7.squareDigits(2112));
		assertEquals(9414, kyu7.squareDigits(3212));
	}

	@Test
	void highAndLowTests() {
		assertEquals("5 1", kyu7.highAndLow("1 2 3 4 5"));
		assertEquals("5 -3", kyu7.highAndLow("1 2 -3 4 5"));
		assertEquals("9 0", kyu7.highAndLow("0 9 8 7 6 5 4 3 2 1"));
		assertEquals("1 1", kyu7.highAndLow("1 1 1 1 1"));
		assertEquals("-1 -1", kyu7.highAndLow("-1 -1 -1 -1 -1"));
	}

	@Test
	void sortDescTests() {
		assertEquals(987654321, kyu7.sortDesc(123456789));
		assertEquals(321, kyu7.sortDesc(213));
		assertEquals(0, kyu7.sortDesc(0));
		assertEquals(987, kyu7.sortDesc(789));
		assertEquals(54321, kyu7.sortDesc(12345));
	}

	@Test
	void filterListTests() {
		assertEquals(Arrays.asList(1, 2, 3), kyu7.filterList(Arrays.asList(1, 2, "a", "b", 3)));
		assertEquals(Arrays.asList(1, 0, 15), kyu7.filterList(Arrays.asList(1, "a", "b", 0, 15)));
		assertEquals(Arrays.asList(1, 2, 123), kyu7.filterList(Arrays.asList(1, 2, "aasf", "1", "123", 123)));
		assertEquals(Arrays.asList(), kyu7.filterList(Arrays.asList("a", "b", "c")));
		assertEquals(Arrays.asList(1, 2, 3, 4), kyu7.filterList(Arrays.asList(1, 2, 3, 4)));
	}

	@Test
	void getMiddleTests() {
		assertEquals("es", kyu7.getMiddle("test"));
		assertEquals("dd", kyu7.getMiddle("middle"));
		assertEquals("t", kyu7.getMiddle("testing"));
		assertEquals("A", kyu7.getMiddle("A"));
	}
}