package com.dufuna.katas;

import java.util.*;

public class GroupShuffler
{
    public static void main(String[] args)
    {
        List<String[]> groups = new ArrayList<>();

//
//        groups.add(new String[]{"David","Chinedu"});
//        groups.add(new String[]{"Modupe","Chijioke"});
//        groups.add(new String[]{"Toafiq","Marie","Eze"});

        Map<Integer, List<String>> group = new HashMap<Integer, List<String>>();


        group.put(1, Arrays.asList("David","Chinedu"));
        group.put(2, Arrays.asList("Modupe","Chijioke"));
        group.put(3, Arrays.asList("Toafiq","Marie","Eze"));

        Collections.shuffle((List<?>) group.values());

        System.out.println(group);

    }

    public static List<String[]> shuffle(List<String[]> groups) {
//        List<String> members = new ArrayList<>();
//        List<String[]> shuffled = new ArrayList<>();
//
//        for (String[] group : groups) {
//            for (int i = 0; i < group.length; i++) {
//                members.add(group[i]);
//            }
//        }
//        Collections.shuffle(members);
//
//        for (int i = 0; i< members.size(); i++)
//        {
//            String[] arr = new String[2];
//            for(int j=0; j< 2; j++)
//            {
//                arr[j] = members.get(j);
//                members.remove(j);
//            }
//            shuffled.add(arr);
//        }
//        System.out.println(members);
//        return shuffled;
//
         return null;
    }
}
