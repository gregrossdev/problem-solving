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
}
