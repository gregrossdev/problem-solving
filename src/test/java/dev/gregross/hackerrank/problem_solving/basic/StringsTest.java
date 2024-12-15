package dev.gregross.hackerrank.problem_solving.basic;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

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

	@Test
	void testPangrams() {
		assertEquals("pangram", Strings.pangrams("The quick brown fox jumps over the lazy dog"));
		assertEquals("not pangram", Strings.pangrams("Hello world"));
		assertEquals("pangram", Strings.pangrams("Pack my box with five dozen liquor jugs"));
		assertEquals("not pangram", Strings.pangrams("This is not a pangram"));
	}

	@Test
	void testSeparateNumbers() {
		// Redirect System.out to capture the output
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));

		Strings.separateNumbers("1234");
		assertEquals("YES 1\n", outContent.toString());

		outContent.reset();
		Strings.separateNumbers("91011");
		assertEquals("YES 9\n", outContent.toString());

		outContent.reset();
		Strings.separateNumbers("99100");
		assertEquals("YES 99\n", outContent.toString());

		outContent.reset();
		Strings.separateNumbers("101103");
		assertEquals("NO\n", outContent.toString());

		outContent.reset();
		Strings.separateNumbers("010203");
		assertEquals("NO\n", outContent.toString());

		// Reset System.out to its original state
		System.setOut(System.out);
	}
}