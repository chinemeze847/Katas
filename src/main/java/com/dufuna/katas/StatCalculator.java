package com.dufuna.katas;

import java.text.DecimalFormat;
import java.util.Arrays;

public class StatCalculator
{
    public int getMinValue(int[] arr)
    {
        Arrays.sort(arr);
        return arr[0];
    }

    public int getMaxValue(int[] arr)
    {
        Arrays.sort(arr);
        return arr[arr.length-1];
    }

    public int getTotalNumber(int[] arr)
    {
        return arr.length;
    }

    public double getAvgValue(int[] arr)
    {
        double sum = 0;

        for (int i= 0; i < arr.length; i++)
        {
            sum += arr[i];
        }
        DecimalFormat df = new DecimalFormat("0.000000");
        return Double.parseDouble(df.format(sum/arr.length));
    }
}
