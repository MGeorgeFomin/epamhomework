package com.algorithms;

/**
 * BinarySearch
 *
 * @author George Fomin
 * @version 1.0
 */
public class BinarySearch {

    /**
     * Method which search the place of element in Array
     *
     * @param inputArray the input array of ints
     * @param count      the search count in {@param inputArray}
     * @return the place of {@param count} in the {@param inputArray}
     */
    public int search(int[] inputArray, int count) {
        int result = -1;
        int lowBoundary = 0;
        int highBoundary = inputArray.length;
        int middleBoundary;

        while (lowBoundary < highBoundary) {
            middleBoundary = (lowBoundary + highBoundary) / 2;

            if (inputArray[middleBoundary] == count) {
                result = middleBoundary;
                break;
            } else {
                if (count <= inputArray[middleBoundary]) {
                    highBoundary = middleBoundary;
                } else if (count > inputArray[middleBoundary]) {
                    lowBoundary = middleBoundary + 1;
                }
            }
        }
        return result;
    }
}
