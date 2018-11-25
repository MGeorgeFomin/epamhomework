package com.zlatopolskii;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ZlatopolskiiHomework {
    public static void main(String[] args) {
        ZlatopolskiiSolver solverOfTasks = new ZlatopolskiiSolver();
        int numberOfCharForInput = 0;
        String inputLine;

        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            inputLine = reader.readLine();
            numberOfCharForInput = Integer.parseInt(reader.readLine());

            solverOfTasks.thirdSymbolExtractor(inputLine);
            solverOfTasks.lastSymbolExtractor(inputLine);
            solverOfTasks.chosenSymbolExtractor(inputLine, numberOfCharForInput - 1);
            solverOfTasks.twinNeighbourLetterSeeker(inputLine);
            solverOfTasks.reverseSecondAndFifthLetter(inputLine);
            solverOfTasks.reverseWordsLetters(inputLine);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException r) {
            r.printStackTrace();
            System.out.println("Your line is too short for " + numberOfCharForInput + "!!!");
        } catch (NumberFormatException t) {
            t.printStackTrace();
            System.out.println("Insert NUMBER please");
        }
    }
}
