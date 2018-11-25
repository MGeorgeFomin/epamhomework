package com.arraytasks;

import com.arraystasks.WordFromSymbolsIndexes;
import org.junit.Assert;
import org.junit.Test;

public class WordFromSymbolsIndexesTest {

    char[][] myCharArray = {
            {'a', 'b', 'c', 'd', 'e'},
            {'f', 'g', 'h', 'i', 'j'},
            {'k', 'l', 'm', 'n', 'o'},
            {'p', 'q', 'r', 's', 't'},
            {'u', 'v', 'w', 'x', 'y'},

    };
    WordFromSymbolsIndexes wordFromSymbolsIndexes = new WordFromSymbolsIndexes();

    @Test
    public void testGetStringOfSymbolsByRequiredIndexes() {
        Assert.assertEquals("fghi", wordFromSymbolsIndexes.getStringOfSymbolsByRequiredIndexes(1,
                "0 3", myCharArray));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetStringOfSymbolsByRequiredIndexes1() {
        wordFromSymbolsIndexes.getStringOfSymbolsByRequiredIndexes(5, "0 3", myCharArray);
    }

    @Test(expected = NumberFormatException.class)
    public void testGetStringOfSymbolsByRequiredIndexes2() {
        wordFromSymbolsIndexes.getStringOfSymbolsByRequiredIndexes(1, "0 3  ", myCharArray);
    }

    @Test(expected = NumberFormatException.class)
    public void testGetStringOfSymbolsByRequiredIndexes3() {
        wordFromSymbolsIndexes.getStringOfSymbolsByRequiredIndexes(1, "0 T", myCharArray);
    }
}