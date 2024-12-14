package dev.gregross.hackerrank.problem_solving.basic;

import java.util.*;

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

	// https://www.hackerrank.com/challenges/strange-advertising/problem?isFullScreen=true
	public static int viralAdvertising(int n) {
		// determine how many people have liked the ad by the end of a given day
		// shared with exactly 5 recipients per day
		int shared = 5;
		// liked ( recipients / 2 )
		int liked = (int) Math.floor(shared / 2.0);
		int cumulative = liked; // total likes

		for(int day = 2; day <= n; day++) {
			// ( recipients / 2 ) like and share with 3 friends on the following day
			shared = liked * 3;
			liked = (int) Math.floor(shared / 2.0);
			cumulative += liked;
		}

		return cumulative;

	}

	// https://www.hackerrank.com/challenges/save-the-prisoner/problem?isFullScreen=true
	public static int saveThePrisoner(int n, int m, int s) {
		// Find chair number that last candy is distributed to
		// s = startingChair
		// n = numberOfPrisoners
		// m = numberOfSweets

		// Calculate the chair number in a circular manner
		int chair = (s + m - 1) % n;

		// Handle the edge case when chair number is 0 (last chair)
		if (chair == 0) {
			chair = n; // Set to the last chair
		}

		// Return the chair number of the last prisoner to receive candy
		return chair;
	}

	// https://www.hackerrank.com/challenges/circular-array-rotation/problem?isFullScreen=true
	public static List<Integer> circularArrayRotation(List<Integer> a, int k, List<Integer> queries) {
		// perform a number of right circular rotations and return the values of the elements at the given indices
		List<Integer> results = new ArrayList<>();
		// rotated array
		int n = a.size();
		Integer[] rotatedArray = new Integer[n];
		for (int idx = 0; idx < n; idx++) {
			// rotate index by k rotations find updated index by finding remainder
			// (0 + 2) % 5 = 2
			// (1 + 2) % 5 = 3
			// (2 + 2) % 5 = 4
			// (3 + 2) % 5 = 0
			// (4 + 2) % 5 = 1
			int rIdx = (idx + k) % n;
			rotatedArray[rIdx] = a.get(idx);
		}

		List<Integer> rotatedList = Arrays.asList(rotatedArray);
		for (int queryIdx : queries) {
			results.add(rotatedList.get(queryIdx));
		}

		return results;

	}

	// https://www.hackerrank.com/challenges/permutation-equation/problem?isFullScreen=true
	public static List<Integer> permutationEquation(List<Integer> p) {
		// find any integer  such that p(p(y)) = x and keep a history of the values of  in a return array
		List<Integer> result = new ArrayList<>();

		// Create a map to store the index of each element
		Map<Integer, Integer> map = new HashMap<>();

		// Populate the map with the index of each element
		for (int i = 0; i < p.size(); i++) {
			map.put(p.get(i), i + 1); // Add 1 to convert to 1-based index
		}

		// Step 3: Iterate over the sequence
		for (int y = 1; y <= p.size(); y++) {
			// Find the index of y in the sequence
			int i = map.get(y);

			// Find the index of i in the sequence to get p(p(y))
			int j = map.get(i);

			// Step 5: Add p(p(y)) to the result list
			result.add(j);
		}

		// Step 6: Return the list of values
		return result;
	}

	// https://www.hackerrank.com/challenges/jumping-on-the-clouds-revisited/problem?isFullScreen=true
	public static int jumpingOnClouds(int[] c, int k) {
		int n = c.length;
		int energy = 100; // Initial energy level
		int i = 0; // Start from the first cloud

		// Simulate the jumps through the clouds
		do {
			i = (i + k) % n; // Move to the next cloud after k steps
			energy--; // Decrease energy by 1 for each jump
			if (c[i] == 1) {
				// If the cloud is a thundercloud, decrease energy by an additional 2 units
				energy -= 2;
			}
		} while (i != 0); // Repeat until reaching the starting cloud

		return energy;
	}

	// https://www.hackerrank.com/challenges/find-digits/problem?isFullScreen=true
	public static int findDigits(int n) {
		// Given an integer, for each digit that makes up the integer determine whether it is a divisor. Count the number of divisors occurring within the integer.
		int countDivisors = 0;
		// convert int to string to get values in an array
		String nStr = Integer.toString(n);
		for(int idx = 0; idx < nStr.length(); idx++) {
			int number = Character.getNumericValue(nStr.charAt(idx));
			if(number != 0 && n % number == 0) countDivisors++;
		}

		return countDivisors;
	}

	// https://www.hackerrank.com/challenges/append-and-delete/problem?isFullScreen=true
	public static String appendAndDelete(String s, String t, int k) {
		if (s.length() + t.length() <= k) return "Yes";

		int lengthOfCommonSubstring = 0;
		for (int i = 0; i < s.length() && i < t.length() ; i++) {
			if (s.charAt(i) == t.charAt(i)) {
				lengthOfCommonSubstring++;
				continue;
			}
			break;
		}

		int minNecessaryOperations = (s.length() - lengthOfCommonSubstring) + (t.length() - lengthOfCommonSubstring);
		if (minNecessaryOperations > k) return "No";
		if (minNecessaryOperations == k) return "Yes";

		int restOperations = k - minNecessaryOperations;

		if (lengthOfCommonSubstring * 2 >= restOperations) return restOperations % 2 == 0 ? "Yes" : "No";

		return "Yes";
	}

	// https://www.hackerrank.com/challenges/sherlock-and-squares/problem?isFullScreen=true
	public static int squares(int a, int b) {
		// determine the number of square integers within range of a to b
		int sqrtA = (int) Math.ceil(Math.sqrt(a));
		int sqrtB = (int) Math.floor(Math.sqrt(b));

		// Count the number of square integers between sqrtA and sqrtB
		return sqrtB - sqrtA + 1;
	}

	// https://www.hackerrank.com/challenges/library-fine/problem?isFullScreen=true
	public static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
		// Calculate the fine for returning the book late
		int fine = 0;
		// same year?
		// the fine is fixed at 10000
		if(y1 > y2) fine = 10000;
			// same month?
			// The fine is calculated as 500 * (the number of months late)
		else if(y1 == y2 && m1 > m2) fine = 500 * (m1 - m2);
			// same day?
			// The fine is calculated as 15 * (the number of days late)
		else if(y1 == y2 && m1 == m2 && d1 > d2) fine = 15 * (d1 - d2);
		// on time
		// if book return date <= return date the fine is 0
		return fine;
	}

	// https://www.hackerrank.com/challenges/cut-the-sticks/problem?isFullScreen=true
	public static List<Integer> cutTheSticks(List<Integer> arr) {
		// Sort the list in non-decreasing order
		Collections.sort(arr);

		List<Integer> result = new ArrayList<>();
		int n = arr.size();
		int i = 0;

		while (i < n) {
			// Add the number of remaining sticks to the result list
			result.add(n - i);

			// Find the length of the current smallest stick
			int minStick = arr.get(i);

			// Skip sticks with the same length as the current smallest stick
			while (i < n && arr.get(i) == minStick) {
				i++;
			}
		}

		return result;
	}

	// https://www.hackerrank.com/challenges/repeated-string/problem?isFullScreen=true
	public static long repeatedString(String s, long n) {
		// Count the number of occurrences of 'a' in the repeated string
		long count = 0;

		// Count the number of 'a's in the original string
		long originalCount = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a') {
				originalCount++;
			}
		}

		// Calculate the number of times the original string is repeated
		long repeats = n / s.length();

		// Calculate the number of 'a's in the repeated string
		count = repeats * originalCount;

		// Calculate the number of remaining characters in the repeated string
		long remaining = n % s.length();

		// Count the number of 'a's in the remaining characters
		for (int i = 0; i < remaining; i++) {
			if (s.charAt(i) == 'a') {
				count++;
			}
		}

		return count;

	}

	// https://www.hackerrank.com/challenges/jumping-on-the-clouds/problem?isFullScreen=true
	public static int jumpingOnClouds(List<Integer> c) {
		// Find the minimum number of jumps required to reach the last cloud
		int jumps = 0;
		int i = 0;

		while (i < c.size() - 1) {
			// Check if a jump of size 2 is possible
			if (i + 2 < c.size() && c.get(i + 2) == 0) {
				i += 2; // Jump 2 clouds
			} else {
				i++; // Jump 1 cloud
			}

			jumps++; // Increment the jump count
		}

		return jumps;

	}

	// https://www.hackerrank.com/challenges/equality-in-a-array/problem?isFullScreen=true
	public static int equalizeArray(List<Integer> arr) {
		// Find the minimum number of deletions required to make all elements in the array equal
		Map<Integer, Integer> frequencyMap = new HashMap<>();

		// Count the frequency of each element in the array
		for (int num : arr) {
			frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
		}

		// Find the element with the maximum frequency
		int maxFrequency = 0;
		for (int frequency : frequencyMap.values()) {
			maxFrequency = Math.max(maxFrequency, frequency);
		}

		// Calculate the minimum number of deletions required
		return arr.size() - maxFrequency;

	}

	// https://www.hackerrank.com/challenges/acm-icpc-team/problem?isFullScreen=true
	public static List<Integer> acmTeam(List<String> topic) {
		// Find the maximum number of topics a 2-person team can know and the number of teams that know that number of topics
		int n = topic.size();
		int m = topic.get(0).length();

		int maxTopics = 0;
		int maxTeams = 0;

		for (int i = 0; i < n; i++) {
			String person1 = topic.get(i);
			for (int j = i + 1; j < n; j++) {
				String person2 = topic.get(j);

				int topicsKnown = 0;
				for (int k = 0; k < m; k++) {
					if (person1.charAt(k) == '1' || person2.charAt(k) == '1') {
						topicsKnown++;
					}
				}

				if (topicsKnown > maxTopics) {
					maxTopics = topicsKnown;
					maxTeams = 1;
				} else if (topicsKnown == maxTopics) {
					maxTeams++;
				}
			}
		}

		return Arrays.asList(maxTopics, maxTeams);

	}

	// https://www.hackerrank.com/challenges/taum-and-bday/problem?isFullScreen=true
	public static long taumBday(int b, int w, int bc, int wc, int z) {
		// Calculate the minimum cost to purchase the gifts
		long cost = 0;

		// Calculate the cost of black and white gifts
		long blackCost = Math.min(bc, wc + z);
		long whiteCost = Math.min(wc, bc + z);

		// Calculate the total cost
		cost = (long) b * blackCost + (long) w * whiteCost;

		return cost;

	}

	// https://www.hackerrank.com/challenges/kaprekar-numbers/problem?isFullScreen=true
	public static void kaprekarNumbers(int p, int q) {
		// Find and print the Kaprekar numbers in the range [p, q]
		List<Integer> kaprekarNumbers = new ArrayList<>();

		for (int i = p; i <= q; i++) {
			long square = (long) i * i;
			String squareStr = String.valueOf(square);

			int d = squareStr.length() / 2;
			String leftStr = squareStr.substring(0, d);
			String rightStr = squareStr.substring(d);

			int left = leftStr.isEmpty() ? 0 : Integer.parseInt(leftStr);
			int right = rightStr.isEmpty() ? 0 : Integer.parseInt(rightStr);

			if (left + right == i) {
				kaprekarNumbers.add(i);
			}
		}

		if (kaprekarNumbers.isEmpty()) {
			System.out.println("INVALID RANGE");
		} else {
			for (int kaprekarNumber : kaprekarNumbers) {
				System.out.print(kaprekarNumber + " ");
			}
		}

	}

	// https://www.hackerrank.com/challenges/beautiful-triplets/problem?isFullScreen=true
	public static int beautifulTriplets(int d, List<Integer> arr) {
		// Find the number of beautiful triplets in the array
		int count = 0;
		Set<Integer> set = new HashSet<>(arr);

		for (int num : arr) {
			if (set.contains(num + d) && set.contains(num + 2 * d)) {
				count++;
			}
		}

		return count;
	}

	// https://www.hackerrank.com/challenges/minimum-distances/problem?isFullScreen=true
	public static int minimumDistances(List<Integer> a) {
		// Find the minimum distance between any two equal elements in the array
		int minDistance = Integer.MAX_VALUE;
		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < a.size(); i++) {
			int num = a.get(i);

			if (map.containsKey(num)) {
				int distance = i - map.get(num);
				minDistance = Math.min(minDistance, distance);
			}

			map.put(num, i);
		}

		return minDistance == Integer.MAX_VALUE ? -1 : minDistance;

	}

	// https://www.hackerrank.com/challenges/halloween-sale/problem?isFullScreen=true
	public static int howManyGames(int p, int d, int m, int s) {
		// Calculate the number of games that can be bought with the given budget
		int games = 0;
		int currentPrice = p;

		while (s >= currentPrice) {
			games++;
			s -= currentPrice;
			currentPrice = Math.max(currentPrice - d, m);
		}

		return games;

	}

	// https://www.hackerrank.com/challenges/chocolate-feast/problem?isFullScreen=true
	public static int chocolateFeast(int n, int c, int m) {
		// Calculate the number of chocolates that can be bought with the given amount of money
		int chocolates = n / c;
		int wrappers = chocolates;

		while (wrappers >= m) {
			int freeChocolates = wrappers / m;
			chocolates += freeChocolates;
			wrappers = freeChocolates + (wrappers % m);
		}

		return chocolates;

	}

	// https://www.hackerrank.com/challenges/service-lane/problem?isFullScreen=true
	public static List<Integer> serviceLane(int n, List<Integer> width, List<List<Integer>> cases) {
		List<Integer> maxWidth = new ArrayList<>();

		for (int i = 0; i < cases.size(); i++) {
			int startIndex = cases.get(i).get(0);
			int endIndex = cases.get(i).get(1);

			List<Integer> tempArray = new ArrayList<>(width.subList(startIndex, endIndex + 1));
			Collections.sort(tempArray);
			maxWidth.add(tempArray.get(0));
		}
		return maxWidth;
	}

	// https://www.hackerrank.com/challenges/lisa-workbook/problem?isFullScreen=true
	public static int workbook(int n, int k, List<Integer> arr) {
		// Find the number of special problems in Lisa's workbook
		int specialProblems = 0;
		int pageNumber = 1;

		for (int i = 0; i < n; i++) {
			int problems = arr.get(i);
			for (int j = 1; j <= problems; j++) {
				if (j == pageNumber) {
					specialProblems++;
				}
				if (j == problems || j % k == 0) {
					pageNumber++;
				}
			}
		}

		return specialProblems;

	}

	// https://www.hackerrank.com/challenges/fair-rations/problem?isFullScreen=true
	public static String fairRations(List<Integer> B) {
		// Find the minimum number of loaves required to distribute bread so that every person has an even number of loaves
		int loaves = 0;

		for (int i = 0; i < B.size() - 1; i++) {
			if (B.get(i) % 2 != 0) {
				B.set(i, B.get(i) + 1);
				B.set(i + 1, B.get(i + 1) + 1);
				loaves += 2;
			}
		}

		if (B.get(B.size() - 1) % 2 != 0) {
			return "NO";
		} else {
			return String.valueOf(loaves);
		}

	}

	// https://www.hackerrank.com/challenges/cavity-map/problem?isFullScreen=true
	public static List<String> cavityMap(List<String> grid) {
		// Find and mark the cavities in the grid
		List<String> result = new ArrayList<>();
		int n = grid.size();

		for (int i = 0; i < n; i++) {
			if (i == 0 || i == n - 1) {
				result.add(grid.get(i));
				continue;
			}

			StringBuilder row = new StringBuilder();
			row.append(grid.get(i).charAt(0));

			for (int j = 1; j < n - 1; j++) {
				int current = Character.getNumericValue(grid.get(i).charAt(j));
				int top = Character.getNumericValue(grid.get(i - 1).charAt(j));
				int bottom = Character.getNumericValue(grid.get(i + 1).charAt(j));
				int left = Character.getNumericValue(grid.get(i).charAt(j - 1));
				int right = Character.getNumericValue(grid.get(i).charAt(j + 1));

				if (current > top && current > bottom && current > left && current > right) {
					row.append('X');
				} else {
					row.append(grid.get(i).charAt(j));
				}
			}

			row.append(grid.get(i).charAt(n - 1));
			result.add(row.toString());
		}

		return result;

	}

	// https://www.hackerrank.com/challenges/manasa-and-stones/problem?isFullScreen=true
	public static List<Integer> stones(int n, int a, int b) {
		// Find the possible values of the last stone after n - 1 turns
		Set<Integer> values = new HashSet<>();

		for (int i = 0; i < n; i++) {
			int value = i * a + (n - 1 - i) * b;
			values.add(value);
		}

		List<Integer> result = new ArrayList<>(values);
		Collections.sort(result);

		return result;
	}

	// https://www.hackerrank.com/challenges/happy-ladybugs/problem?isFullScreen=true
	public static String happyLadybugs(String b) {
		// Determine if the ladybugs can be made happy
		int[] frequency = new int[26];
		boolean hasEmptyCell = false;

		for (char cell : b.toCharArray()) {
			if (cell == '_') {
				hasEmptyCell = true;
			} else {
				frequency[cell - 'A']++;
			}
		}

		if (!hasEmptyCell) {
			for (int i = 0; i < b.length(); i++) {
				char cell = b.charAt(i);
				if ((i == 0 || b.charAt(i - 1) != cell) && (i == b.length() - 1 || b.charAt(i + 1) != cell)) {
					return "NO";
				}
			}
		}

		for (int count : frequency) {
			if (count == 1) {
				return "NO";
			}
		}

		return "YES";

	}

	// https://www.hackerrank.com/challenges/strange-code/problem?isFullScreen=true
	public static long strangeCounter(long t) {
		// Calculate the value of the counter at time t
		long cycle = 3;
		while (t > cycle) {
			t -= cycle;
			cycle *= 2;
		}

		return cycle - t + 1;
	}
}
