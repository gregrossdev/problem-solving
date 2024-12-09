package dev.gregross.codewars.kyu7;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

public class MiddleTests {
	@Test
	public void basicTests() {
		assertEquals("es", StringKyu7.getMiddle("test"));
		assertEquals("dd", StringKyu7.getMiddle("middle"));
		assertEquals("t", StringKyu7.getMiddle("testing"));
		assertEquals("A", StringKyu7.getMiddle("A"));
	}

	private String middle(String word) {
		int mid = word.length() / 2;
		return (word.length() % 2 == 1 ? word.substring(mid, mid+1) : word.substring(mid-1, mid+1));
	}

	@Test
	public void randTests() {
		Random randGen = new Random();
		String alph = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		for (int i = 0; i < 50; i++) {
			int randLength = randGen.nextInt(1000)+1;
			String testWord = "";
			for (int e = 0; e < randLength; e++) {
				int alphI = randGen.nextInt(alph.length());
				testWord += alph.substring(alphI, alphI+1);
			}
			String expected = middle(testWord);
			String actual = StringKyu7.getMiddle(testWord);
			assertEquals(expected, actual);
		}
	}
}