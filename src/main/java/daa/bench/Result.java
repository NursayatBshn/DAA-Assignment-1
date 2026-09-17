package daa.bench;

import java.util.Locale;

public record Result(
        String algorithm,
        String input,
        int n,
        double timeMs,
        long comparisons,
        int maxDepth
) {
    public String toCsvRow() {
        return String.format(Locale.US ,"%s,%s,%d,%.4f,%d,%d",
                algorithm, input, n, timeMs, comparisons, maxDepth);
    }
}