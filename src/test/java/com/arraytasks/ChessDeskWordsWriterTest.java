package com.arraytasks;

import com.arraystasks.ChessDeskWordsWriter;
import org.junit.Assert;
import org.junit.Test;

public class ChessDeskWordsWriterTest {

    char[][] myCharArray = {
            {'a', 'b', 'c', 'd', 'e'},
            {'f', 'g', 'h', 'i', 'j'},
            {'k', 'l', 'm', 'n', 'o'},
            {'p', 'q', 'r', 's', 't'},
            {'u', 'v', 'w', 'x', 'y'},

    };
    ChessDeskWordsWriter chessDeskWordsWriter = new ChessDeskWordsWriter();

    @Test
    public void testCheckTheSymbol() {
        Assert.assertEquals(true, chessDeskWordsWriter.checkTheSymbol(0, 0));
        Assert.assertEquals(false, chessDeskWordsWriter.checkTheSymbol(0, 1));
        Assert.assertEquals(false, chessDeskWordsWriter.checkTheSymbol(1, 0));
        Assert.assertEquals(true, chessDeskWordsWriter.checkTheSymbol(1, 1));
    }

    @Test
    public void testGetLeftToRightWord() {
        Assert.assertEquals(" a c e g i k m o q s u w y", chessDeskWordsWriter.getLeftToRightWord(myCharArray));
    }

    @Test
    public void testGetUpToDownWord() {
        Assert.assertEquals(" a k u g q c m w i s e o y", chessDeskWordsWriter.getUpToDownWord(myCharArray));
    }
}