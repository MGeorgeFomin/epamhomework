package com.algorithms;

/**
 * BubbleSort
 *
 * @author George Fomin
 * @version 1.0
 */
public class BubbleSort implements Sorter {
    /**
     * Method which initialise bubbleSort
     *
     * @param inputArray the input array of ints
     */
    public void sort(int[] inputArray) {
        for (int i = 0; i < inputArray.length - 1; i++) {
            for (int j = 0; j < inputArray.length - 1; j++) {
                if (inputArray[j] > inputArray[j + 1]) {
                    int countToSwap = inputArray[j];
                    inputArray[j] = inputArray[j + 1];
                    inputArray[j + 1] = countToSwap;
                }
            }
        }
    }
}