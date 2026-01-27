package com.java.questionandanswers;

import java.util.Arrays;
import java.util.Collections;

public class ConvertPrimitiveArraysIntoWrapperClass {
    public static void main(String[] args) {

        // first way to convert primitive array to Wrapper class

        int[] primitiveValue ={1,2,4,7,3,20,5};
        Integer[] wrapperValue = new Integer[primitiveValue.length];

        for(int i =0; i<primitiveValue.length; i++){
            wrapperValue[i] = primitiveValue[i];
        }
        System.out.print(Arrays.toString(wrapperValue));

        // second way  to   convert primitive array to Wrapper class
        // using stream

        int[] number ={10,212,200,340,5,40};

        Integer[] value = Arrays.stream(number).boxed().toArray(Integer[]::new);
        System.out.print(Arrays.toString(value));
    }
}
