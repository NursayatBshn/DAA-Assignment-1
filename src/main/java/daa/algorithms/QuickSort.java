package daa.algorithms;

import daa.metrics.Metrics;

import java.util.concurrent.ThreadLocalRandom;

public class QuickSort {

    public static void sort(int[] a, Metrics metrics) {
        if (a == null || a.length <= 1) {
            return;
        }

        metrics.startTimer();
        quickSort(a, 0, a.length - 1, metrics);
        metrics.stopTimer();
    }

    private static void quickSort(int[] a, int left, int right, Metrics metrics) {
        metrics.enterRecursion();

        while (left < right) {
            int[] bounds = partition3Way(a, left, right, metrics);
            int lt = bounds[0];
            int gt = bounds[1];

            int leftSize = lt - left;
            int rightSize = right - gt;

            // Recursively, we go strictly to the smaller part, we continue the larger part in the loop.
            if (leftSize < rightSize) {
                if (left < lt - 1) {
                    quickSort(a, left, lt - 1, metrics);
                }
                left = gt + 1;
            } else {
                if (gt + 1 < right) {
                    quickSort(a, gt + 1, right, metrics);
                }
                right = lt - 1;
            }
        }

        metrics.exitRecursion();
    }

    public static int[] partition3Way(int[] a, int left, int right, Metrics metrics) {
        // Random Pivot: we select a random index and change it with the first element
        int pivotIndex = ThreadLocalRandom.current().nextInt(left, right + 1);
        swap(a, left, pivotIndex);

        int pivot = a[left];
        int lt = left;
        int i = left + 1;
        int gt = right;

        while (i <= gt) {
            int cmp = metrics.compare(a[i], pivot);
            if (cmp < 0) {
                swap(a, lt++, i++);
            } else if (cmp > 0) {
                swap(a, i, gt--);
            } else {
                i++;
            }
        }

        return new int[]{lt, gt};
    }

    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}