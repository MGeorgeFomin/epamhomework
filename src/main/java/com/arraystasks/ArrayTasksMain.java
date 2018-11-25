package com.arraystasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author George Fomin
 * @version 1.0
 */
public class ArrayTasksMain {
    public static void main(String[] args) {
        ArrayTasksMain main = new ArrayTasksMain();
        main.go();
    }

    /**
     * Method creates work class objects and shows the result of work
     */
    void go() {
        char[][] myCharArray = {
                {'a', 'b', 'c', 'd', 'e'},
                {'f', 'g', 'h', 'i', 'j'},
                {'k', 'l', 'm', 'n', 'o'},
                {'p', 'q', 'r', 's', 't'},
                {'u', 'v', 'w', 'x', 'y'},

        };

        // Task 12.270
        CornerSymbolsFinder cornerSymbolFinder = new CornerSymbolsFinder();
        cornerSymbolFinder.showCornerSymbols(myCharArray);

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            // Task 12.271
            WordFromSymbolsIndexes wordFromSymbolsIndexes = new WordFromSymbolsIndexes();
            System.out.println("Введите индекс строки массива");
            int indexOfRow = Integer.parseInt(reader.readLine());
            if (indexOfRow >= myCharArray.length) {
                throw new IndexOutOfBoundsException();
            }
            System.out.println("Введите начальный и конечный индексы символов через пробел");
            String lineOfIndexes = reader.readLine();
            wordFromSymbolsIndexes.showWordOfSymbols(indexOfRow, lineOfIndexes, myCharArray);

            // Task 12.272
            ChessDeskWordsWriter chessDeskArrayWriter = new ChessDeskWordsWriter();
            chessDeskArrayWriter.showLeftToRightWord(myCharArray);
            chessDeskArrayWriter.showUpToDownWord(myCharArray);

            // Task 12.273
            WordsFromEvenSymbolsWriter wordsFromEvenSymbolsWriter = new WordsFromEvenSymbolsWriter();
            wordsFromEvenSymbolsWriter.showWordsFromEvenSymbols(myCharArray);

            // Task 12.274
            WordsFromOddSymbolsWriter wordsFromOddSymbolsWriter = new WordsFromOddSymbolsWriter();
            wordsFromOddSymbolsWriter.showWordsFromOddSymbols(myCharArray);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (IndexOutOfBoundsException f) {
            System.err.println("Вы ввели несуществующий индекс!");
        } catch (NumberFormatException h) {
            System.err.println("Будьте внимательны при вводе чисел!");
        }
    }
}