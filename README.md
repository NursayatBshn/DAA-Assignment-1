# DAA Assignment 1: Divide and Conquer & Asymptotic Notations

Optimized Java implementations of MergeSort, QuickSort, and QuickSelect with automated benchmarking and asymptotic empirical verification.

## Implemented Algorithms
* **Core**: `MergeSort` (reusable buffer, insertion cutoff), `QuickSort` (random pivot, 3-way partition, stack bounded), `QuickSelect` (3-way partition).
* **Bonus Task A (+10%)**: `DeterministicSelect` (Median of Medians BFPRT, guaranteed $O(n)$ worst-case).
* **Bonus Task B (+5%)**: `ClosestPair` (Divide-and-Conquer $O(n \log n)$ 2D closest pair with strip optimization, validated against $O(n^2)$ brute-force).

## Requirements
* Java JDK 17+ (or JDK 21+)
* Apache Maven 3.8+

## Build
```bash
mvn clean compile
```

## Run Tests
```bash
mvn test
```

## Run Benchmark

Executes 100 runs per test case and exports median metrics to results.csv:
```bash
mvn compile exec:java -Dexec.mainClass="daa.Main"
```