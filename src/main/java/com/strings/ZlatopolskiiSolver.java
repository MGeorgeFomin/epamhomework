package com.strings;

public class ZlatopolskiiSolver {
    public void thirdSymbolExtractor(String line) {
        System.out.println("Third symbol: " + line.toCharArray()[2]);
    }

    public void lastSymbolExtractor(String line) {
        System.out.println("The last symbol: " + line.toCharArray()[line.toCharArray().length-1]);
    }

    public void chosenSymbolExtractor(String line, int number) {
        System.out.println("You choose the symbol: " + line.toCharArray()[number]);
    }

    public void twinNeighbourLetterSeeker (String line) {
        int counterOfTwinLetters = 0;
        char[] lineArray = line.toCharArray();
        char repeatedLetter = 0;

        for (int i = 0; i < lineArray.length-1; i++) {
            if (lineArray[i] == lineArray[i+1]) {
                counterOfTwinLetters++;
                repeatedLetter = lineArray[i];
            } else {
                if (lineArray[i] == repeatedLetter) {
                    counterOfTwinLetters++;
                    repeatedLetter = 0;
                }
            }
        }
        System.out.println("There are " + counterOfTwinLetters + " twin letters in your sentence.");
    }

    public void reverseSecondAndFifthLetter (String line) {
        line = line.substring(0, line.indexOf(' '));
        if (line.length() < 5) {
            System.out.println("Your word is too short!!!");
        } else {
            char[] word = line.toCharArray();
            char bufferLetter = word[1];
            word[1] = word[4];
            word[4] = bufferLetter;
            System.out.println("Your reversed word: " + String.copyValueOf(word));
        }
    }

    public void reverseWordsLetters (String line) {
        String[] words = line.split(" ");
        for (String word : words) {
            System.out.print(new StringBuffer(word).reverse().toString() + " ");
        }
    }
}