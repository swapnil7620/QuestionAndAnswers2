package com.java.questionandanswers;

import java.util.Arrays;

public class ConvertPrimitiveArraysIntoWrapperClass {
    public static void main(String[] args) {
        int[] primitiveValue ={1,2,4,7,3,20,5};

        Integer[] wrapperValue = new Integer[primitiveValue.length];
        //    System.out.println(Arrays.toString(wrapperValue));

        for(int i =0; i<primitiveValue.length; i++){
            wrapperValue[i] = primitiveValue[i];
        }
        System.out.print(Arrays.toString(wrapperValue));
    }
}
