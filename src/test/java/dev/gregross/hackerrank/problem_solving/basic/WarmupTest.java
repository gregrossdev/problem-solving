package dev.gregross.hackerrank.problem_solving.basic;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class WarmupTest {

    Warmup warmup = new Warmup();

    @Test
    void solveMeFirstTest() {
        assertEquals(5, warmup.solveMeFirst(2, 3));
        assertEquals(0, warmup.solveMeFirst(0, 0));
        assertEquals(-1, warmup.solveMeFirst(-2, 1));
        assertEquals(100, warmup.solveMeFirst(50, 50));
    }

    @Test
    void simpleArraySumTest() {
        assertEquals(6, warmup.simpleArraySum(Arrays.asList(1, 2, 3)));
        assertEquals(0, warmup.simpleArraySum(Arrays.asList()));
        assertEquals(-6, warmup.simpleArraySum(Arrays.asList(-1, -2, -3)));
        assertEquals(15, warmup.simpleArraySum(Arrays.asList(1, 2, 3, 4, 5)));
    }

    @Test
    void compareTripletsTest() {
        assertEquals(Arrays.asList(1, 1), warmup.compareTriplets(Arrays.asList(5, 6, 7), Arrays.asList(3, 6, 10)));
        assertEquals(Arrays.asList(0, 0), warmup.compareTriplets(Arrays.asList(1, 1, 1), Arrays.asList(1, 1, 1)));
        assertEquals(Arrays.asList(3, 0), warmup.compareTriplets(Arrays.asList(10, 20, 30), Arrays.asList(1, 2, 3)));
        assertEquals(Arrays.asList(0, 3), warmup.compareTriplets(Arrays.asList(1, 2, 3), Arrays.asList(10, 20, 30)));
    }

    @Test
    void aVeryBigSumTest() {
        assertEquals(5000000000L, warmup.aVeryBigSum(Arrays.asList(1000000000L, 1000000000L, 1000000000L, 1000000000L, 1000000000L)));
        assertEquals(0L, warmup.aVeryBigSum(Arrays.asList()));
        assertEquals(-6L, warmup.aVeryBigSum(Arrays.asList(-1L, -2L, -3L)));
        assertEquals(15L, warmup.aVeryBigSum(Arrays.asList(1L, 2L, 3L, 4L, 5L)));
    }

    @Test
    void diagonalDifferenceTest() {
        assertEquals(15, warmup.diagonalDifference(Arrays.asList(
            Arrays.asList(11, 2, 4),
            Arrays.asList(4, 5, 6),
            Arrays.asList(10, 8, -12)
        )));
        assertEquals(0, warmup.diagonalDifference(Arrays.asList(
            Arrays.asList(1, 1, 1),
            Arrays.asList(1, 1, 1),
            Arrays.asList(1, 1, 1)
        )));
        assertEquals(0, warmup.diagonalDifference(Arrays.asList(
            Arrays.asList(1, 2, 3),
            Arrays.asList(4, 5, 6),
            Arrays.asList(7, 8, 9)
        )));
        assertEquals(1, warmup.diagonalDifference(Arrays.asList(
					Arrays.asList(-1, 1, -7, -8),
					Arrays.asList(-10, -8, -5, -2),
					Arrays.asList(0, 9, 7, -1),
					Arrays.asList(4, 4, -2, 1)
        )));
    }

    @Test
    void plusMinusTest() {
        // Test case with positive, negative, and zero values
        warmup.plusMinus(Arrays.asList(-4, 3, -9, 0, 4, 1));
        // Test case with all positive values
        warmup.plusMinus(Arrays.asList(1, 2, 3, 4, 5));
        // Test case with all negative values
        warmup.plusMinus(Arrays.asList(-1, -2, -3, -4, -5));
        // Test case with all zero values
        warmup.plusMinus(Arrays.asList(0, 0, 0, 0, 0));
        // Test case with mixed values
        warmup.plusMinus(Arrays.asList(1, -1, 0, 1, -1, 0));
    }

    @Test
    void staircaseTest() {
        // Test case with n = 1
        System.out.println("Expected Output:\n#");
        warmup.staircase(1);

        // Test case with n = 2
        System.out.println("Expected Output:\n #\n##");
        warmup.staircase(2);

        // Test case with n = 3
        System.out.println("Expected Output:\n  #\n ##\n###");
        warmup.staircase(3);

        // Test case with n = 4
        System.out.println("Expected Output:\n   #\n  ##\n ###\n####");
        warmup.staircase(4);

        // Test case with n = 5
        System.out.println("Expected Output:\n    #\n   ##\n  ###\n ####\n#####");
        warmup.staircase(5);
    }

    @Test
    void miniMaxSumTest() {
        // Test case with distinct values
        System.out.println("Expected Output: 10 14");
        warmup.miniMaxSum(Arrays.asList(1, 2, 3, 4, 5));

        // Test case with all same values
        System.out.println("Expected Output: 4 4");
        warmup.miniMaxSum(Arrays.asList(1, 1, 1, 1, 1));

        // Test case with minimum and maximum integer values
        System.out.println("Expected Output: -9223372036854775808 9223372036854775807");
        warmup.miniMaxSum(Arrays.asList(Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0, 0));

        // Test case with negative values
        System.out.println("Expected Output: -14 -10");
        warmup.miniMaxSum(Arrays.asList(-1, -2, -3, -4, -5));

        // Test case with mixed values
        System.out.println("Expected Output: 6 24");
        warmup.miniMaxSum(Arrays.asList(1, 2, 3, 4, 14));
    }

    @Test
    void birthdayCakeCandlesTest() {
        // Test case with multiple tallest candles
        assertEquals(2, warmup.birthdayCakeCandles(Arrays.asList(3, 2, 1, 3)));

        // Test case with all candles of the same height
        assertEquals(5, warmup.birthdayCakeCandles(Arrays.asList(1, 1, 1, 1, 1)));

        // Test case with only one candle
        assertEquals(1, warmup.birthdayCakeCandles(Arrays.asList(5)));

        // Test case with no candles
        assertEquals(0, warmup.birthdayCakeCandles(Arrays.asList()));

        // Test case with negative and positive heights
        assertEquals(1, warmup.birthdayCakeCandles(Arrays.asList(-1, -2, -3, 0, 1)));
    }
}