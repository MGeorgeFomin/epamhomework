package com.arraytasks;

import com.arraystasks.CornerSymbolsFinder;
import org.junit.Assert;
import org.junit.Test;

public class CornerSymbolsFinderTest {

    char[][] myCharArray = {
            {'a', 'b', 'c', 'd', 'e'},
            {'f', 'g', 'h', 'i', 'j'},
            {'k', 'l', 'm', 'n', 'o'},
            {'p', 'q', 'r', 's', 't'},
            {'u', 'v', 'w', 'x', 'y'},

    };
    CornerSymbolsFinder cornerSymbolsFinder = new CornerSymbolsFinder();

    @Test
    public void testFindCornerSymbols() {
        Assert.assertEquals("aeuy", cornerSymbolsFinder.findCornerSymbols(myCharArray));
    }
}