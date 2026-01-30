package com.java.questionandanswers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindMinMaXUsingCollections {
    public static void main(String[] args) {
/*
        Integer[] numbers = {100, 222, 3, 547, 88, 50};
        int max, min;
        min = Collections.min(Arrays.asList(numbers));
        max = Collections.max(Arrays.asList(numbers));
        System.out.println("min number : " + min);
        System.out.println("max number : " + max);//

        int[] arr = {1,222,99,40,540,3211,9};



 */
        // find min max using Declarative coding

        int[] arr = {1, 222, 99, 40, 540, 3211, 9};

        Integer[] value = new Integer[arr.length];
        int max, min;

        for (int i = 0; i <= arr.length - 1; i++) {
            value[i] = arr[i];
        }
//        System.out.println(Arrays.toString(value));

        // sorting of an array
        Arrays.sort(value);

        // max value using collections
        max = Collections.max(Arrays.asList(value));

        // min value using collections
        min = Collections.min(Arrays.asList(value));

        System.out.println("min value : "+min);
        System.out.println("max value :"+max);

        // way of printing
        System.out.println(Arrays.toString(value));

        // reversing array using collections
        Collections.reverse(Arrays.asList(value));

        // way of printing
        System.out.println(Arrays.toString(value));

        // adding element in List
        List<Integer> sorting = new ArrayList<Integer>(Arrays.asList(value));

        // sorting list
        Collections.sort(sorting);

        // printing second min value
        System.out.println("second min : "+sorting.get(1));

        // sorting the list and revering list

        // first way
        sorting.sort(Collections.reverseOrder());

        // second way
        //   Collections.sort(sorting, Collections.reverseOrder());

        // printing second max value
        System.out.println("second max : "+sorting.get(1));

    }
}
