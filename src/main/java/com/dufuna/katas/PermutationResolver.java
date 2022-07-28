package com.dufuna.katas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PermutationResolver
{
    public static void main(String[] args)
    {
//        Scanner keyboard = new Scanner(System.in);
//        System.out.println("Enter a string >>> ");
//        String str = keyboard.nextLine();
//        System.out.println(permutation(str));

        String str = "car";

        String newStr1 =  str.substring(0,1);
        String newStr2 =  str.substring(1,2);
        String newStr3 =  str.substring(2);

        System.out.println(newStr1);
        System.out.println(newStr2);
        System.out.println(newStr3);


       // System.out.println(isAnagram("art","tar"));
    }

    public static ArrayList<String> permutation(String word)
    {

        ArrayList<String> result = new ArrayList<>();

        if(word.isEmpty())
        {
            result.add(word);
            return result;
        }else
        {
            for(int i=0; i<word.length(); i++)
            {
                String shorter = word.substring(0,i) + word.substring(i+1);

                System.out.print(shorter);

                ArrayList<String> shortPerm = permutation(shorter );

                for(String s : shortPerm )
                {
                    result.add(word.charAt(i) +s);
                }

            }
        }
        return result ;

    }

//    public static void permutate(String str, int left, int right )
//    {
//        List<String> permutations = new ArrayList<>();
//
//        if (left == right)
//        {
//            System.out.println(str + " ");
//        }
//        else
//         {
//            for (int i = left; i <= right; i++)
//            {
//                String swapped = swap(str, left, i);
//                permutate(swapped, left + 1, right);
//                permutations.add(swapped);
//            }
//        }
//    }
//
//    public static String swap(String str, int i, int j)
//    {
//        char[] arrayOfCharacters = str.toCharArray();
//        char temp = arrayOfCharacters[i];
//        arrayOfCharacters[i] = arrayOfCharacters[j];
//        arrayOfCharacters[j] = temp;
//
//        return String.valueOf(arrayOfCharacters);
//    }



    public static Boolean isAnagram(String test, String anagram)
    {
        ArrayList<String> permutations = permutation(anagram);

        if (permutations.contains(test))
        {
            return true;
        }else
            return false;
    }
}
