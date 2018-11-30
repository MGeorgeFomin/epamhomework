package com.algorithms;

import java.util.Arrays;

/**
 *
 */
public class AlgorithmsRunner {
    int[] arr;

    public static void main(String[] args) {
        new AlgorithmsRunner().showSortWays();
    }

    /**
     * method creates sort classes and calls sort methods of these classes
     */
    void showSortWays() {

        BubbleSort bubbleSort = new BubbleSort();
        QuickSort quickSort = new QuickSort();
        RadixSort radixSort = new RadixSort();
        MergeSort mergeSort = new MergeSort();
        Sorter[] sortersArray = new Sorter[]{bubbleSort, quickSort, radixSort, mergeSort};

        for (Sorter sorter : sortersArray) {
            showSorting(sorter);
        }
        BinarySearch binarySearch = new BinarySearch();
        System.out.println("Position of 5 in sorted array is: " + binarySearch.search(arr, 5));
    }

    /**
     * method runs sorters (sort classes)
     *
     * @param sorterClass is a sort class which shows one of sort ways
     */
    void showSorting(Sorter sorterClass) {
        System.out.println(sorterClass.getClass().getSimpleName() + ": ");
        System.out.print(Arrays.toString(arr = new int[]{3, 4, 5, 2, 1, 6, 9, 8, 7}));
        sorterClass.sort(arr);
        System.out.println(" -> " + Arrays.toString(arr));
    }
}