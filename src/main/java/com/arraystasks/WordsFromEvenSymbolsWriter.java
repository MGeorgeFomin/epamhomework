package com.arraystasks;

/**
 * @author George Fomin
 * @version 1.0
 */
public class WordsFromEvenSymbolsWriter {

    /**
     * Method create a word made of symbols which are situated in even cells
     *
     * @param row is char[]
     * @return word is String
     */
    public String getOneWordFromEvenSymbols(char[] row) {
        String word = "";
        for (int i = 0; i < row.length; i++) {
            if (i % 2 != 0) {
                word = word + row[i];
            }
        }
        return word;
    }

    /**
     * Method shows the result of getOneWordFromEvenSymbols() work
     *
     * @param myCharArray
     */
    void showWordsFromEvenSymbols(char[][] myCharArray) {
        System.out.println("Слова из четный букв:");
        for (int i = 0; i < myCharArray.length; i++) {
            System.out.print(getOneWordFromEvenSymbols(myCharArray[i]) + " ");
        }
        System.out.println();
    }
}