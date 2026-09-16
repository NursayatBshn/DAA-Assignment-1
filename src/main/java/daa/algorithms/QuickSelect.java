package daa.algorithms;

import daa.metrics.Metrics;

public class QuickSelect {

    public static int select(int[] a, int k, Metrics metrics) {
        if (a == null || a.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }
        if (k < 0 || k >= a.length) {
            throw new IllegalArgumentException(
                    "Index k must be between 0 and " + (a.length - 1) + ", but got: " + k
            );
        }

        metrics.startTimer();
        int result = quickSelect(a, 0, a.length - 1, k, metrics);
        metrics.stopTimer();
        return result;
    }

    private static int quickSelect(int[] a, int left, int right, int k, Metrics metrics) {
        metrics.enterRecursion();
        try {
            if (left == right) {
                return a[left];
            }

            // Reuse the 3-way partition from QuickSort
            int[] bounds = QuickSort.partition3Way(a, left, right, metrics);
            int lt = bounds[0];
            int gt = bounds[1];

            // If k falls within the range of equal elements, result is found
            if (k >= lt && k <= gt) {
                return a[k];
            } else if (k < lt) {
                // Continue only in the left sub-array
                return quickSelect(a, left, lt - 1, k, metrics);
            } else {
                // Continue only in the right sub-array
                return quickSelect(a, gt + 1, right, k, metrics);
            }
        } finally {
            metrics.exitRecursion();
        }
    }
}