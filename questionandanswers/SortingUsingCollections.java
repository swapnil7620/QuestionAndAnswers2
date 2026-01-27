package com.java.questionandanswers;

import java.util.Arrays;
import java.util.Collections;


public class SortingUsingCollections {
    public static void main(String[] args) {

    // Sorting Using Collections Inbuilt Method

        Integer[] numbers = {1,31,456,222,621,99};
        Collections.sort(Arrays.asList(numbers));
        Collections.reverse(Arrays.asList(numbers));
        System.out.print(Arrays.toString(numbers));



    }
}
