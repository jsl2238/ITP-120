package com.hex.classes;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.OptionalDouble;

public class TestScores
{
    private final ArrayList<Double> testScores;

    public TestScores(ArrayList<Double> scores)
    {
        this.testScores = scores;
    }

    public ArrayList<Double> getScores()
    {
        return testScores;
    }

    public double getTotal ()
    {
        double total = 0.0;

        for ( double item : testScores )
        {
            total += item;
        }

        return total;
    }

    public double getAverage()
    {
        DecimalFormat format = new DecimalFormat("0.##");
        double avrg = 0;

        for ( double item : testScores )
        {
            avrg += item;
        }

        return Double.parseDouble(format.format(avrg / testScores.size()));
    }

    public double getHighest()
    {
        double highestNum = testScores.get(0);

        for ( double item : testScores )
        {
            if (item > highestNum) { highestNum = item; }
        }
        
        return highestNum;
    }

    public double getLowest()
    {
        double lowestNum =  testScores.get(0);

        for ( double item : testScores )
        {
            if (item < lowestNum) { lowestNum = item; }
        }

        return lowestNum;
    }
}
