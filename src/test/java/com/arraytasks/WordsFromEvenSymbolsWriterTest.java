package com.arraytasks;

import com.arraystasks.WordsFromEvenSymbolsWriter;
import org.junit.Assert;
import org.junit.Test;

public class WordsFromEvenSymbolsWriterTest {

    char[][] myCharArray = {
            {'a', 'b', 'c', 'd', 'e'},
            {'f', 'g', 'h', 'i', 'j'},
            {'k', 'l', 'm', 'n', 'o'},
            {'p', 'q', 'r', 's', 't'},
            {'u', 'v', 'w', 'x', 'y'},

    };
    WordsFromEvenSymbolsWriter wordsFromEvenSymbolsWriter = new WordsFromEvenSymbolsWriter();

    @Test
    public void testGetOneWordFromEvenSymbols() {
        Assert.assertEquals("bd", wordsFromEvenSymbolsWriter.getOneWordFromEvenSymbols(myCharArray[0]));
    }
}
