package com.dufuna.katas;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnagramKataTest
{
    @Test
    void oneLetterWord1()
    {
        AnagramKata anagram = new AnagramKata();
        List<String> expected = Arrays.asList("a");
        List<String> actual = anagram.permutation("a");
        assertEquals(expected, actual);
    }

    @Test
    void oneLetterWord2()
    {
        AnagramKata anagram = new AnagramKata();
        List<String> expected = Arrays.asList("b");
        List<String> actual = anagram.permutation("b");
        assertEquals(expected, actual);
    }

    @Test
    void twoLetterWord1()
    {
        AnagramKata anagram = new AnagramKata();
        List<String> expected = Arrays.asList("ab","ba");
        List<String> actual = anagram.permutation("ab");
        assertEquals(expected, actual);
    }

    @Test
    void twoLetterWord2()
    {
        AnagramKata anagram = new AnagramKata();
        List<String> expected = Arrays.asList("cd","dc");
        List<String> actual = anagram.permutation("cd");
        assertEquals(expected, actual);
    }

    @Test
    void ThreeLetterWord3()
    {
        AnagramKata anagram = new AnagramKata();
        List<String> expected = Arrays.asList("car","cra","acr","arc","rca","rac");
        List<String> actual = anagram.permutation("car");
        assertEquals(expected, actual);
    }
}
