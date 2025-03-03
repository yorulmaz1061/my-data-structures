package com.ozan.day1and2_CollectionsReview;

import java.util.*;

public class FirstNonRepeatingAlternative {
    public static void main(String[] args) {
        String name = "ava    D   e  veloper";
        System.out.println(firstNonRepeating(name));


    }

    public static Character firstNonRepeating(String str) {
        str = str.replaceAll("\\s", "");
        Map<Character, Integer> map = new LinkedHashMap<>();
        int count = 0;
        for (Character ch : str.toCharArray()) {
            if (map.containsKey(ch)) {
                count = map.get(ch);
                map.put(ch, count + 1);
            } else map.put(ch, 1);

        }
        Optional<Map.Entry<Character, Integer>> first = map.entrySet()
                .stream().filter(x -> x.getValue().equals(1)).findFirst();

        return first.get().getKey();

    }


}







