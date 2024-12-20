package dev.gregross.hackerrank.problem_solving.basic;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

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
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));

		try {
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
		} finally {
			// Reset System.out to its original state
			System.setOut(originalOut);
		}
	}

	@Test
	void testFunnyString() {
		assertEquals("Funny", Strings.funnyString("acxz"));
		assertEquals("Not Funny", Strings.funnyString("bcxz"));
		assertEquals("Funny", Strings.funnyString("abcdcba"));
	}

	@Test
	void testGemstones() {
		assertEquals(2, Strings.gemstones(Arrays.asList("abcdde", "baccd", "eeabg")));
		assertEquals(0, Strings.gemstones(Arrays.asList("abc", "def", "ghi")));
		assertEquals(1, Strings.gemstones(Arrays.asList("abc", "bcd", "cde")));
		assertEquals(3, Strings.gemstones(Arrays.asList("xyz", "xyz", "xyz")));
	}

	@Test
	void testAlternatingCharacters() {
		assertEquals(6, Strings.alternatingCharacters("AAABBBAABB"));
		assertEquals(3, Strings.alternatingCharacters("ABBABBAA"));
		assertEquals(4, Strings.alternatingCharacters("AAABBB"));
		assertEquals(1, Strings.alternatingCharacters("ABABABAA"));
	}

	@Test
	void testBeautifulBinaryString() {
		assertEquals(2, Strings.beautifulBinaryString("0101010"));
		assertEquals(0, Strings.beautifulBinaryString("1111111"));
		assertEquals(1, Strings.beautifulBinaryString("010"));
		assertEquals(3, Strings.beautifulBinaryString("0100101010"));
	}

	@Test
	void testTheLoveLetterMystery() {
		assertEquals(2, Strings.theLoveLetterMystery("abc"));
		assertEquals(0, Strings.theLoveLetterMystery("aaa"));
		assertEquals(4, Strings.theLoveLetterMystery("abcd"));
		assertEquals(0, Strings.theLoveLetterMystery("racecar"));
		assertEquals(2, Strings.theLoveLetterMystery("cba"));
	}

	@Test
	void testPalindromeIndex() {
		assertEquals(3, Strings.palindromeIndex("aaab"));
		assertEquals(0, Strings.palindromeIndex("baa"));
		assertEquals(-1, Strings.palindromeIndex("aaa"));
		assertEquals(-1, Strings.palindromeIndex("racecar"));
	}

	@Test
	void testAnagram() {
		assertEquals(3, Strings.anagram("asdfjoieufoa"));
		assertEquals(5, Strings.anagram("fdhlvosfpafhalll"));
		assertEquals(5, Strings.anagram("mvdalvkiopaufl"));
		assertEquals(0, Strings.anagram("xyyx"));
		assertEquals(2, Strings.anagram("mnop"));
		assertEquals(-1, Strings.anagram("abc"));
	}

	@Test
	void testMakingAnagrams() {
		assertEquals(4, Strings.makingAnagrams("cde", "abc"));
		assertEquals(0, Strings.makingAnagrams("abc", "abc"));
		assertEquals(19, Strings.makingAnagrams("absdjkvuahdakejfnfauhdsaavasdlkj", "djfladfhiawasdkjvalskufhafablsdkashlahdfa"));
		assertEquals(1, Strings.makingAnagrams("a", "ab"));
	}

	@Test
	void testGameOfThrones() {
		assertEquals("YES", Strings.gameOfThrones("aaabbbb"));
		assertEquals("NO", Strings.gameOfThrones("cdefghmnopqrstuvw"));
		assertEquals("YES", Strings.gameOfThrones("cdcdcdcdeeeef"));
	}

	@Test
	void testTwoStrings() {
		assertEquals("YES", Strings.twoStrings("hello", "world"));
		assertEquals("NO", Strings.twoStrings("hi", "world"));
		assertEquals("YES", Strings.twoStrings("a", "a"));
		assertEquals("NO", Strings.twoStrings("abc", "def"));
		assertEquals("YES", Strings.twoStrings("abc", "cde"));
	}

	@Test
	void testStringConstruction() {
		assertEquals(4, Strings.stringConstruction("abcd"));
		assertEquals(1, Strings.stringConstruction("aaaa"));
		assertEquals(5, Strings.stringConstruction("abcde"));
	}
}