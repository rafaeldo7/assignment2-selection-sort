package cli;

import algorithms.SelectionSort;
import metrics.PerformanceTracker;
import java.util.Arrays;
import java.util.Random;

public class BenchmarkRunner {
    public static void main(String[] args) {
        int[] sizes = {100, 1000, 10000};
        PerformanceTracker tracker = new PerformanceTracker();

        for (int n : sizes) {
            int[] arr = generateRandomArray(n);
            SelectionSort sorter = new SelectionSort(tracker);

            tracker.reset();
            long start = System.nanoTime();
            sorter.sort(arr);
            long end = System.nanoTime();

            System.out.printf("n=%d | time=%.3f ms | %s%n",
                    n, (end - start) / 1e6, tracker.toString());
        }
    }

    private static int[] generateRandomArray(int n) {
        Random rand = new Random();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = rand.nextInt(10000);
        return arr;
    }
}
