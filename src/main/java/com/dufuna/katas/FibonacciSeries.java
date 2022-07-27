package com.dufuna.katas;

public class FibonacciSeries {
    public int getNumberAtPosition(int pos)
    {
        if (pos == 1 || pos == 2)
             return 1;
        return getNumberAtPosition(pos-1) + getNumberAtPosition(pos - 2);
    }
}
