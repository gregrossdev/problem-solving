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

	@Test
	void testCaesarCipher() {
		assertEquals("okffng-Qwvb", Strings.caesarCipher("middle-Outz", 2));
		assertEquals("Fqbfdx-Qttp-ts-ymj-Gwnlmy-Xnij-tk-Qnkj", Strings.caesarCipher("Always-Look-on-the-Bright-Side-of-Life", 5));
	}

	@Test
	void testMarsExploration() {
		assertEquals(3, Strings.marsExploration("SOSSPSSQSSOR"));
		assertEquals(1, Strings.marsExploration("SOSSOT"));
		assertEquals(0, Strings.marsExploration("SOSSOS"));
	}

	@Test
	void testHackerrankInString() {
		assertEquals("YES", Strings.hackerrankInString("hereiamstackerrank"));
		assertEquals("NO", Strings.hackerrankInString("hackerworld"));
		assertEquals("YES", Strings.hackerrankInString("hhaacckkekraraannk"));
		assertEquals("NO", Strings.hackerrankInString("rhbaasdndfsdskgbfefdbrsdfhuyatrjtcrtyytktjjt"));
	}
}