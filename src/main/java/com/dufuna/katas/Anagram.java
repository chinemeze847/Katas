package com.dufuna.katas;

import java.util.*;
import java.util.stream.Collectors;

public class Anagram {
    public static void main(String[] args)
    {

        System.out.println(permutate("biro"));
    }

    public static List<String> permutate(String word)
    {
        Set<String> anagrams = new HashSet<>();
        List<String> letters = Arrays. asList(word. split(""));

        int numOfPermutations = 1;
        for (int i = 1; i<=word.length(); i++)
        {
            numOfPermutations *= i;
        }


        while(anagrams.size() != numOfPermutations)
        {
            Collections.shuffle(letters);
            String myString = "";
            for (String letter : letters)
                myString += letter;
            anagrams.add(myString);
        }
        List<String> shuffled = new ArrayList<>();
        for(String member : anagrams)
            shuffled.add(member);

        Collections.sort(shuffled);

        return shuffled;
    }
}
