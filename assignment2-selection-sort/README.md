# Selection Sort - Assignment 2

## Project Overview
This project implements the **Selection Sort** algorithm in Java as part of Assignment 2 for Algorithmic Analysis and Peer Code Review.  
It is designed to meet the assignment requirements for code quality, performance tracking, and testing.

Key features:
- **Selection Sort** implementation with early termination optimization for nearly-sorted arrays
- **Performance tracking**: counts comparisons, swaps, and array accesses via `PerformanceTracker`
- **Command-line benchmarking** through `BenchmarkRunner` for arrays of different sizes
- **JUnit5 unit tests** covering edge cases:
  - empty array
  - single-element array
  - sorted array
  - reverse-sorted array
  - random array
- Input validation to handle `null` or small arrays
- Ready for **peer code review** and empirical performance validation

---

## Project Structure

assignment2-selection-sort/
├── src/main/java/algorithms/SelectionSort.java # Selection Sort implementation
├── src/main/java/metrics/PerformanceTracker.java # Tracks comparisons, swaps, and array accesses
├── src/main/java/cli/BenchmarkRunner.java # CLI for running benchmarks
├── src/test/java/algorithms/SelectionSortTest.java # Unit tests for Selection Sort
├── pom.xml # Maven project configuration
├── README.md # Project documentation
└── docs/ # Analysis reports and performance plots


---

## Getting Started

### Prerequisites
- **Java 17** or higher
- **Maven 3.8+**

### Running Unit Tests
Compile and run all unit tests:
```bash
mvn test

This verifies correctness for all edge cases and ensures that the implementation behaves as expected.
Running Benchmarks

Run performance benchmarks via CLI:

mvn compile exec:java -Dexec.mainClass="cli.BenchmarkRunner"

The benchmark executes the algorithm on arrays of different sizes (100, 1000, 10000) and prints:

    Execution time in milliseconds

    Number of comparisons

    Number of swaps

    Number of array accesses

Example Output

n=100    | time=0.2 ms   | Comparisons=4950, Swaps=45, ArrayAccesses=9900
n=1000   | time=15.3 ms  | Comparisons=499500, Swaps=450, ArrayAccesses=999000
n=10000  | time=1500 ms  | Comparisons=49995000, Swaps=4500, ArrayAccesses=99990000

Notes

    The implementation is in-place and uses constant auxiliary space.

    Performance metrics allow empirical validation of algorithm complexity (Θ(n²) average/worst case).

    Designed for peer review, allowing evaluation of code efficiency, readability, and optimization potential.

    Edge cases like null or arrays of length ≤1 are safely handled.
