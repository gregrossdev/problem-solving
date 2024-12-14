package dev.gregross.hackerrank.problem_solving.basic;

import java.util.HashMap;
import java.util.Map;

public class Strings {

	// https://www.hackerrank.com/challenges/camelcase/problem?isFullScreen=true
	public static int camelcase(String s) {
		// count capital letters, first word given
		int count = 1;

		for(int idx = 0; idx < s.length(); idx++) {
			if(Character.isUpperCase(s.charAt(idx))) count++;
		}

		return count;
	}

	// https://www.hackerrank.com/challenges/strong-password/problem?isFullScreen=true
	public static int minimumNumber(int n, String password) {
		// Return the minimum number of characters to make the password strong
		int valid = 4;
		String numbers = "0123456789";
		String lowerCase = "abcdefghijklmnopqrstuvwxyz";
		String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String specialCharacters = "!@#$%^&*()-+";

		// Check each character in the password
		boolean containsNumber = false;
		boolean containsLowerCase = false;
		boolean containsUpperCase = false;
		boolean containsSpecialChar = false;

		for (char letter : password.toCharArray()) {
			if (numbers.contains(String.valueOf(letter))) {
				containsNumber = true;
			}
			else if (lowerCase.contains(String.valueOf(letter))) {
				containsLowerCase = true;
			}
			else if (upperCase.contains(String.valueOf(letter))) {
				containsUpperCase = true;
			}
			else if (specialCharacters.contains(String.valueOf(letter))) {
				containsSpecialChar = true;
			}
		}

		if (!containsNumber) valid--;
		if (!containsLowerCase) valid--;
		if (!containsUpperCase) valid--;
		if (!containsSpecialChar) valid--;

		// Check if the password is already at least 6 characters long
		if (n >= 6) return 0;
		else return Math.max(6 - n, valid);

	}

	// https://www.hackerrank.com/challenges/caesar-cipher-1/problem?isFullScreen=true
	public static String caesarCipher(String s, int k) {
		String encrypted = "";
		// rotate letters by k factor
		for (int idx = 0; idx < s.length(); idx++) {
			// add k to each character
			char letter  = s.charAt(idx);
			// character or not
			if(Character.isLetter(letter)) {
				// uppercase or not
				char type = Character.isUpperCase(letter) ? 'A' : 'a';
				char encryptedLetter = (char) ((letter - type + k) % 26 + type);
				// int asciiValuePlusK = (int) letter + k;
				// char encryptedLetter = (char) asciiValuePlusK;
				encrypted += encryptedLetter;
			}
			else {
				encrypted += letter;
			}
		}
		// returns encrypted string

		System.out.println(encrypted);

		return encrypted;
	}

	// https://www.hackerrank.com/challenges/mars-exploration/problem?isFullScreen=true
	public static int marsExploration(String s) {
		Map<Integer, Character> sosMap = new HashMap<>();

		sosMap.put(0, 'S');
		sosMap.put(1, 'O');
		sosMap.put(2, 'S');

		int count = 0;

		for(int idx = 0; idx < s.length(); idx++) {
			int key = idx % 3;
			if(s.charAt(idx) != sosMap.get(key)) count++;
		}

		return count;
	}

	// https://www.hackerrank.com/challenges/hackerrank-in-a-string/problem?isFullScreen=true
	public static String hackerrankInString(String s) {
		// check if subsesquence is in string
		String result = "NO";
		String subSeq = "hackerrank";
		// check lengths
		if(s.length() < subSeq.length()) return result;
		// compare indices of both strings (2 pointers)
		int sIdx      = 0;
		int subSeqIdx = 0;
		while(sIdx < s.length() && subSeqIdx < subSeq.length()) {
			// if subSeq char is in string move to the next index of subSeq
			if(subSeq.charAt(subSeqIdx) == s.charAt(sIdx)) subSeqIdx++;
			sIdx++;
		}

		// check if subSeq index value is equal to the length
		if(subSeqIdx == subSeq.length()) result = "YES";

		return result;
	}

	// https://www.hackerrank.com/challenges/pangrams/problem?isFullScreen=true
	public static String pangrams(String s) {
		// check if its a pangram meaning containing every letter of the alphabet
		String notPangram = "not pangram";
		// check if its over 26 characters
		if(s.length() < 26) return notPangram;
		// normalize string to lowercase
		s = s.toLowerCase();
		// check if the string contains all the letters of the alphabet
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		// loop to check indices of the alphabet to the string indices
		for(int idx = 0; idx < alphabet.length(); idx++) {
			// if char in alphabet not found (-1) in string return result
			if(s.indexOf(alphabet.charAt(idx)) == -1) return notPangram;
		}

		return "pangram";
	}
}
