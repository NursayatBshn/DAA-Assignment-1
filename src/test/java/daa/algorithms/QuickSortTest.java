package daa.algorithms;

import daa.metrics.Metrics;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class QuickSortTest {

    private Metrics metrics;
    private Random random;

    @BeforeEach
    void setUp() {
        metrics = new Metrics();
        random = new Random(42);
    }

    @Test
    void testRandomArraysAgainstJdkSort() {
        for (int t = 0; t < 100; t++) {
            int n = random.nextInt(1000) + 1;
            int[] actual = random.ints(n, -10_000, 10_000).toArray();
            int[] expected = actual.clone();

            Arrays.sort(expected);
            QuickSort.sort(actual, metrics);

            assertArrayEquals(expected, actual);
        }
    }

    @Test
    void testEdgeCases() {
        // Empty array
        int[] empty = {};
        QuickSort.sort(empty, metrics);
        assertArrayEquals(new int[]{}, empty);

        // 1 element
        int[] single = {42};
        QuickSort.sort(single, metrics);
        assertArrayEquals(new int[]{42}, single);

        // They're all the same
        int[] allSame = {7, 7, 7, 7, 7, 7, 7};
        QuickSort.sort(allSame, metrics);
        assertArrayEquals(new int[]{7, 7, 7, 7, 7, 7, 7}, allSame);

        // Already sorted
        int[] sorted = {1, 2, 3, 4, 5, 6, 7};
        QuickSort.sort(sorted, metrics);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7}, sorted);
    }

    @Test
    void testSortedArrayDepthCheck() {
        int n = 100_000;
        int[] sortedArray = new int[n];
        for (int i = 0; i < n; i++) {
            sortedArray[i] = i;
        }

        QuickSort.sort(sortedArray, metrics);

        double maxAllowedDepth = 2.0 * (Math.log(n) / Math.log(2.0));
        assertTrue(metrics.getMaxDepth() <= maxAllowedDepth,
                "maxDepth (" + metrics.getMaxDepth() + ") should be <= 2 * log2(n) (" + maxAllowedDepth + ")");
    }
}