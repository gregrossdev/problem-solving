package dev.gregross.hackerrank.problem_solving.basic;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Strings {

	// https://www.hackerrank.com/challenges/camelcase/problem?isFullScreen=true
	public static int camelcase(String s) {
		// count capital letters, first word given
		int count = 1;

		for (int idx = 0; idx < s.length(); idx++) {
			if (Character.isUpperCase(s.charAt(idx))) count++;
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
			} else if (lowerCase.contains(String.valueOf(letter))) {
				containsLowerCase = true;
			} else if (upperCase.contains(String.valueOf(letter))) {
				containsUpperCase = true;
			} else if (specialCharacters.contains(String.valueOf(letter))) {
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
			char letter = s.charAt(idx);
			// character or not
			if (Character.isLetter(letter)) {
				// uppercase or not
				char type = Character.isUpperCase(letter) ? 'A' : 'a';
				char encryptedLetter = (char) ((letter - type + k) % 26 + type);
				// int asciiValuePlusK = (int) letter + k;
				// char encryptedLetter = (char) asciiValuePlusK;
				encrypted += encryptedLetter;
			} else {
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

		for (int idx = 0; idx < s.length(); idx++) {
			int key = idx % 3;
			if (s.charAt(idx) != sosMap.get(key)) count++;
		}

		return count;
	}

	// https://www.hackerrank.com/challenges/hackerrank-in-a-string/problem?isFullScreen=true
	public static String hackerrankInString(String s) {
		// check if subsesquence is in string
		String result = "NO";
		String subSeq = "hackerrank";
		// check lengths
		if (s.length() < subSeq.length()) return result;
		// compare indices of both strings (2 pointers)
		int sIdx = 0;
		int subSeqIdx = 0;
		while (sIdx < s.length() && subSeqIdx < subSeq.length()) {
			// if subSeq char is in string move to the next index of subSeq
			if (subSeq.charAt(subSeqIdx) == s.charAt(sIdx)) subSeqIdx++;
			sIdx++;
		}

		// check if subSeq index value is equal to the length
		if (subSeqIdx == subSeq.length()) result = "YES";

		return result;
	}

	// https://www.hackerrank.com/challenges/pangrams/problem?isFullScreen=true
	public static String pangrams(String s) {
		// check if its a pangram meaning containing every letter of the alphabet
		String notPangram = "not pangram";
		// check if its over 26 characters
		if (s.length() < 26) return notPangram;
		// normalize string to lowercase
		s = s.toLowerCase();
		// check if the string contains all the letters of the alphabet
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		// loop to check indices of the alphabet to the string indices
		for (int idx = 0; idx < alphabet.length(); idx++) {
			// if char in alphabet not found (-1) in string return result
			if (s.indexOf(alphabet.charAt(idx)) == -1) return notPangram;
		}

		return "pangram";
	}

	// https://www.hackerrank.com/challenges/separate-the-numbers/problem?isFullScreen=true
	public static void separateNumbers(String s) {
		boolean foundBeautiful = false;
		long firstNumber = -1;

		// Iterate through the string to find a beautiful sequence
		for (int length = 1; length <= s.length() / 2; length++) {
			long num = Long.parseLong(s.substring(0, length));
			firstNumber = num;
			String beautifulString = Long.toString(num);

			// Generate the beautiful sequence based on the first number
			while (beautifulString.length() < s.length()) {
				num++;
				beautifulString += Long.toString(num);
			}

			// Check if the generated sequence matches the input string
			if (beautifulString.equals(s)) {
				foundBeautiful = true;
				break;
			}
		}

		// Print the result
		if (foundBeautiful) {
			System.out.println("YES " + firstNumber);
		} else {
			System.out.println("NO");
		}

	}

	// https://www.hackerrank.com/challenges/funny-string/problem?isFullScreen=true
	public static String funnyString(String s) {
		// Initialize the result as "Not Funny"
		String result = "Not Funny";

		// Loop through the string, but stop one character before the end
		for (int i = 0; i < s.length() - 1; i++) {
			// Calculate the absolute difference in ASCII values between the current character and the next one
			char currentChar = s.charAt(i);
			char nextChar = s.charAt(i + 1);
			int sDiff = Math.abs(currentChar - nextChar);

			// Calculate the absolute difference in ASCII values between the current character and the next one,
			// but start from the end of the string and move towards the start
			char currentCharFromEnd = s.charAt(s.length() - 1 - i);
			char nextCharFromEnd = s.charAt(s.length() - 2 - i);
			int rDiff = Math.abs(currentCharFromEnd - nextCharFromEnd);

			// If the differences are not the same, return "Not Funny" immediately
			if (sDiff != rDiff) {
				return result;
			}
		}
		// If we've gone through the entire string and the differences have always been the same,
		// change the result to "Funny"
		result = "Funny";

		// Return the result
		return result;
	}

	// https://www.hackerrank.com/challenges/gem-stones/problem?isFullScreen=true
	public static int gemstones(List<String> arr) {
		// display the number of types of gemstones in the collection
		int countTypes = 0;
		// check if the gemstone is in all the strings
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		// loop through the alphabet
		int idx = 0;
		while(idx < alphabet.length()) {
			// check if the gemstone is in all the strings
			boolean isGemstone = true;
			for (String rock : arr) {
				if (rock.indexOf(alphabet.charAt(idx)) == -1) {
					isGemstone = false;
					break;
				}
			}
			if (isGemstone) countTypes++;
			// next letter
			idx++;
		}

		return countTypes;

	}

	// https://www.hackerrank.com/challenges/alternating-characters/problem?isFullScreen=true
	public static int alternatingCharacters(String s) {
		// find the minimum number of required deletions so that there are no matching adjacent characters.
		int minDeletes = 0;
		// check if the string has adjacent characters
		for (int idx = 0; idx < s.length() - 1; idx++) {
			// if the characters are the same increment the minDeletes
			if (s.charAt(idx) == s.charAt(idx + 1)) minDeletes++;
		}

		return minDeletes;

	}

	// https://www.hackerrank.com/challenges/beautiful-binary-string/problem?isFullScreen=true
	public static int beautifulBinaryString(String b) {
		int count = 0;
		// check for the substring "010" in the string
		for (int idx = 0; idx < b.length() - 2; idx++) {
			if (b.substring(idx, idx + 3).equals("010")) {
				// increment the count and move the index by 2
				count++;
				idx += 2;
			}
		}

		return count;

	}

	// https://www.hackerrank.com/challenges/the-love-letter-mystery/problem?isFullScreen=true
	public static int theLoveLetterMystery(String s) {
		// count minimum operations
		int minOperations = 0;
		// check for a palindrome in the string
		for (int idx = 0; idx < s.length() / 2; idx++) {
			// compare the characters from the start and end of the string
			char start = s.charAt(idx);
			char end = s.charAt(s.length() - 1 - idx);
			// find the difference in the characters
			minOperations += Math.abs(start - end);
		}

		return minOperations;

	}

	// https://www.hackerrank.com/challenges/palindrome-index/problem?isFullScreen=true
	public static int palindromeIndex(String s) {
		// check if the string is a palindrome
		int idx = 0;
		int endIdx = s.length() - 1;
		// loop through the string
		while (idx < endIdx) {
			// compare the characters from the start and end of the string
			if (s.charAt(idx) != s.charAt(endIdx)) {
				// check if the string is a palindrome if the character at the start is removed
				if (s.charAt(idx + 1) == s.charAt(endIdx) && s.charAt(idx + 2) == s.charAt(endIdx - 1)) {
					return idx;
				}
				else {
					return endIdx;
				}
			}
			idx++;
			endIdx--;
		}
		return -1;
	}

}
