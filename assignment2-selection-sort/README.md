# Selection Sort (with Early Termination Optimization)

### 📘 Overview
This project implements **Selection Sort** in Java, enhanced with an **early termination check** that detects if the array becomes sorted before all passes complete.

### 🚀 Features
- Tracks comparisons, swaps, and array accesses
- Early termination optimization
- Unit tests for correctness
- Benchmark CLI for performance testing
- Clean Maven structure and Git branching strategy

### 🧩 Complexity
| Case | Time Complexity | Space Complexity |
|------|------------------|------------------|
| Best | Ω(n²) | O(1) |
| Average | Θ(n²) | O(1) |
| Worst | O(n²) | O(1) |

*(Selection Sort’s asymptotic complexity remains quadratic even with early termination, but it can finish earlier on sorted or nearly-sorted data.)*

### 🧪 Run Benchmarks
```bash
mvn compile exec:java -Dexec.mainClass="cli.BenchmarkRunner"
