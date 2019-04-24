package com.company.tjwornjs.sort;

public class QuickSort implements Sort {
    private void quickSort(int[] arr, int start, int end) {

        int l = start, r = end;
        int pivot = arr[(l + r) / 2];

        do {
            while (arr[l] < pivot) l++;
            while (arr[r] > pivot) r--;

            if (l <= r) {
                int temp = arr[l];
                arr[l++] = arr[r];
                arr[r--] = temp;
            }
        } while (l <= r);

        if (start < r)
            quickSort(arr, start, r);
        if (end > l)
            quickSort(arr, l, end);

    }

    @Override
    public void sortArray(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }
}
