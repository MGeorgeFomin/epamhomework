package com.arraystasks;

/**
 * @author George Fomin
 * @version 1.0
 */
public class WordFromSymbolsIndexes {
    private int firstIndex;
    private int lastIndex;

    /**
     * Method sets variables firstIndex and lastIndex
     *
     * @param line is a string which contains first and last indexes of interval
     *             indexes are divided by space ' '
     */
    private void indexesBordersSetter(String line) {
        firstIndex = Integer.parseInt(line.substring(0, line.indexOf(' ')));
        lastIndex = Integer.parseInt(line.substring(line.indexOf(' ') + 1));
    }

    /**
     * Method create word made of symbols from chosen row and chosen interval in this row
     *
     * @param indexOfRow
     * @param indexesLine is a string which contains first and last indexes of interval
     *                    indexes are divided by space ' '
     * @return wordOfSymbols - string of required symbols
     */
    public String getStringOfSymbolsByRequiredIndexes(int indexOfRow, String indexesLine, char[][] symbolsArray) {
        indexesBordersSetter(indexesLine);
        String wordOfSymbols = "";
        for (int i = firstIndex; i <= lastIndex; i++) {
            wordOfSymbols = wordOfSymbols + symbolsArray[indexOfRow][i];
        }
        return wordOfSymbols;
    }

    /**
     * Method shows the result of getStringOfSymbolsByRequiredIndexes() work
     *
     * @param indexOfRow
     * @param indexesLine
     * @param symbolsArray
     */
    void showWordOfSymbols(int indexOfRow, String indexesLine, char[][] symbolsArray) {
        System.out.println(getStringOfSymbolsByRequiredIndexes(indexOfRow, indexesLine, symbolsArray));
    }
}