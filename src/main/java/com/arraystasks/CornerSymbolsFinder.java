package com.arraystasks;

/**
 * @author George Fomin
 * @version 1.0
 */
public class CornerSymbolsFinder {

    /**
     * Method finds the angle cells of two dimensions array
     *
     * @param array - two dimensions array
     * @return String angles
     */
    public String findCornerSymbols(char[][] array) {
        String angles = "";
        int rowsNumber = array.length;
        int columnsNumber = array[0].length;
        angles = angles + array[0][0] + array[0][columnsNumber - 1] + array[rowsNumber - 1][0]
                + array[rowsNumber - 1][columnsNumber - 1];
        return angles;
    }

    /**
     * Method shows the result of findCornerSymbols() work
     *
     * @param array - two dimensions array
     */
    void showCornerSymbols(char[][] array) {
        System.out.print("Угловые символы: ");
        System.out.println(findCornerSymbols(array));
    }
}