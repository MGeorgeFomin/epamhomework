package com.arraystasks;

/**
 * @author George Fomin
 * @version 1.0
 */
public class WordsFromOddSymbolsWriter {

    /**
     * Method create a word made of symbols which are situated in odd cells
     *
     * @param row is char[]
     * @return word is String
     */
    public String getOneWordFromOddSymbols(char[] row) {
        String word = "";
        for (int i = 0; i < row.length; i++) {
            if (i % 2 == 0) {
                word = word + row[i];
            }
        }
        return word;
    }

    /**
     * Method shows the result of getOneWordFromOddSymbols() work
     *
     * @param myCharArray
     */
    void showWordsFromOddSymbols(char[][] myCharArray) {
        System.out.println("Слова из нечетный букв:");
        for (int i = 0; i < myCharArray.length; i++) {
            System.out.print(getOneWordFromOddSymbols(myCharArray[i]) + " ");
        }
    }
}