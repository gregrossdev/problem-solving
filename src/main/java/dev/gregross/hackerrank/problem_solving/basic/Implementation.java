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

}
