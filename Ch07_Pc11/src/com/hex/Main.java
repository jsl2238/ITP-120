package com.hex;

import com.hex.classes.InputFile;
import com.hex.classes.TestScores;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        InputFile file = new InputFile("src/com/hex/Numbers.txt");

        ArrayList<Double> input = file.convertToDoubleList();

        TestScores scores = new TestScores(input);

        System.out.printf("The total of all the scores are: %.2f", scores.getTotal());
        System.out.printf("\nThe average of the scores are: %.2f", scores.getAverage());
        System.out.printf("\nThe highest number is: %.2f", scores.getHighest());
        System.out.printf("\nThe lowest number is: %.2f", scores.getLowest());
    }
}
