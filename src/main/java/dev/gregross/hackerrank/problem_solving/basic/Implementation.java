package dev.gregross.hackerrank.problem_solving.basic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

	// https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem?isFullScreen=true
	public static List<Integer> breakingRecords(List<Integer> scores) {
		// count number of games either max or min points were scored
		List<Integer> records = new ArrayList<>();

		int maxCount = 0;
		int minCount = 0;
		int maxScore = scores.get(0);
		int minScore = scores.get(0);

		for (int score : scores) {
			if(score < minScore) {
				minScore = score;
				minCount++;
			}
			if(score > maxScore) {
				maxScore = score;
				maxCount++;
			}
		}

		records.add(maxCount);
		records.add(minCount);

		return records;
	}

	// https://www.hackerrank.com/challenges/the-birthday-bar/problem?isFullScreen=true
	public static int birthday(List<Integer> s, int d, int m) {
		int count = 0;
		int sum = 0;
		// number of values possible is m (rons birth month)
		for (int i = 0; i < m; i++) {
			sum += s.get(i);
		}

		// Check the first window
		if (sum == d) {
			count++;
		}

		// Move the window and check subsequent subarrays
		for (int i = m; i < s.size(); i++) {
			sum += s.get(i) - s.get(i - m); // Slide the window by adding the next element and removing the first element

			// Check if the sum equals the target
			if (sum == d) {
				count++;
			}
		}

		return count;
	}

	// https://www.hackerrank.com/challenges/divisible-sum-pairs/problem?isFullScreen=true
	public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
		// count the number of pairs that are divisible by k
		int count = 0;
		for (int i = 0; i < ar.size(); i++) {
			for (int j = i + 1; j < ar.size(); j++) {
				if ((ar.get(i) + ar.get(j)) % k == 0) count++;
			}
		}

		return count;
	}

	// https://www.hackerrank.com/challenges/migratory-birds/problem?isFullScreen=true
	public static int migratoryBirds(List<Integer> arr) {
		Map<Integer, Integer> count = new HashMap<>();
		// create count occurrences object
		for (int birdId : arr) {
			count.put(birdId, count.getOrDefault(birdId, 0) + 1);
		}

		int bird = -1;
		int maxCount = 0;

		for (Map.Entry<Integer, Integer> entry: count.entrySet()) {
			int birdType  = entry.getKey();
			int birdCount = entry.getValue();
			if (birdCount > maxCount || (birdCount == maxCount && birdType < bird)) {
				bird = birdType;
				maxCount = birdCount;
			}
		}

		return bird;
	}

	// https://www.hackerrank.com/challenges/day-of-the-programmer/problem?isFullScreen=true
	public static String dayOfProgrammer(int year) {
		// convert date to another date
		// if leap year the 256th day is Sept 12
		// else Sept 13
		String day = "";
		if (year == 1918) {
			return "26.09.1918";
		}
		if((year < 1918 && year % 4 == 0) || (year > 1918 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)))) {
			day = "12";
		}
		else {
			day = "13";
		}


		return day + ".09." + year;
	}

	// https://www.hackerrank.com/challenges/bon-appetit/problem?isFullScreen=true
	public static void bonAppetit(List<Integer> bill, int k, int b) {
		// split the bill between anna and brian
		int total = 0;
		for (int idx = 0; idx < bill.size(); idx++) {
			if(idx != k) total += bill.get(idx);
		}

		int annaCost = total / 2;
		if (annaCost == b) System.out.println("Bon Appetit");
		else System.out.println(b - annaCost);

	}

	// https://www.hackerrank.com/challenges/sock-merchant/problem?isFullScreen=true
	public static int sockMerchant(int n, List<Integer> ar) {
		// count socks that do not have pairs
		int count = 0;
		// {1:3, 2:3, 3:1}
		Map<Integer, Integer> socks = new HashMap<>();
		for(int idx = 0; idx < ar.size(); idx++)
			socks.put(ar.get(idx), socks.getOrDefault(ar.get(idx), 0) + 1);

		for (Map.Entry<Integer, Integer> entry : socks.entrySet())
			count += entry.getValue() / 2;

		return count;
	}

	// https://www.hackerrank.com/challenges/drawing-book/problem?isFullScreen=true
	public static int pageCount(int n, int p) {
		int fromStart = p / 2; // Number of pages turned from the start
		int fromEnd = n / 2 - p / 2; // Number of pages turned from the end (Total pages from start - pages from start)
		return Math.min(fromStart, fromEnd); // Return the minimum of pages turned
	}

	// https://www.hackerrank.com/challenges/counting-valleys/problem?isFullScreen=true
	public static int countingValleys(int steps, String path) {
		// count the number of valleys walked through.
		int count = 0;

		int seaLevel = 0;
		boolean inValley = false;

		char[] charArray = path.toCharArray();
		for(char letter: charArray) {
			if(letter == 'U') seaLevel++;
			else if(letter == 'D') seaLevel--;

			if(seaLevel == 0) {
				if(inValley) count++;
				inValley = false;
			}
			else if(seaLevel < 0) inValley = true;
		}


		return count;
	}

	// https://www.hackerrank.com/challenges/electronics-shop/problem?isFullScreen=true
	public static int getMoneySpent(int[] keyboards, int[] drives, int b) {
		// determine most expensive keyboard and usb drive within a given budget
		int max = -1;

		// loop through both lists and check all combinations
		for (int keyboardPrice : keyboards) {
			for (int drivePrice : drives) {
				int price = keyboardPrice + drivePrice;

				if (price <= b && price > max)
					max = price;
			}
		}

		return max;
	}

	// https://www.hackerrank.com/challenges/cats-and-a-mouse/problem?isFullScreen=true
	public static String catAndMouse(int x, int y, int z) {
		// determine which cat will reach the mouse first
		// absolute units because of x-axis
		int unitsCatA = Math.abs(z - x);
		int unitsCatB = Math.abs(z - y);
		// conditional return
		if(unitsCatA < unitsCatB) return "Cat A";
		else if (unitsCatA > unitsCatB) return "Cat B";
		else return "Mouse C";
	}

	// https://www.hackerrank.com/challenges/picking-numbers/problem?isFullScreen=true
	public static int pickingNumbers(List<Integer> a) {
		Map<Integer, Integer> frequencyMap = new HashMap<>(); // Create a HashMap to store frequency of numbers

		// Count the frequency of each number in the array
		for (int num : a) {
			frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
		}

		int maxCount = 0; // Maximum count of elements satisfying the condition

		// Iterate through the keys in the frequency map
		for (int key : frequencyMap.keySet()) {
			int count = frequencyMap.get(key); // Get the frequency of the current number
			if (frequencyMap.containsKey(key - 1)) {
				count += frequencyMap.get(key - 1); // Add the frequency of the previous number if present
			}
			maxCount = Math.max(maxCount, count); // Update maxCount with the maximum count found
		}

		return maxCount;
	}

	// https://www.hackerrank.com/challenges/designer-pdf-viewer/problem?isFullScreen=true
	public static int designerPdfViewer(List<Integer> h, String word) {
		// determine the area of the rectangle highlight in assuming all letters arewide.
		// by finding tallest letter value and multiplying by the word length
		int tallest = 0;
		// loop through word and find tallest letter
		for (char letter : word.toCharArray()) {
			int idx = letter - 'a'; // 'a' is 97
			tallest = Math.max(tallest, h.get(idx));
		}

		return tallest * word.length();
	}

	// https://www.hackerrank.com/challenges/utopian-tree/problem?isFullScreen=true
	public static int utopianTree(int n) {
		// how tall after n cycles ?
		// initial height = 1;
		int height = 1;
		// first the size doubles and then increases by +1
		for (int period = 0; period < n; period++) {
			if(period % 2 == 0) height += height;
			else height += 1;
		}

		return height;
	}

	// https://www.hackerrank.com/challenges/angry-professor/problem?isFullScreen=true
	public static String angryProfessor(int k, List<Integer> a) {
		// determine if the class is cancelled
		// if greater than k (threshold)
		String cancelledClass = "";
		int inClassCount = 0;
		for(int student: a) {
			if(student <= 0) inClassCount++;
		}

		if(inClassCount >= k) cancelledClass = "NO";
		else cancelledClass = "YES";

		return cancelledClass;
	}

	// https://www.hackerrank.com/challenges/beautiful-days-at-the-movies/problem?isFullScreen=true
	public static int beautifulDays(int i, int j, int k) {
		int beautifulCount = 0;

		for (int day = i; day <= j; day++) {
			int reverse = reverse(day); // Get the reverse of the day
			int absoluteDifference = Math.abs(day - reverse); // Calculate the absolute difference

			if (absoluteDifference % k == 0) {
				beautifulCount++; // Increment the count if the absolute difference is divisible by k
			}
		}

		return beautifulCount;
	}

	static int reverse(int num) {
		int reversed = 0;
		while (num != 0) {
			reversed = reversed * 10 + num % 10;
			num /= 10;
		}
		return reversed;
	}

}
