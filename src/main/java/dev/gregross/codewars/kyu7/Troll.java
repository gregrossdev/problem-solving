package dev.gregross.codewars.kyu7;

public class Troll {
/*
	Trolls are attacking your comment section!

	A common way to deal with this situation is to remove all of the vowels from the trolls' comments, neutralizing the threat.

	Your task is to write a function that takes a string and return a new string with all vowels removed.

	For example, the string "This website is for losers LOL!" would become "Ths wbst s fr lsrs LL!".

	Note: for this kata y isn't considered a vowel.

	Strings Regular Expressions Fundamentals
*/
	public static String disemvowel(String str) {
		StringBuilder newStr = new StringBuilder();
		str.chars()
			.filter(ch -> "aeiouAEIOU".indexOf(ch) == -1)
			.forEach(ch -> newStr.append((char) ch));

		return newStr.toString();
	}
}
