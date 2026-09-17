package daa.algorithms;

import daa.metrics.Metrics;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class DeterministicSelectTest {

    private Metrics metrics;

    @BeforeEach
    void setUp() {
        metrics = new Metrics();
    }

    @Test
    void testSingleElement() {
        int[] arr = {42};
        assertEquals(42, DeterministicSelect.select(arr, 0, metrics));
    }

    @Test
    void testSmallArray() {
        int[] arr = {9, 1, 8, 2, 7, 3, 6, 4, 5};
        int[] sorted = arr.clone();
        Arrays.sort(sorted);

        for (int k = 0; k < arr.length; k++) {
            int[] copy = arr.clone();
            assertEquals(sorted[k], DeterministicSelect.select(copy, k, new Metrics()));
        }
    }

    @Test
    void testAllDuplicates() {
        int[] arr = {5, 5, 5, 5, 5, 5, 5};
        assertEquals(5, DeterministicSelect.select(arr, 3, metrics));
    }

    @Test
    void testLargeRandomArray() {
        Random random = new Random(42);
        int n = 10_000;
        int[] arr = random.ints(n, -100_000, 100_000).toArray();
        int[] sorted = arr.clone();
        Arrays.sort(sorted);

        int[] testIndices = {0, 1, n / 4, n / 2, 3 * n / 4, n - 2, n - 1};
        for (int k : testIndices) {
            int[] copy = arr.clone();
            assertEquals(sorted[k], DeterministicSelect.select(copy, k, new Metrics()));
        }
    }

    @Test
    void testInvalidInputs() {
        assertThrows(IllegalArgumentException.class, () -> DeterministicSelect.select(null, 0, metrics));
        assertThrows(IllegalArgumentException.class, () -> DeterministicSelect.select(new int[]{}, 0, metrics));
        assertThrows(IllegalArgumentException.class, () -> DeterministicSelect.select(new int[]{1, 2}, -1, metrics));
        assertThrows(IllegalArgumentException.class, () -> DeterministicSelect.select(new int[]{1, 2}, 2, metrics));
    }
}