package dev.gregross.hackerrank.problem_solving.basic;

import java.util.List;

public class Warmup {

	// https://www.hackerrank.com/challenges/solve-me-first/problem?isFullScreen=true
	public int solveMeFirst(int a, int b) {
		return a + b;
	}

	// https://www.hackerrank.com/challenges/simple-array-sum/problem?isFullScreen=true
	public int simpleArraySum(List<Integer> ar) {
		int sum = 0;
		for (Integer num : ar) sum += num;

		return sum;
	}
}
