package com.arraystasks;

/**
 * @author George Fomin
 * @version 1.0
 */
public class ChessDeskWordsWriter {

    /**
     * Method checks the symbol if it is situated on the right cell
     *
     * @param rowIndex
     * @param columnIndex
     * @return true or false depending on the location of cell
     */
    public boolean checkTheSymbol(int rowIndex, int columnIndex) {
        if (rowIndex % 2 == 0) {
            if (columnIndex % 2 == 0) {
                return true;
            }
            return false;
        } else {
            if (columnIndex % 2 != 0) {
                return true;
            }
            return false;
        }
    }

    /**
     * Method writes word made of symbols which are read left-to-right in each row
     *
     * @param myCharArray
     * @return String word
     */
    public String getLeftToRightWord(char[][] myCharArray) {
        String word = "";

        for (int rowIndex = 0; rowIndex < myCharArray.length; rowIndex++) {
            for (int columnIndex = 0; columnIndex < myCharArray[0].length; columnIndex++) {
                if (checkTheSymbol(rowIndex, columnIndex)) {
                    word = word + " " + myCharArray[rowIndex][columnIndex];
                }
            }
        }
        return word;
    }

    /**
     * Method writes word made of symbols which are read up-to-down in each column
     *
     * @param myCharArray
     * @return String word
     */
    public String getUpToDownWord(char[][] myCharArray) {
        String word = "";

        for (int columnIndex = 0; columnIndex < myCharArray[0].length; columnIndex++) {
            for (int rowIndex = 0; rowIndex < myCharArray.length; rowIndex++) {
                if (checkTheSymbol(rowIndex, columnIndex)) {
                    word = word + " " + myCharArray[rowIndex][columnIndex];
                }
            }
        }
        return word;
    }

    /**
     * Method shows the result of getLeftToRightWord() work
     *
     * @param myCharArray
     */
    void showLeftToRightWord(char[][] myCharArray) {
        System.out.println("Слово из букв слева направо:");
        System.out.println(getLeftToRightWord(myCharArray));
    }

    /**
     * Method shows the result of getUpToDownWord() work
     *
     * @param myCharArray
     */
    void showUpToDownWord(char[][] myCharArray) {
        System.out.println("Слово из букв слева направо:");
        System.out.println(getUpToDownWord(myCharArray));
    }
}