package com.arraytasks;

import com.arraystasks.WordsFromOddSymbolsWriter;
import org.junit.Assert;
import org.junit.Test;

public class WordsFromOddSymbolsWriterTest {

    char[][] myCharArray = {
            {'a', 'b', 'c', 'd', 'e'},
            {'f', 'g', 'h', 'i', 'j'},
            {'k', 'l', 'm', 'n', 'o'},
            {'p', 'q', 'r', 's', 't'},
            {'u', 'v', 'w', 'x', 'y'},

    };
    WordsFromOddSymbolsWriter wordsFromOddSymbolsWriter = new WordsFromOddSymbolsWriter();

    @Test
    public void testGetOneWordFromOddSymbols() {
        Assert.assertEquals("ace", wordsFromOddSymbolsWriter.getOneWordFromOddSymbols(myCharArray[0]));
    }
}
