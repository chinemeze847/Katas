package com.dufuna.katas;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnagramTest {
    @Test
    void TwoLetterWords1()
    {
        Anagram anagram = new Anagram();
        var word = "ab";
        List<String> expectedPermutations = new ArrayList<>();
        expectedPermutations.add("ab");
        expectedPermutations.add("ba");
        List<String> permutations = anagram.permutate(word);
        assertEquals(expectedPermutations, permutations);
    }

    @Test
    void TwoLetterWords2()
    {
        Anagram anagram = new Anagram();
        var word = "TO";
        List<String> expectedPermutations = new ArrayList<>();
        expectedPermutations.add("OT");
        expectedPermutations.add("TO");
        List<String> permutations = anagram.permutate(word);
        assertEquals(expectedPermutations, permutations);
   }

    @Test
    void ThreeLetterWords1()
    {
        Anagram anagram = new Anagram();
        var word = "car";
        List<String> expectedPermutations = new ArrayList<>();
        expectedPermutations.add("car");
        expectedPermutations.add("cra");
        expectedPermutations.add("acr");
        expectedPermutations.add("arc");
        expectedPermutations.add("rac");
        expectedPermutations.add("rca");
        Collections.sort(expectedPermutations);
        List<String> permutations = anagram.permutate(word);
        assertEquals(expectedPermutations, permutations);
    }

    @Test
    void FourLetterWords1()
    {
        Anagram anagram = new Anagram();
        var word = "biro";
        List<String> expectedPermutations = new ArrayList<>();
        expectedPermutations.add("biro");
        expectedPermutations.add("bior");
        expectedPermutations.add("brio");
        expectedPermutations.add("broi");
        expectedPermutations.add("boir");
        expectedPermutations.add("bori");

        expectedPermutations.add("ibro");
        expectedPermutations.add("ibor");
        expectedPermutations.add("irbo");
        expectedPermutations.add("irob");
        expectedPermutations.add("iobr");
        expectedPermutations.add("iorb");

        expectedPermutations.add("rbio");
        expectedPermutations.add("rboi");
        expectedPermutations.add("ribo");
        expectedPermutations.add("riob");
        expectedPermutations.add("roib");
        expectedPermutations.add("robi");

        expectedPermutations.add("obir");
        expectedPermutations.add("obri");
        expectedPermutations.add("oibr");
        expectedPermutations.add("oirb");
        expectedPermutations.add("orbi");
        expectedPermutations.add("orib");

        Collections.sort(expectedPermutations);
        List<String> permutations = anagram.permutate(word);
        assertEquals(expectedPermutations, permutations);
    }
}
