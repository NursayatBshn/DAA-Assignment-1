# DAA Assignment 1: Divide and Conquer & Asymptotic Notations

Optimized Java implementations of MergeSort, QuickSort, and QuickSelect with automated benchmarking and asymptotic empirical verification.

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