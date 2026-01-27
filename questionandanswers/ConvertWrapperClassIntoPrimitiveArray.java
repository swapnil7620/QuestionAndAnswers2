package com.java.questionandanswers;

import java.util.Arrays;

public class ConvertWrapperClassIntoPrimitiveArray {
    public static void main(String[] args) {

        // first way to convert Wrapper class int primitive Array
        Integer[] wrapperClass = {1, 3, 77, 432, 90, 33};
        int[] primitiveArray = new int[wrapperClass.length];

        for (int i = 0; i < wrapperClass.length; i++) {
            primitiveArray[i] = wrapperClass[i];
        }
        System.out.println(Arrays.toString(primitiveArray));

        // second way to convert Wrapper class int primitive Array
        int[] value = Arrays.stream(wrapperClass).
                mapToInt(Integer::intValue).
                toArray();

        System.out.print(Arrays.toString(value));
    }
}
