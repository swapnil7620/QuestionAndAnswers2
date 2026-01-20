package com.javaTwo;


import java.util.Arrays;

public class Convert_First_Word_Capital_Using_Stream {

    public static void main(String[] args) {

        String sentence = "birds are flying in the sky ";

        String[] val = sentence.split("\s");

       Arrays.stream(val).
               map(value-> value.substring(0,1).toUpperCase()+ value.substring(1)+" ").
               forEach(System.out::print);


    }
}
