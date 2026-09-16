package daa.algorithms;

import daa.metrics.Metrics;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MergeSortTest {

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
            MergeSort.sort(actual, metrics);

            assertArrayEquals(expected, actual);
        }
    }

    @Test
    void testEdgeCases() {
        // Empty array
        int[] empty = {};
        MergeSort.sort(empty, metrics);
        assertArrayEquals(new int[]{}, empty);

        // 1 element
        int[] single = {42};
        MergeSort.sort(single, metrics);
        assertArrayEquals(new int[]{42}, single);

        // They're all the same
        int[] allSame = {5, 5, 5, 5, 5};
        MergeSort.sort(allSame, metrics);
        assertArrayEquals(new int[]{5, 5, 5, 5, 5}, allSame);

        // Already sorted
        int[] sorted = {1, 2, 3, 4, 5, 6, 7};
        MergeSort.sort(sorted, metrics);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7}, sorted);
    }

    @Test
    void testMetricsCollected() {
        int[] arr = {5, 2, 9, 1, 5, 6, 3, 8, 4, 7, 10, 15, 12, 14, 11, 13, 0};
        MergeSort.sort(arr, metrics);

        assertTrue(metrics.getComparisons() > 0);
        assertTrue(metrics.getMaxDepth() > 0);
        assertTrue(metrics.getTimeMs() >= 0.0);
    }
}