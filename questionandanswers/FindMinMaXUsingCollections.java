package com.java.questionandanswers;

import java.util.Arrays;
import java.util.Collections;

public class FindMinMaXUsingCollections {
    public static void main(String[] args) {

        Integer[] numbers = {100, 222, 3, 547, 88, 50};
        int max, min;
        min = Collections.min(Arrays.asList(numbers));
        max = Collections.max(Arrays.asList(numbers));
        System.out.println("min number : " + min);
        System.out.println("max number : " + max);

    }
}
