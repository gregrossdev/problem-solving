package dev.gregross.codewars.kyu7;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

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

	// https://www.codewars.com/kata/554b4ac871d6813a03000035/solutions/java?filter=me&sort=best_practice&invalids=false
	public String highAndLow(String numbers) {
		// split string into integers
		int[] nums = Arrays.stream(numbers.split(" "))
			.mapToInt(Integer::parseInt)
			.toArray();

		int max = Arrays.stream(nums).max().orElseThrow(NoSuchElementException::new);
		int min = Arrays.stream(nums).min().orElseThrow(NoSuchElementException::new);

		return max + " " + min;

	}

	// https://www.codewars.com/kata/5467e4d82edf8bbf40000155/solutions/java?filter=me&sort=best_practice&invalids=false
	public int sortDesc(final int num) {
		String str = String.valueOf(num)
			.chars()
			.map(ch -> ch - '0')
			.boxed()
			.sorted((a,b) -> b - a) // desc order
			.map(String::valueOf)
			.collect(Collectors.joining());

		return Integer.parseInt(str);

	}

	// https://www.codewars.com/kata/53dbd5315a3c69eed20002dd/solutions/java?filter=me&sort=best_practice&invalids=false
	public List<Object> filterList(final List<Object> list) {
		return list
			.stream()
			.filter(str -> !(str instanceof String))
			.collect(Collectors.toList());
	}

}
