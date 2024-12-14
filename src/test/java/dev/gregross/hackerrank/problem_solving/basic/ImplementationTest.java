package dev.gregross.hackerrank.problem_solving.basic;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ImplementationTest {

	@Test
	void testGradingStudents() {
		List<Integer> grades = Arrays.asList(73, 67, 38, 33);
		List<Integer> expected = Arrays.asList(75, 67, 40, 33);
		List<Integer> result = Implementation.gradingStudents(grades);
		assertEquals(expected, result);
	}

	@Test
	void testCountApplesAndOranges() {
		List<Integer> apples = Arrays.asList(-2, 2, 1);
		List<Integer> oranges = Arrays.asList(5, -6);
		int s = 7, t = 11, a = 5, b = 15;

		// Redirecting System.out to capture the output
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));

		Implementation.countApplesAndOranges(s, t, a, b, apples, oranges);

		// Resetting System.out to its original state
		System.setOut(System.out);

		String expectedOutput = "1\n1\n";
		assertEquals(expectedOutput, outContent.toString());
	}

	@Test
	void testKangaroo() {
			assertEquals("YES", Implementation.kangaroo(0, 3, 4, 2));
			assertEquals("NO", Implementation.kangaroo(0, 2, 5, 3));
			assertEquals("NO", Implementation.kangaroo(21, 6, 47, 3));
			assertEquals("YES", Implementation.kangaroo(14, 4, 98, 2));
	}


	@Test
	void testGetTotalX() {
			List<Integer> a = Arrays.asList(2, 4);
			List<Integer> b = Arrays.asList(16, 32, 96);
			int expected = 3;
			int result = Implementation.getTotalX(a, b);
			assertEquals(expected, result);

			a = Arrays.asList(3, 4);
			b = Arrays.asList(24, 48);
			expected = 2;
			result = Implementation.getTotalX(a, b);
			assertEquals(expected, result);

			a = Arrays.asList(1);
			b = Arrays.asList(100);
			expected = 9;
			result = Implementation.getTotalX(a, b);
			assertEquals(expected, result);
	}

	@Test
	void testBreakingRecords() {
			List<Integer> scores = Arrays.asList(10, 5, 20, 20, 4, 5, 2, 25, 1);
			List<Integer> expected = Arrays.asList(2, 4);
			List<Integer> result = Implementation.breakingRecords(scores);
			assertEquals(expected, result);

			scores = Arrays.asList(3, 4, 21, 36, 10, 28, 35, 5, 24, 42);
			expected = Arrays.asList(4, 0);
			result = Implementation.breakingRecords(scores);
			assertEquals(expected, result);
	}

	@Test
	void testBirthday() {
			List<Integer> s = Arrays.asList(2, 2, 1, 3, 2);
			int d = 4;
			int m = 2;
			int expected = 2;
			int result = Implementation.birthday(s, d, m);
			assertEquals(expected, result);

			s = Arrays.asList(1, 2, 1, 3, 2);
			d = 3;
			m = 2;
			expected = 2;
			result = Implementation.birthday(s, d, m);
			assertEquals(expected, result);

			s = Arrays.asList(1, 1, 1, 1, 1, 1);
			d = 3;
			m = 2;
			expected = 0;
			result = Implementation.birthday(s, d, m);
			assertEquals(expected, result);
	}

	@Test
	void testDivisibleSumPairs() {
			List<Integer> ar = Arrays.asList(1, 3, 2, 6, 1, 2);
			int n = 6;
			int k = 3;
			int expected = 5;
			int result = Implementation.divisibleSumPairs(n, k, ar);
			assertEquals(expected, result);

			ar = Arrays.asList(1, 2, 3, 4, 5, 6);
			n = 6;
			k = 5;
			expected = 3;
			result = Implementation.divisibleSumPairs(n, k, ar);
			assertEquals(expected, result);

			ar = Arrays.asList(1, 1, 1, 1, 1, 1);
			n = 6;
			k = 2;
			expected = 15;
			result = Implementation.divisibleSumPairs(n, k, ar);
			assertEquals(expected, result);
	}

	@Test
	void testMigratoryBirds() {
			List<Integer> arr = Arrays.asList(1, 1, 2, 2, 3);
			int expected = 1;
			int result = Implementation.migratoryBirds(arr);
			assertEquals(expected, result);

			arr = Arrays.asList(1, 4, 4, 4, 5, 3);
			expected = 4;
			result = Implementation.migratoryBirds(arr);
			assertEquals(expected, result);

			arr = Arrays.asList(1, 1, 2, 2, 3, 3, 3);
			expected = 3;
			result = Implementation.migratoryBirds(arr);
			assertEquals(expected, result);
	}

	@Test
	void testDayOfProgrammer() {
			assertEquals("13.09.2017", Implementation.dayOfProgrammer(2017));
			assertEquals("12.09.2016", Implementation.dayOfProgrammer(2016));
			assertEquals("26.09.1918", Implementation.dayOfProgrammer(1918));
			assertEquals("12.09.2000", Implementation.dayOfProgrammer(2000));
			assertEquals("13.09.2100", Implementation.dayOfProgrammer(2100));
	}

	@Test
	void testBonAppetit() {
			List<Integer> bill = Arrays.asList(3, 10, 2, 9);
			int k = 1;
			int b = 12;

			ByteArrayOutputStream outContent = new ByteArrayOutputStream();
			System.setOut(new PrintStream(outContent));

			Implementation.bonAppetit(bill, k, b);

			System.setOut(System.out);

			String expectedOutput = "5\n";
			assertEquals(expectedOutput, outContent.toString());

			bill = Arrays.asList(3, 10, 2, 9);
			k = 1;
			b = 7;

			outContent = new ByteArrayOutputStream();
			System.setOut(new PrintStream(outContent));

			Implementation.bonAppetit(bill, k, b);

			System.setOut(System.out);

			expectedOutput = "Bon Appetit\n";
			assertEquals(expectedOutput, outContent.toString());
	}

	@Test
	void testSockMerchant() {
			List<Integer> ar = Arrays.asList(10, 20, 20, 10, 10, 30, 50, 10, 20);
			int n = 9;
			int expected = 3;
			int result = Implementation.sockMerchant(n, ar);
			assertEquals(expected, result);

			ar = Arrays.asList(1, 2, 1, 2, 1, 3, 2);
			n = 7;
			expected = 2;
			result = Implementation.sockMerchant(n, ar);
			assertEquals(expected, result);

			ar = Arrays.asList(1, 1, 1, 1, 1, 1);
			n = 6;
			expected = 3;
			result = Implementation.sockMerchant(n, ar);
			assertEquals(expected, result);
	}

	@Test
	void testPageCount() {
			assertEquals(1, Implementation.pageCount(6, 2));
			assertEquals(0, Implementation.pageCount(5, 4));
	}

	@Test
	void testCountingValleys() {
			assertEquals(1, Implementation.countingValleys(8, "UDDDUDUU"));
			assertEquals(2, Implementation.countingValleys(12, "DDUUDDUDUUUD"));
			assertEquals(0, Implementation.countingValleys(10, "UUUUUUUUUU"));
	}

	@Test
	void testGetMoneySpent() {
			int[] keyboards = {40, 50, 60};
			int[] drives = {5, 8, 12};
			int b = 60;
			int expected = 58;
			int result = Implementation.getMoneySpent(keyboards, drives, b);
			assertEquals(expected, result);

			keyboards = new int[]{4};
			drives = new int[]{5};
			b = 5;
			expected = -1;
			result = Implementation.getMoneySpent(keyboards, drives, b);
			assertEquals(expected, result);

			keyboards = new int[]{3, 1};
			drives = new int[]{5, 2, 8};
			b = 10;
			expected = 9;
			result = Implementation.getMoneySpent(keyboards, drives, b);
			assertEquals(expected, result);
	}

	@Test
	void testCatAndMouse() {
			assertEquals("Cat B", Implementation.catAndMouse(1, 2, 3));
			assertEquals("Mouse C", Implementation.catAndMouse(1, 3, 2));
			assertEquals("Cat A", Implementation.catAndMouse(2, 5, 1));
	}

	@Test
	void testPickingNumbers() {
			List<Integer> a = Arrays.asList(4, 6, 5, 3, 3, 1);
			int expected = 3;
			int result = Implementation.pickingNumbers(a);
			assertEquals(expected, result);

			a = Arrays.asList(1, 2, 2, 3, 1, 2);
			expected = 5;
			result = Implementation.pickingNumbers(a);
			assertEquals(expected, result);

			a = Arrays.asList(1, 1, 1, 1, 1);
			expected = 5;
			result = Implementation.pickingNumbers(a);
			assertEquals(expected, result);
	}

	@Test
	void testDesignerPdfViewer() {
			List<Integer> h = Arrays.asList(1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5);
			String word = "abc";
			int expected = 9;
			int result = Implementation.designerPdfViewer(h, word);
			assertEquals(expected, result);

			h = Arrays.asList(1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 7);
			word = "zaba";
			expected = 28;
			result = Implementation.designerPdfViewer(h, word);
			assertEquals(expected, result);
	}

	@Test
	void testUtopianTree() {
			assertEquals(1, Implementation.utopianTree(0));
			assertEquals(2, Implementation.utopianTree(1));
			assertEquals(7, Implementation.utopianTree(4));
			assertEquals(6, Implementation.utopianTree(3));
			assertEquals(14, Implementation.utopianTree(5));
	}

	@Test
	void testAngryProfessor() {
			List<Integer> arrivalTimes = Arrays.asList(-1, -3, 4, 2);
			int k = 3;
			String expected = "YES";
			String result = Implementation.angryProfessor(k, arrivalTimes);
			assertEquals(expected, result);

			arrivalTimes = Arrays.asList(-1, -3, 4, 2);
			k = 2;
			expected = "NO";
			result = Implementation.angryProfessor(k, arrivalTimes);
			assertEquals(expected, result);

			arrivalTimes = Arrays.asList(0, -1, 2, 1);
			k = 2;
			expected = "NO";
			result = Implementation.angryProfessor(k, arrivalTimes);
			assertEquals(expected, result);
	}

	@Test
	void testBeautifulDays() {
			assertEquals(2, Implementation.beautifulDays(20, 23, 6));
			assertEquals(33, Implementation.beautifulDays(13, 45, 3));
	}

	@Test
	void testViralAdvertising() {
		assertEquals(9, Implementation.viralAdvertising(3));
		assertEquals(24, Implementation.viralAdvertising(5));
		assertEquals(15, Implementation.viralAdvertising(4));
	}

	@Test
	void testSaveThePrisoner() {
		assertEquals(2, Implementation.saveThePrisoner(5, 2, 1));
		assertEquals(3, Implementation.saveThePrisoner(5, 2, 2));
		assertEquals(6, Implementation.saveThePrisoner(7, 19, 2));
		assertEquals(3, Implementation.saveThePrisoner(3, 7, 3));
	}

	@Test
	void testCircularArrayRotation() {
		List<Integer> a = Arrays.asList(3, 4, 5);
		int k = 2;
		List<Integer> queries = Arrays.asList(1, 2);
		List<Integer> expected = Arrays.asList(5, 3);
		List<Integer> result = Implementation.circularArrayRotation(a, k, queries);
		assertEquals(expected, result);

		a = Arrays.asList(1, 2, 3);
		k = 1;
		queries = Arrays.asList(0, 1, 2);
		expected = Arrays.asList(3, 1, 2);
		result = Implementation.circularArrayRotation(a, k, queries);
		assertEquals(expected, result);

		a = Arrays.asList(1, 2, 3, 4, 5);
		k = 3;
		queries = Arrays.asList(0, 2, 4);
		expected = Arrays.asList(3, 5, 2);
		result = Implementation.circularArrayRotation(a, k, queries);
		assertEquals(expected, result);
	}

	@Test
	void testPermutationEquation() {
			List<Integer> p = Arrays.asList(5, 2, 1, 3, 4);
			List<Integer> expected = Arrays.asList(4, 2, 5, 1, 3);
			List<Integer> result = Implementation.permutationEquation(p);
			assertEquals(expected, result);

			p = Arrays.asList(2, 3, 1);
			expected = Arrays.asList(2, 3, 1);
			result = Implementation.permutationEquation(p);
			assertEquals(expected, result);

			p = Arrays.asList(4, 3, 5, 1, 2);
			expected = Arrays.asList(1, 3, 5, 4, 2);
			result = Implementation.permutationEquation(p);
			assertEquals(expected, result);
	}

	@Test
	void testJumpingOnClouds() {
			int[] clouds = {0, 0, 1, 0, 0, 1, 1, 0};
			int k = 2;
			int expected = 92;
			int result = Implementation.jumpingOnClouds(clouds, k);
			assertEquals(expected, result);

			clouds = new int[]{1, 1, 1, 0, 1, 1, 0, 0, 0, 0};
			k = 3;
			expected = 80;
			result = Implementation.jumpingOnClouds(clouds, k);
			assertEquals(expected, result);
	}

	@Test
	void testFindDigits() {
			assertEquals(2, Implementation.findDigits(12));
			assertEquals(3, Implementation.findDigits(1012));
			assertEquals(0, Implementation.findDigits(0));
			assertEquals(1, Implementation.findDigits(1));
	}

	@Test
	void testAppendAndDelete() {
			assertEquals("Yes", Implementation.appendAndDelete("hackerhappy", "hackerrank", 9));
			assertEquals("Yes", Implementation.appendAndDelete("aba", "aba", 7));
			assertEquals("No", Implementation.appendAndDelete("ashley", "ash", 2));
			assertEquals("Yes", Implementation.appendAndDelete("abc", "def", 6));
	}

	@Test
	void testSquares() {
		assertEquals(2, Implementation.squares(3, 9));
		assertEquals(0, Implementation.squares(17, 24));
		assertEquals(1, Implementation.squares(1, 1));
		assertEquals(22, Implementation.squares(1, 500));
	}

	@Test
	void testLibraryFine() {
		assertEquals(45, Implementation.libraryFine(9, 6, 2015, 6, 6, 2015));
		assertEquals(0, Implementation.libraryFine(6, 6, 2015, 9, 6, 2015));
		assertEquals(0, Implementation.libraryFine(6, 6, 2015, 6, 6, 2015));
		assertEquals(10000, Implementation.libraryFine(1, 1, 2016, 31, 12, 2015));
	}

	@Test
	void testCutTheSticks() {
		List<Integer> arr = Arrays.asList(5, 4, 4, 2, 2, 8);
		List<Integer> expected = Arrays.asList(6, 4, 2, 1);
		List<Integer> result = Implementation.cutTheSticks(arr);
		assertEquals(expected, result);

		arr = Arrays.asList(1, 2, 3, 4, 3, 3, 2, 1);
		expected = Arrays.asList(8, 6, 4, 1);
		result = Implementation.cutTheSticks(arr);
		assertEquals(expected, result);

		arr = Arrays.asList(1, 1, 1, 1);
		expected = Arrays.asList(4);
		result = Implementation.cutTheSticks(arr);
		assertEquals(expected, result);
	}

	@Test
	void testRepeatedString() {
		assertEquals(7, Implementation.repeatedString("aba", 10));
		assertEquals(1000000000000L, Implementation.repeatedString("a", 1000000000000L));
		assertEquals(0, Implementation.repeatedString("b", 1000000000000L));
	}

	@Test
	void testJumpingOnCloudsAdv() {
		List<Integer> clouds = Arrays.asList(0, 0, 1, 0, 0, 1, 0);
		int expected = 4;
		int result = Implementation.jumpingOnClouds(clouds);
		assertEquals(expected, result);

		clouds = Arrays.asList(0, 0, 0, 0, 1, 0);
		expected = 3;
		result = Implementation.jumpingOnClouds(clouds);
		assertEquals(expected, result);

		clouds = Arrays.asList(0, 0, 0, 1, 0, 0);
		expected = 3;
		result = Implementation.jumpingOnClouds(clouds);
		assertEquals(expected, result);
	}

	@Test
	void testEqualizeArray() {
		List<Integer> arr = Arrays.asList(3, 3, 2, 1, 3);
		int expected = 2;
		int result = Implementation.equalizeArray(arr);
		assertEquals(expected, result);

		arr = Arrays.asList(1, 2, 2, 3);
		expected = 2;
		result = Implementation.equalizeArray(arr);
		assertEquals(expected, result);

		arr = Arrays.asList(1, 1, 1, 1);
		expected = 0;
		result = Implementation.equalizeArray(arr);
		assertEquals(expected, result);
	}

	@Test
	void testAcmTeam() {
		List<String> topic = Arrays.asList("10101", "11100", "11010", "00101");
		List<Integer> expected = Arrays.asList(5, 2);
		List<Integer> result = Implementation.acmTeam(topic);
		assertEquals(expected, result);

		topic = Arrays.asList("11101", "10101", "11001", "10111", "10000", "01110");
		expected = Arrays.asList(5, 6);
		result = Implementation.acmTeam(topic);
		assertEquals(expected, result);
	}

	@Test
	void testTaumBday() {
			assertEquals(20, Implementation.taumBday(10, 10, 1, 1, 1));
			assertEquals(37, Implementation.taumBday(5, 9, 2, 3, 4));
			assertEquals(12, Implementation.taumBday(3, 6, 9, 1, 1));
			assertEquals(12, Implementation.taumBday(3, 3, 1, 9, 2));
	}

	@Test
	void testKaprekarNumbers() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));

		Implementation.kaprekarNumbers(1, 100);

		System.setOut(System.out);

		String expectedOutput = "1 9 45 55 99";
		assertEquals(expectedOutput, outContent.toString().trim());
	}

	@Test
	void testBeautifulTriplets() {
		List<Integer> arr = Arrays.asList(1, 2, 4, 5, 7, 8, 10);
		int d = 3;
		int expected = 3;
		int result = Implementation.beautifulTriplets(d, arr);
		assertEquals(expected, result);

		arr = Arrays.asList(2, 2, 3, 4, 5);
		d = 1;
		expected = 3;
		result = Implementation.beautifulTriplets(d, arr);
		assertEquals(expected, result);

		arr = Arrays.asList(1, 3, 5, 7, 9);
		d = 2;
		expected = 3;
		result = Implementation.beautifulTriplets(d, arr);
		assertEquals(expected, result);
	}

	@Test
	void testMinimumDistances() {
		List<Integer> a = Arrays.asList(7, 1, 3, 4, 1, 7);
		int expected = 3;
		int result = Implementation.minimumDistances(a);
		assertEquals(expected, result);

		a = Arrays.asList(1, 2, 3, 4, 10);
		expected = -1;
		result = Implementation.minimumDistances(a);
		assertEquals(expected, result);

		a = Arrays.asList(1, 1);
		expected = 1;
		result = Implementation.minimumDistances(a);
		assertEquals(expected, result);
	}

	@Test
	void testHowManyGames() {
		assertEquals(6, Implementation.howManyGames(20, 3, 6, 80));
		assertEquals(1, Implementation.howManyGames(20, 3, 6, 20));
		assertEquals(0, Implementation.howManyGames(20, 3, 6, 19));
	}

	@Test
	void testChocolateFeast() {
		assertEquals(9, Implementation.chocolateFeast(15, 3, 2));
		assertEquals(6, Implementation.chocolateFeast(10, 2, 5));
		assertEquals(1, Implementation.chocolateFeast(1, 1, 2));
	}

	@Test
	void testServiceLane() {
		List<Integer> width = Arrays.asList(2, 3, 1, 2, 3, 2, 3, 3);
		List<List<Integer>> cases = Arrays.asList(
			Arrays.asList(0, 3),
			Arrays.asList(4, 6),
			Arrays.asList(6, 7),
			Arrays.asList(3, 5),
			Arrays.asList(0, 7)
		);
		List<Integer> expected = Arrays.asList(1, 2, 3, 2, 1);
		List<Integer> result = Implementation.serviceLane(8, width, cases);
		assertEquals(expected, result);

		width = Arrays.asList(1, 2, 2, 2, 1);
		cases = Arrays.asList(
			Arrays.asList(2, 3),
			Arrays.asList(1, 4),
			Arrays.asList(2, 4)
		);
		expected = Arrays.asList(2, 1, 1);
		result = Implementation.serviceLane(5, width, cases);
		assertEquals(expected, result);
	}
}