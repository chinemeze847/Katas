package com.dufuna.katas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatsCalculatorTest
{
    @Test
    void whatIsMinimumValue()
    {
        StatCalculator statCalculator = new StatCalculator();
        int[] arr = {6, 9, 15, -2, 92, 11};
        int minVal = statCalculator.getMinValue(arr);
        assertEquals(-2, minVal);
    }

    @Test
    void whatIsMaximumValue()
    {
        StatCalculator statCalculator = new StatCalculator();
        int[] arr = {6, 9, 15, -2, 92, 11};
        int maxVal = statCalculator.getMaxValue(arr);
        assertEquals(92, maxVal);
    }

    @Test
    void whatIsTotalNumberInSequence()
    {
        StatCalculator statCalculator = new StatCalculator();
        int[] arr = {6, 9, 15, -2, 92, 11};
        int tolNumber = statCalculator.getTotalNumber(arr);
        assertEquals(6, tolNumber);
    }

    @Test
    void whatIsAverageValue()
    {
        StatCalculator statCalculator = new StatCalculator();
        int[] arr = {6, 9, 15, -2, 92, 11};
        double avgVal = statCalculator.getAvgValue(arr);
        assertEquals(21.833333, avgVal);
    }


}
