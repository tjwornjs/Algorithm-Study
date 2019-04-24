package com.company.tjwornjs.sort;

public class SelectionSort implements Sort {
    @Override
    public void sortArray(int[] arr) {
        int length = arr.length;

        for (int i = 0; i < length - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < length; j++) {
                if (arr[minIndex] > arr[j])
                    minIndex = j;
            }
            int minValue = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = minValue;
        }
    }
}
