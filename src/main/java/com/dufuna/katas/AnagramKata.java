package com.dufuna.katas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnagramKata
{
    public static void main(String[] args) {
        System.out.println(permutation("calamityionsoislso"));
    }
    public static List<String> permutation(String s) {
        if (s.length() <= 1)
            return Arrays.asList(s);
//        if (s.length() == 2) {
//            return Arrays.asList(
//                            s,
//                            s.substring(1) + s.substring(0, 1)
//                    );
//        }

        ArrayList<String> arr = new ArrayList<>();

        for (int i = 0 ; i < s.length(); i++)
        {
            var permutationsOfRest = permutation(dropLetter(s,i));

            for (String permutation :  permutationsOfRest)
            {
                if(i == s.length()-1)
                    arr.add(s.substring(i)   + permutation);
                else
                   arr.add(s.substring(i, i + 1) + permutation);
            }
        }

        return arr;
    }

    public static String dropLetter(String s,int index)
    {
        String helperVar1 = s.substring(0,index);
        String helperVar2 = s.substring(index+1);
//        if (index == 0)
//            return helperVar2;
//        if (index == 1)
//            return helperVar1 + helperVar2;

        return helperVar1 + helperVar2;
    }
}
