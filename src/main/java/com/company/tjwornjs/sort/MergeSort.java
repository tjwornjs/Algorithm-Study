package com.company.tjwornjs.sort;

public class MergeSort implements Sort {
    int[] newArray;

    @Override
    public void sortArray(int[] arr) {
        newArray = new int[arr.length];
        mergeSort(arr, 0, arr.length - 1);
    }

    private void mergeSort(int[] arr, int start, int end) {
        if (end <= start) return;
        int mid = (start + end) / 2;
        mergeSort(arr, start, mid);
        mergeSort(arr, mid + 1, end);
        merge(arr, start, end);
    }

    private void merge(int[] arr, int start, int end) {
        int mid = (start + end) / 2;
        int leftIndex = start;
        int rightIndex = mid + 1;

        int newIndex = 0;

        while (leftIndex <= mid && rightIndex <= end) {
            if (arr[leftIndex] > arr[rightIndex])
                newArray[newIndex++] = arr[rightIndex++];
            else
                newArray[newIndex++] = arr[leftIndex++];
        }

        while (leftIndex <= mid)
            newArray[newIndex++] = arr[leftIndex++];
        while (rightIndex <= end)
            newArray[newIndex++] = arr[rightIndex++];

        for (int i = 0; i < (end - start + 1); i++)
            arr[start + i] = newArray[i];
    }
}
