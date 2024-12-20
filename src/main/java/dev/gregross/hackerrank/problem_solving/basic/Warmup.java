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

	// https://www.hackerrank.com/challenges/diagonal-difference/problem?isFullScreen=true
	public int diagonalDifference(List<List<Integer>> arr) {
		int absoluteDiff = 0;
		int index = 0;

		int ltr = 0;
		int rtl = 0;
		int end = arr.size() - 1;
		while (index < arr.size()) {
			ltr += arr.get(index).get(index);
			rtl += arr.get(index).get(end - index);
			index++;
		}

		absoluteDiff = Math.abs(ltr - rtl);

		return absoluteDiff;
	}

	// https://www.hackerrank.com/challenges/plus-minus/problem?isFullScreen=true
	public void plusMinus(List<Integer> arr) {
		int totalValues = arr.size();
		double positiveValues = 0;
		double negativeValues = 0;
		double zeroValues     = 0;

		for (int value : arr) {
			if (value > 0) positiveValues++;
			else if (value < 0) negativeValues++;
			else zeroValues++;
		}

		System.out.printf("%.6f%n", positiveValues/totalValues);
		System.out.printf("%.6f%n", negativeValues/totalValues);
		System.out.printf("%.6f%n",     zeroValues/totalValues);

	}

	// https://www.hackerrank.com/challenges/staircase/problem?isFullScreen=true
	public void staircase(int n) {
		int spaces = 0;
		int hashes = 1;
		while(hashes <= n) {
			spaces = n - hashes;
			for(int i = 0; i < spaces; i++) System.out.print(" ");
			for(int i = 0; i < hashes; i++) System.out.print("#");
			System.out.println();
			hashes++;
		}

	}

	// https://www.hackerrank.com/challenges/mini-max-sum/problem?isFullScreen=true
	public void miniMaxSum(List<Integer> arr) {
		int min = Integer.MAX_VALUE;
		int max = 0;
		long totalSum = 0;

		for (int currentNumber : arr) {
			totalSum += currentNumber;
			if (currentNumber > max) max = currentNumber;
			if (currentNumber < min) min = currentNumber;
		}

		long minSum = totalSum - max;
		long maxSum = totalSum - min;

		System.out.println(minSum + " " + maxSum);
	}

	// https://www.hackerrank.com/challenges/birthday-cake-candles/problem?isFullScreen=true
	public int birthdayCakeCandles(List<Integer> candles) {
		int howMany = 0;
		int max = Integer.MIN_VALUE;

		for (Integer candle : candles) {
			if(candle > max) {
				max = candle;
				howMany = 1;
			}
			else if(candle == max) {
				howMany++;
			}
		}


		return howMany;
	}

	// https://www.hackerrank.com/challenges/time-conversion/problem?isFullScreen=true
	public String timeConversion(String s) {
		String timeOfDay = s.substring(s.length() - 2);
		String formattedTime;

		int hour = Integer.parseInt(s.substring(0, 2));
		if (timeOfDay.equals("PM")) {
			formattedTime = (hour == 12) ? s.substring(0, 8) : String.format("%02d%s", hour + 12, s.substring(2, 8));
		}
		else {
			formattedTime = (hour == 12) ? String.format("%02d%s", 0, s.substring(2, 8)) : s.substring(0, 8);
		}

		return formattedTime;
	}
}
