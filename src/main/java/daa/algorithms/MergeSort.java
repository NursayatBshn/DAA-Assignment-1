package daa.algorithms;

import daa.metrics.Metrics;

public class MergeSort {

    private static final int CUTOFF = 15;

    public static void sort(int[] a, Metrics metrics) {
        if (a == null || a.length <= 1) {
            return;
        }

        metrics.startTimer();
        int[] buffer = new int[a.length];
        sort(a, buffer, 0, a.length - 1, metrics);
        metrics.stopTimer();
    }

    private static void sort(int[] a, int[] buffer, int left, int right, Metrics metrics) {
        metrics.enterRecursion();

        if (right - left + 1 <= CUTOFF) {
            insertionSort(a, left, right, metrics);
            metrics.exitRecursion();
            return;
        }

        int mid = left + (right - left) / 2;
        sort(a, buffer, left, mid, metrics);
        sort(a, buffer, mid + 1, right, metrics);

        merge(a, buffer, left, mid, right, metrics);

        metrics.exitRecursion();
    }

    private static void merge(int[] a, int[] buffer, int left, int mid, int right, Metrics metrics) {
        for (int i = left; i <= right; i++) {
            buffer[i] = a[i];
        }

        int i = left;
        int j = mid + 1;
        int k = left;

        while (i <= mid && j <= right) {
            if (metrics.compare(buffer[i], buffer[j]) <= 0) {
                a[k++] = buffer[i++];
            } else {
                a[k++] = buffer[j++];
            }
        }

        while (i <= mid) {
            a[k++] = buffer[i++];
        }

        while (j <= right) {
            a[k++] = buffer[j++];
        }
    }

    private static void insertionSort(int[] a, int left, int right, Metrics metrics) {
        for (int i = left + 1; i <= right; i++) {
            int key = a[i];
            int j = i - 1;

            while (j >= left && metrics.compare(a[j], key) > 0) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = key;
        }
    }
}