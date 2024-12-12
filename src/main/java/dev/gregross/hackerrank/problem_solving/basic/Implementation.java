package dev.gregross.hackerrank.problem_solving.basic;

import java.util.ArrayList;
import java.util.List;

public class Implementation {

	// https://www.hackerrank.com/challenges/grading/problem?isFullScreen=true
	public static List<Integer> gradingStudents(List<Integer> grades) {
		List<Integer> roundedGrades = new ArrayList<>();
		for (int grade : grades) {
			if(grade < 38 || grade % 5 < 3) {
				roundedGrades.add(grade);
			}
			else {
				int roundedGrade = (grade / 5 + 1) * 5;
				roundedGrades.add(roundedGrade);
			}
		}

		return roundedGrades;
	}

	// https://www.hackerrank.com/challenges/apple-and-orange/problem?isFullScreen=true
	public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
		int noOfApples  = 0;
		int noOfOranges = 0;

		for (int apple : apples) {
			int posDist = a + apple;
			if(posDist >= s && posDist <= t) noOfApples++;
		}

		for (int orange : oranges) {
			int posDist = b + orange;
			if(posDist >= s && posDist <= t) noOfOranges++;
		}

		System.out.println(noOfApples);
		System.out.println(noOfOranges);
	}

	// https://www.hackerrank.com/challenges/kangaroo/problem?isFullScreen=true
	public static String kangaroo(int x1, int v1, int x2, int v2) {
		// check if both kangaroos end in the same location
		int kangaroo1 = x1;
		int kangaroo2 = x2;
		int maxJumps = 10000;
		int jumps = 0;
		while (jumps < maxJumps) {
			kangaroo1 += v1;
			kangaroo2 += v2;

			if(kangaroo1 == kangaroo2) return "YES";

			jumps++;
		}

		return "NO";
	}

	// https://www.hackerrank.com/challenges/between-two-sets/problem?isFullScreen=true
	public static int getTotalX(List<Integer> a, List<Integer> b) {
		int lcmA = lcmOfArray(a);
		int gcdB = gcdOfArray(b);

		int count = 0;
		for (int i = lcmA, j = 2; i <= gcdB; i = lcmA * j, j++) {
			if (gcdB % i == 0) {
				count++;
			}
		}

		return count;
	}

	static int lcmOfArray(List<Integer> arr) {
		int result = arr.get(0);
		for (int i = 1; i < arr.size(); i++) {
			result = lcm(result, arr.get(i));
		}
		return result;
	}

	static int gcdOfArray(List<Integer> arr) {
		int result = arr.get(0);
		for (int i = 1; i < arr.size(); i++) {
			result = gcd(result, arr.get(i));
		}
		return result;
	}

	static int gcd(int a, int b) {
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}

	static int lcm(int a, int b) {
		return a * (b / gcd(a, b));
	}


}
