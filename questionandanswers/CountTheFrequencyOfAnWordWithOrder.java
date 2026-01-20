package com.javaTwo;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class CountTheFrequencyOfAnWordWithOrder {
    public static void main(String[] args) {
        String s ="Birds are flying in the Sky , birds look beautiful when they fly";

        String[] word = s.toLowerCase().replaceAll("[^a-z]\\s"," ").split("\\s+");

        TreeMap<String,Integer> tm = new TreeMap<>();

        for(String val:word){
            tm.put(val,tm.getOrDefault(val,0)+1);
        }

        System.out.println(tm);
        tm.entrySet().stream().
                sorted((a,b)->b.getValue()-a.getValue()
                        ).forEach(e-> System.out.println(e.getKey()+"= "+e.getValue()));


        /*
        tm.entrySet().stream()
                        .sorted(Map.Entry.<String,Integer>comparingByValue().reversed())
                        .forEach(e-> System.out.print(e+" "));


         */
        /*
        Map<String,Integer> sortedMap = tm.entrySet().stream()
                       .sorted(Map.Entry.<String,Integer>comparingByValue().
                        reversed())
                        .collect(LinkedHashMap::new,(m,e) ->
                                m.put(e.getKey(),e.getValue()),LinkedHashMap::putAll);
        System.out.println(sortedMap);

         */
/*
        Map<String,Integer> sortedMap = tm.entrySet().
                stream()
                .sorted(Map.Entry.<String,Integer>comparingByValue().reversed())
                .collect(Collectors.toMap
                        (Map.Entry::getKey,
                                Map.Entry::getValue,
                                                (a,b)->a,LinkedHashMap::new));
        System.out.println(sortedMap);
*/
    }

}
