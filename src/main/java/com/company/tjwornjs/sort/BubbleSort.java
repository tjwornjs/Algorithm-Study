package com.company.tjwornjs.sort;

public class BubbleSort implements Sort {
    @Override
    public void sortArray(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                int temp1 = arr[j];
                int temp2 = arr[j + 1];

                if (temp1 > temp2) {
                    arr[j + 1] = temp1;
                    arr[j] = temp2;
                }
            }
        }

    }
}
