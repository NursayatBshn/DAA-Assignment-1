package daa.bench;

import daa.algorithms.MergeSort;
import daa.algorithms.QuickSelect;
import daa.algorithms.QuickSort;
import daa.metrics.Metrics;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Benchmark {

    private static final int[] SIZES = {1_000, 10_000, 100_000, 1_000_000};
    private static final int REPEAT_COUNT = 5;
    private final Random random = new Random(42);

    public List run() {
        List results = new ArrayList<>();
        String[] algorithms = {"MergeSort", "QuickSort", "QuickSelect"};

        System.out.println("Starting benchmark suite...");

        for (String algorithm : algorithms) {
            for (InputType type : InputType.values()) {
                for (int n : SIZES) {
                    System.out.printf("Running %-11s | Input: %-10s | n = %d...%n",
                            algorithm, type.getLabel(), n);

                    List<RunData> runs = new ArrayList<>();

                    for (int r = 0; r < REPEAT_COUNT; r++) {
                        int[] original = ArrayUtils.generate(type, n, random);
                        int[] workArray = original.clone();
                        Metrics metrics = new Metrics();

                        switch (algorithm) {
                            case "MergeSort" -> MergeSort.sort(workArray, metrics);
                            case "QuickSort" -> QuickSort.sort(workArray, metrics);
                            case "QuickSelect" -> {
                                int k = n / 2;
                                QuickSelect.select(workArray, k, metrics);
                            }
                        }

                        runs.add(new RunData(metrics.getTimeMs(), metrics.getComparisons(), metrics.getMaxDepth()));
                    }

                    runs.sort(Comparator.comparingDouble(RunData::timeMs));
                    RunData median = runs.get(REPEAT_COUNT / 2);

                    results.add(new Result(
                            algorithm,
                            type.getLabel(),
                            n,
                            median.timeMs(),
                            median.comparisons(),
                            median.maxDepth()
                    ));
                }
            }
        }
        return results;
    }

    private record RunData(double timeMs, long comparisons, int maxDepth) {}
}