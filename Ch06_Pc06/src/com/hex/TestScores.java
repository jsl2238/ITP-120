package com.hex;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class TestScores
{
    private int test1;
    private int test2;
    private int test3;

    public TestScores(int test1, int test2, int test3)
    {
        this.test1 = test1;
        this.test2 = test2;
        this.test3 = test3;
    }

    public void setTest1(int test1)
    {
        this.test1 = test1;
    }

    public void setTest2(int test2)
    {
        this.test2 = test2;
    }

    public void setTest3(int test3)
    {
        this.test3 = test3;
    }

    public int getTest1()
    {
        return test1;
    }

    public int getTest2()
    {
        return test2;
    }

    public int getTest3()
    {
        return test3;
    }

    public double average()
    {
        DecimalFormat df = new DecimalFormat("#0.0");
        df.setRoundingMode(RoundingMode.FLOOR);

        double average = (((double) test1 + (double) test2 + (double) test3) / 3) * 10;

        return Double.parseDouble(df.format(average));
    }

}
