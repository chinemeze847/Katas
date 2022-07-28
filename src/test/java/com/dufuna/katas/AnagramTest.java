package com.dufuna.katas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnagramTest {
    @Test
    void TwoLetterWords()
    {
        Anagram anagram = new Anagram();
        var word = "ab";
        String[] expectedPermutations = {"ab", "ba"};
        String[] permutations = anagram.permutate(word);
        assertEquals(expectedPermutations, permutations);
    }
}
