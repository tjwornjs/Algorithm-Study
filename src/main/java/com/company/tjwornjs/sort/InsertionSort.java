package com.company.tjwornjs.sort;

public class InsertionSort implements Sort {
    @Override
    public void sortArray(int[] arr) {
        int length = arr.length;
        int j;
        for (int i = 1; i < length; i++) {
            int insertNum = arr[i];

            for (j = i - 1; j >= 0 && insertNum < arr[j]; j--)
                arr[j + 1] = arr[j];

            arr[j + 1] = insertNum;
        }
    }
}
