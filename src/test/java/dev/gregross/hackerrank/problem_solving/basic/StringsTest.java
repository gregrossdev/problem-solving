package dev.gregross.hackerrank.problem_solving.basic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringsTest {

	@Test
	void testCamelcase() {
		assertEquals(5, Strings.camelcase("saveChangesInTheEditor"));
		assertEquals(1, Strings.camelcase("oneword"));
		assertEquals(3, Strings.camelcase("thisIsTest"));
		assertEquals(4, Strings.camelcase("thisIsATest"));
		assertEquals(2, Strings.camelcase("helloWorld"));
	}

	@Test
	void testMinimumNumber() {
		assertEquals(3, Strings.minimumNumber(3, "Ab1"));
		assertEquals(0, Strings.minimumNumber(6, "Ab1!@#"));
		assertEquals(0, Strings.minimumNumber(6, "aB1!@"));
	}
}