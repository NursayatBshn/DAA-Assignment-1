package daa.algorithms;

import daa.metrics.Metrics;

public class DeterministicSelect {

    /**
     * Selects the k-th smallest element (0-indexed) using the deterministic
     * Median of Medians (BFPRT) algorithm with guaranteed O(n) worst-case time.
     *
     * @param array   the input array
     * @param k       target index (0 <= k < array.length)
     * @param metrics metrics tracker for comparisons and recursion depth
     * @return the k-th smallest element
     */
    public static int select(int[] array, int k, Metrics metrics) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }
        if (k < 0 || k >= array.length) {
            throw new IllegalArgumentException("Index k out of bounds: " + k);
        }
        metrics.startTimer();
        try {
            return select(array, 0, array.length - 1, k, metrics);
        } finally {
            metrics.stopTimer();
        }
    }

    private static int select(int[] array, int left, int right, int k, Metrics metrics) {
        metrics.enterRecursion();
        try {
            while (left < right) {
                int length = right - left + 1;
                if (length <= 5) {
                    insertionSort(array, left, right, metrics);
                    return array[k];
                }

                // 1. Split into groups of 5 and place group medians at the front
                int numGroups = (length + 4) / 5;
                for (int i = 0; i < numGroups; i++) {
                    int groupLeft = left + i * 5;
                    int groupRight = Math.min(groupLeft + 4, right);
                    insertionSort(array, groupLeft, groupRight, metrics);
                    int medianIndex = groupLeft + (groupRight - groupLeft) / 2;
                    swap(array, left + i, medianIndex);
                }

                // 2. Recursively find the median of medians
                int medianOfMedians = select(array, left, left + numGroups - 1, left + numGroups / 2, metrics);

                // 3. 3-way Dutch National Flag partitioning around medianOfMedians
                int[] range = partition3Way(array, left, right, medianOfMedians, metrics);
                int lt = range[0];
                int gt = range[1];

                // 4. Descend into the partition containing k
                if (k < lt) {
                    right = lt - 1;
                } else if (k > gt) {
                    left = gt + 1;
                } else {
                    return array[k];
                }
            }
            return array[left];
        } finally {
            metrics.exitRecursion();
        }
    }

    private static int[] partition3Way(int[] array, int left, int right, int pivot, Metrics metrics) {
        int lt = left;
        int gt = right;
        int i = left;
        while (i <= gt) {
            int cmp = metrics.compare(array[i], pivot);
            if (cmp < 0) {
                swap(array, lt++, i++);
            } else if (cmp > 0) {
                swap(array, i, gt--);
            } else {
                i++;
            }
        }
        return new int[]{lt, gt};
    }

    private static void insertionSort(int[] array, int left, int right, Metrics metrics) {
        for (int i = left + 1; i <= right; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= left && metrics.compare(array[j], key) > 0) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}