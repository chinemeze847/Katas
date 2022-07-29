package com.dufuna.katas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnagramShow {

    public static void main(String[] args) {
        System.out.println(permute("a"));
    }

    public static List<String> permute(String s)
    {
        if(s.length() <= 1)
           return Arrays.asList(s);

        ArrayList<String> arr = new ArrayList<>();

        for (int i= 0; i<s.length(); i++)
        {
            var permutation = permute(dropLetter(s,i));

            for (String str : permutation)
            {
                if(i == s.length()-1)
                    arr.add(s.substring(i) + str);
                else
                   arr.add(s.substring(i, i + 1) + str);
            }
        }
        return arr;
    }

    public static String dropLetter(String s, int index)
    {
        String helperVar1 = s.substring(index + 1);
        String helperVar2 = s.substring(0,index);
        if (index == 0)
             return helperVar1;
        if (index == 1)
             return helperVar2 + helperVar1;

        return helperVar2;
    }
}
