package dev.gregross.codewars.kyu7;

public class Kyu7 {

	// https://www.codewars.com/kata/54ff3102c1bad923760001f3/solutions/java?filter=me&sort=best_practice&invalids=false
	public int getVowelCount(String str) {
		int count = 0;
		for (char ch: str.toCharArray()) {
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count++;
			}
		}
		return count;
	}

	// https://www.codewars.com/kata/52fba66badcd10859f00097e/solutions/java?filter=me&sort=best_practice&invalids=false
	public String disemvowel(String str) {
		StringBuilder newStr = new StringBuilder();
		str.chars()
			.filter(ch -> "aeiouAEIOU".indexOf(ch) == -1)
			.forEach(ch -> newStr.append((char) ch));

		return newStr.toString();
	}

	// https://www.codewars.com/kata/546e2562b03326a88e000020/solutions/java?filter=me&sort=best_practice&invalids=false
	public int squareDigits(int n) {
		String result = String.valueOf(n) // Convert number to string
			.chars() // Convert to IntStream of characters (ASCII values)
			.map(ch -> ch - '0') // Convert char to numeric value
			.map(chInt -> chInt * chInt) // Square each numeric value
			.mapToObj(String::valueOf) // Convert each square to string
			.reduce("", String::concat); // Concatenate all squared strings

		return Integer.parseInt(result); // Convert concatenated result back to integer
	}



}
