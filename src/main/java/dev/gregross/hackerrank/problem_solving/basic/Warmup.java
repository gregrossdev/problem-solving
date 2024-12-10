package dev.gregross.hackerrank.problem_solving.basic;

import java.util.ArrayList;
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

	// https://www.hackerrank.com/challenges/compare-the-triplets?isFullScreen=true
	public List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
		List<Integer> scores = new ArrayList<>();
		int aliceScore = 0;
		int bobScore = 0;
		for (int idx = 0; idx < a.size(); idx++) {
			int alice = a.get(idx);
			int bob   = b.get(idx);
			if(alice > bob) aliceScore++;
			else if(alice < bob) bobScore++;
		}

		scores.add(aliceScore);
		scores.add(bobScore);
		return scores;
	}

	// https://www.hackerrank.com/challenges/a-very-big-sum/problem?isFullScreen=true
	public long aVeryBigSum(List<Long> ar) {
		long sum = 0;
		for (Long num: ar) sum += num;

		return sum;
	}
}
