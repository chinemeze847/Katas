package com.dufuna.katas;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnagramTest {
    @Test
    void TwoLetterWords1()
    {
        Anagram anagram = new Anagram();
        var word = "ab";
        String[] expectedPermutations = {"ab", "ba"};
        String permutations = Arrays.toString(anagram.permutate(word));
        assertEquals(Arrays.toString(expectedPermutations), permutations);
    }

    @Test
    void TwoLetterWords2()
    {
        Anagram anagram = new Anagram();
        var word = "TO";
        String[] expectedPermutations = {"TO", "OT"};
        String permutations = Arrays.toString(anagram.permutate(word));
        assertEquals(Arrays.toString(expectedPermutations), permutations);
    }
}
