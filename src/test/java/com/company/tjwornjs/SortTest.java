package com.company.tjwornjs;

import com.company.tjwornjs.sort.*;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class SortTest {
    private final int[] unSortedList = {5, 3, 6, 9, 1, 50, 8};
    private final int[] sortedList = {1, 3, 5, 6, 8, 9, 50};

    @Test
    public void insertSortTest() {
        Sort sort = new InsertionSort();
        int[] list = Arrays.copyOf(unSortedList, unSortedList.length);
        sort.sortArray(list);
        Assert.assertArrayEquals(sortedList, list);
    }

    @Test
    public void mergeSortTest() {
        Sort sort = new MergeSort();
        int[] list = Arrays.copyOf(unSortedList, unSortedList.length);
        sort.sortArray(list);
        Assert.assertArrayEquals(sortedList, list);
    }

    @Test
    public void selectionSortTest() {
        Sort sort = new SelectionSort();
        int[] list = Arrays.copyOf(unSortedList, unSortedList.length);
        sort.sortArray(list);
        Assert.assertArrayEquals(sortedList, list);
    }

    @Test
    public void BubbleSortTest() {
        Sort sort = new BubbleSort();
        int[] list = Arrays.copyOf(unSortedList, unSortedList.length);
        sort.sortArray(list);
        Assert.assertArrayEquals(sortedList, list);
    }

    @Test
    public void QuickSortTest(){
        Sort sort = new QuickSort();
        int[] list = Arrays.copyOf(unSortedList, unSortedList.length);
        sort.sortArray(list);
        Assert.assertArrayEquals(sortedList, list);
    }

}
