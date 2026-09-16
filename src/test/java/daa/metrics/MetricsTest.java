package daa.metrics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MetricsTest {

    @Test
    void testMetricsTracking() {
        Metrics metrics = new Metrics();

        metrics.startTimer();
        metrics.enterRecursion();
        metrics.enterRecursion();

        metrics.compare(10, 20);
        metrics.compare(30, 20);

        metrics.exitRecursion();
        metrics.exitRecursion();
        metrics.stopTimer();

        assertEquals(2, metrics.getComparisons());
        assertEquals(2, metrics.getMaxDepth());
        assertTrue(metrics.getTimeMs() >= 0.0);

        metrics.reset();
        assertEquals(0, metrics.getComparisons());
        assertEquals(0, metrics.getMaxDepth());
    }
}