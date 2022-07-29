package com.dufuna.katas;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnagramShowTest
{
    @Test
    void oneLetterWord1()
    {
        AnagramShow anagramShow = new AnagramShow();
        List<String> expected = Arrays.asList("a");
        List<String> word = anagramShow.permute("a");
        assertEquals(expected,word);
    }

    @Test
    void oneLetterWord2()
    {
        AnagramShow anagramShow = new AnagramShow();
        List<String> expected = Arrays.asList("b");
        List<String> word = anagramShow.permute("b");
        assertEquals(expected,word);
    }

    @Test
    void twoLetterWord1()
    {
        AnagramShow anagramShow = new AnagramShow();
        List<String> expected = Arrays.asList("ab","ba");
        List<String> word = anagramShow.permute("ab");
        assertEquals(expected,word);
    }


    @Test
    void twoLetterWord2()
    {
        AnagramShow anagramShow = new AnagramShow();
        List<String> expected = Arrays.asList("cd","dc");
        List<String> word = anagramShow.permute("cd");
        assertEquals(expected,word);
    }

    @Test
    void ThreeLetterWord1()
    {
        AnagramShow anagramShow = new AnagramShow();
        List<String> expected = Arrays.asList("abc","acb","bac","bca","cab","cba");
        List<String> word = anagramShow.permute("abc");
        assertEquals(expected,word);
    }

    @Test
    void ThreeLetterWord2()
    {
        AnagramShow anagramShow = new AnagramShow();
        List<String> expected = Arrays.asList("car","cra","acr","arc","rca","rac");
        List<String> word = anagramShow.permute("car");
        assertEquals(expected,word);
    }


}
