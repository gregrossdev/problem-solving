package dev.gregross.codewars.kyu7;

public class SquareDigit {

/*
	Welcome. In this kata, you are asked to square every digit of a number and concatenate them.

	For example, if we run 9119 through the function, 811181 will come out, because 92 is 81 and 12 is 1. (81-1-1-81)

	Example #2: An input of 765 will/should return 493625 because 72 is 49, 62 is 36, and 52 is 25. (49-36-25)

	Note: The function accepts an integer and returns an integer.

	Happy Coding!

	Mathematics	Fundamentals
*/

	public int squareDigits(int n) {
		// Convert the number to a string, process each digit, square it, and concatenate
		String result = String.valueOf(n) // Convert number to string
			.chars() // Convert to IntStream of characters (ASCII values)
			.map(ch -> ch - '0') // Convert char to numeric value
			.map(chInt -> chInt * chInt) // Square each numeric value
			.mapToObj(String::valueOf) // Convert each square to string
			.reduce("", String::concat); // Concatenate all squared strings

		return Integer.parseInt(result); // Convert concatenated result back to integer
	}

}
