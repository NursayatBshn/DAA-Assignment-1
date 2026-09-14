package daa.metrics;

public class Metrics {
    private long comparisons = 0;
    private int currentDepth = 0;
    private int maxDepth = 0;
    private long startTime = 0;
    private double timeMs = 0.0;

    public void startTimer() {
        this.startTime = System.nanoTime();
    }

    public void stopTimer() {
        this.timeMs = (System.nanoTime() - this.startTime) / 1_000_000.0;
    }

    public int compare(int a, int b) {
        comparisons++;
        return Integer.compare(a, b);
    }

    public void enterRecursion() {
        currentDepth++;
        if (currentDepth > maxDepth) {
            maxDepth = currentDepth;
        }
    }

    public void exitRecursion() {
        currentDepth--;
    }

    public long getComparisons() {
        return comparisons;
    }

    public int getMaxDepth() {
        return maxDepth;
    }

    public double getTimeMs() {
        return timeMs;
    }

    public void reset() {
        this.comparisons = 0;
        this.currentDepth = 0;
        this.maxDepth = 0;
        this.startTime = 0;
        this.timeMs = 0.0;
    }
}