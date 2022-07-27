package com.dufuna.katas;

import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;

public class FibonacciSeriesTest
{
    @Test
    void whatIsNumberAtPositionOne()
    {
        FibonacciSeries series = new FibonacciSeries();
        int number = series.getNumberAtPosition(1);
        assertThat(number, CoreMatchers.is(1));
    }

    @Test
    void whatIsNumberAtPositionTwo()
    {
        FibonacciSeries series = new FibonacciSeries();
        int number = series.getNumberAtPosition(2);
        assertThat(number, CoreMatchers.is(1));
    }

    @Test
    void whatIsNumberAtPositionThree()
    {
        FibonacciSeries series = new FibonacciSeries();
        int number = series.getNumberAtPosition(3);
        assertThat(number, CoreMatchers.is(2));
    }

    @Test
    void whatIsNumberAtPositionFour()
    {
        FibonacciSeries series = new FibonacciSeries();
        int number = series.getNumberAtPosition(4);
        assertThat(number, CoreMatchers.is(3));
    }

    @Test
    void whatIsNumberAtPositionFive()
    {
        //create an object (Given)
        FibonacciSeries series = new FibonacciSeries();
        //call a method (When)
        int number = series.getNumberAtPosition(5);
        //Assert (Then)
        assertThat(number, CoreMatchers.is(5));
    }

    @Test
    void whatIsNumberAtPositionSeven()
    {
        FibonacciSeries series = new FibonacciSeries();
        int number = series.getNumberAtPosition(7);
        assertThat(number, CoreMatchers.is(13));
    }


}
