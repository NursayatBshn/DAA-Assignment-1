package daa.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ClosestPair {

    /**
     * Finds the minimum Euclidean distance between any pair of 2D points
     * using the optimal O(n log n) Divide-and-Conquer algorithm.
     */
    public static double findClosestDistance(Point[] points) {
        if (points == null || points.length < 2) {
            throw new IllegalArgumentException("Array must contain at least 2 points");
        }
        Point[] pointsX = points.clone();
        Arrays.sort(pointsX, Comparator.comparingDouble(Point::x));
        Point[] aux = new Point[pointsX.length];
        return closestDistance(pointsX, aux, 0, pointsX.length - 1);
    }

    private static double closestDistance(Point[] pointsX, Point[] aux, int left, int right) {
        if (right - left <= 3) {
            return bruteForceAndSortY(pointsX, left, right);
        }

        int mid = left + (right - left) / 2;
        double midX = pointsX[mid].x();

        double d1 = closestDistance(pointsX, aux, left, mid);
        double d2 = closestDistance(pointsX, aux, mid + 1, right);
        double delta = Math.min(d1, d2);

        // Merge two Y-sorted halves in O(n) without re-sorting
        mergeByY(pointsX, aux, left, mid, right);

        // Build vertical strip of width 2*delta around midX
        List<Point> strip = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (Math.abs(pointsX[i].x() - midX) < delta) {
                strip.add(pointsX[i]);
            }
        }

        // Geometric invariant: check at most 7 next points in Y order
        int stripSize = strip.size();
        for (int i = 0; i < stripSize; i++) {
            Point p1 = strip.get(i);
            int limit = Math.min(i + 8, stripSize);
            for (int j = i + 1; j < limit; j++) {
                Point p2 = strip.get(j);
                if (p2.y() - p1.y() >= delta) {
                    break;
                }
                double dist = p1.distanceTo(p2);
                if (dist < delta) {
                    delta = dist;
                }
            }
        }

        return delta;
    }

    private static double bruteForceAndSortY(Point[] points, int left, int right) {
        double minDist = Double.POSITIVE_INFINITY;
        for (int i = left; i <= right; i++) {
            for (int j = i + 1; j <= right; j++) {
                double d = points[i].distanceTo(points[j]);
                if (d < minDist) {
                    minDist = d;
                }
            }
        }
        Arrays.sort(points, left, right + 1, Comparator.comparingDouble(Point::y));
        return minDist;
    }

    private static void mergeByY(Point[] points, Point[] aux, int left, int mid, int right) {
        System.arraycopy(points, left, aux, left, right - left + 1);
        int i = left;
        int j = mid + 1;
        int k = left;
        while (i <= mid && j <= right) {
            if (aux[i].y() <= aux[j].y()) {
                points[k++] = aux[i++];
            } else {
                points[k++] = aux[j++];
            }
        }
        while (i <= mid) {
            points[k++] = aux[i++];
        }
        while (j <= right) {
            points[k++] = aux[j++];
        }
    }

    /**
     * Naive O(n^2) Brute-Force implementation for verification.
     */
    public static double bruteForce(Point[] points) {
        if (points == null || points.length < 2) {
            throw new IllegalArgumentException("Array must contain at least 2 points");
        }
        double minDist = Double.POSITIVE_INFINITY;
        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                double d = points[i].distanceTo(points[j]);
                if (d < minDist) {
                    minDist = d;
                }
            }
        }
        return minDist;
    }
}