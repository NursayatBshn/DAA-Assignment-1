package daa.algorithms;

import daa.metrics.Metrics;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class QuickSelectTest {

    private Metrics metrics;
    private Random random;

    @BeforeEach
    void setUp() {
        metrics = new Metrics();
        random = new Random(42);
    }

    @Test
    void testRandomArraysAgainstJdkSort() {
        // Run test on at least 100 random arrays
        for (int t = 0; t < 100; t++) {
            int n = random.nextInt(1000) + 1;
            int[] actual = random.ints(n, -10_000, 10_000).toArray();
            int[] sortedCopy = actual.clone();
            Arrays.sort(sortedCopy);

            int k = random.nextInt(n);
            int expectedValue = sortedCopy[k];
            int actualValue = QuickSelect.select(actual, k, metrics);

            assertEquals(expectedValue, actualValue, "Failed at k=" + k + " for size=" + n);
        }
    }

    @Test
    void testEdgeCases() {
        // Single element array
        int[] single = {42};
        assertEquals(42, QuickSelect.select(single, 0, metrics));

        // Array with all equal elements
        int[] allSame = {5, 5, 5, 5, 5};
        assertEquals(5, QuickSelect.select(allSame, 2, metrics));

        // Already sorted array
        int[] sorted = {10, 20, 30, 40, 50};
        assertEquals(30, QuickSelect.select(sorted, 2, metrics));
    }

    @Test
    void testInvalidInputsThrowException() {
        // Empty array
        assertThrows(IllegalArgumentException.class, () -> QuickSelect.select(new int[]{}, 0, metrics));

        // Negative k
        assertThrows(IllegalArgumentException.class, () -> QuickSelect.select(new int[]{1, 2, 3}, -1, metrics));

        // Out of range k
        assertThrows(IllegalArgumentException.class, () -> QuickSelect.select(new int[]{1, 2, 3}, 3, metrics));
    }
}