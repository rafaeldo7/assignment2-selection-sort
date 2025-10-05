package algorithms;

import metrics.PerformanceTracker;

public class SelectionSort {

    private final PerformanceTracker tracker;

    public SelectionSort(PerformanceTracker tracker) {
        this.tracker = tracker;
    }

    public void sort(int[] arr) {
        if (arr == null || arr.length <= 1) return;

        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            boolean swapped = false;

            for (int j = i + 1; j < n; j++) {
                tracker.incrementComparisons();
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
                tracker.incrementArrayAccesses(2); // arr[j] and arr[minIdx]
            }

            if (minIdx != i) {
                swap(arr, i, minIdx);
                swapped = true;
            }

            if (!swapped && isSorted(arr, i, n - 1)) {
                break;
            }
        }
    }

    private void swap(int[] arr, int i, int j) {
        tracker.incrementSwaps();
        tracker.incrementArrayAccesses(4); // read i,j; write i,j
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private boolean isSorted(int[] arr, int start, int end) {
        for (int i = start; i < end; i++) {
            tracker.incrementComparisons();
            tracker.incrementArrayAccesses(2);
            if (arr[i] > arr[i + 1]) return false;
        }
        return true;
    }
}
