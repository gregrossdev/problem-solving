package dev.gregross.codewars.kyu7;

public class Kyu7 {

	// https://www.codewars.com/kata/54ff3102c1bad923760001f3/solutions/java?filter=me&sort=best_practice&invalids=false
	public static int getVowelCount(String str) {
		int count = 0;
		for (char ch: str.toCharArray()) {
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count++;
			}
		}
		return count;
	}
}
