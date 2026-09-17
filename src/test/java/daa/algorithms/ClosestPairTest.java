package daa.algorithms;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class ClosestPairTest {

    @Test
    void testSmallFixedPoints() {
        Point[] points = {
                new Point(2, 3),
                new Point(12, 30),
                new Point(40, 50),
                new Point(5, 1),
                new Point(12, 10),
                new Point(3, 4)
        };
        // Distance between (2, 3) and (3, 4) is sqrt(2) = 1.41421356...
        double expected = Math.sqrt(2);
        double actual = ClosestPair.findClosestDistance(points);
        assertEquals(expected, actual, 1e-9);
        assertEquals(expected, ClosestPair.bruteForce(points), 1e-9);
    }

    @Test
    void testPointsWithIdenticalCoordinates() {
        Point[] points = {
                new Point(1.0, 1.0),
                new Point(5.0, 5.0),
                new Point(1.0, 1.0)
        };
        assertEquals(0.0, ClosestPair.findClosestDistance(points), 1e-9);
        assertEquals(0.0, ClosestPair.bruteForce(points), 1e-9);
    }

    @Test
    void testCollinearPoints() {
        Point[] points = {
                new Point(0, 0),
                new Point(0, 10),
                new Point(0, 3),
                new Point(0, 7)
        };
        assertEquals(3.0, ClosestPair.findClosestDistance(points), 1e-9);
    }

    @Test
    void testAgainstBruteForceUpTo2000Points() {
        Random random = new Random(42);
        int[] testSizes = {10, 50, 200, 500, 1000, 2000};

        for (int n : testSizes) {
            Point[] points = new Point[n];
            for (int i = 0; i < n; i++) {
                points[i] = new Point(
                        random.nextDouble() * 10_000.0,
                        random.nextDouble() * 10_000.0
                );
            }

            double expected = ClosestPair.bruteForce(points);
            double actual = ClosestPair.findClosestDistance(points);

            assertEquals(expected, actual, 1e-9,
                    "Discrepancy found between O(n log n) and O(n^2) for n = " + n);
        }
    }

    @Test
    void testInvalidInputs() {
        assertThrows(IllegalArgumentException.class, () -> ClosestPair.findClosestDistance(null));
        assertThrows(IllegalArgumentException.class, () -> ClosestPair.findClosestDistance(new Point[]{}));
        assertThrows(IllegalArgumentException.class, () -> ClosestPair.findClosestDistance(new Point[]{new Point(1, 1)}));
    }
}