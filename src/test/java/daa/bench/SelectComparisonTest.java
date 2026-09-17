package daa.bench;

import daa.algorithms.DeterministicSelect;
import daa.algorithms.QuickSelect;
import daa.metrics.Metrics;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class SelectComparisonTest {

    @Test
    void runComparison() {
        int[] sizes = {1_000, 10_000, 100_000, 1_000_000};
        String[] types = {"random", "sorted"};
        Random random = new Random(42);

        System.out.println("=========================================================================================");
        System.out.printf("%-10s | %-8s | %-20s | %-20s | %-12s%n",
                "Input", "n", "QuickSelect (ms/cmp)", "DetSelect (ms/cmp)", "Faster");
        System.out.println("=========================================================================================");

        for (String type : types) {
            for (int n : sizes) {
                int[] base = new int[n];
                if (type.equals("random")) {
                    for (int i = 0; i < n; i++) base[i] = random.nextInt();
                } else {
                    for (int i = 0; i < n; i++) base[i] = i;
                }

                int k = n / 2;

                // QuickSelect
                int[] arrQs = base.clone();
                Metrics mQs = new Metrics();
                QuickSelect.select(arrQs, k, mQs);

                // DeterministicSelect
                int[] arrDet = base.clone();
                Metrics mDet = new Metrics();
                DeterministicSelect.select(arrDet, k, mDet);

                String qsStats = String.format("%.2f ms / %d", mQs.getTimeMs(), mQs.getComparisons());
                String detStats = String.format("%.2f ms / %d", mDet.getTimeMs(), mDet.getComparisons());
                String winner = mQs.getTimeMs() <= mDet.getTimeMs() ? "QuickSelect" : "Deterministic";

                System.out.printf("%-10s | %-8d | %-20s | %-20s | %-12s%n",
                        type, n, qsStats, detStats, winner);
            }
        }
        System.out.println("=========================================================================================");
    }
}