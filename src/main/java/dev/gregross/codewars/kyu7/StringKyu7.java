package dev.gregross.codewars.kyu7;

public class StringKyu7 {


/*
	You are going to be given a non-empty string. Your job is to return the middle character(s) of the string.

	If the string's length is odd, return the middle character.
	If the string's length is even, return the middle 2 characters.
	Examples:
	"test" --> "es"
	"testing" --> "t"
	"middle" --> "dd"
	"A" --> "A"

	Fundamentals Strings
*/

	public static String getMiddle(String word) {
		int len = word.length();
		int mid = len / 2;
		if (len % 2 == 0 ){
			return word.substring(mid-1,mid+1);
		}
		else {
			return word.substring(mid,mid+1);
		}
	}

}