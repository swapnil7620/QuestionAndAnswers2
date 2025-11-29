package com.java.questionandanswers;

public class Armstrong {
    public static void main(String[] args) {
        int number =153;
        int original = number;
        int armstrong =0;
        while (number!=0){
            int digit = number%10;
            armstrong += digit*digit*digit;
            number = number/10;
        }
        System.out.println(original ==armstrong?"yes":"no");
    }

}
