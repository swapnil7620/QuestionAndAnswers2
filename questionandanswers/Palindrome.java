package com.java.questionandanswers;

public class Palindrome {
    public static void main(String[] args) {

        int number = 1551;
        int original = number;
        int reverse =0;
        while (number!=0){
            int digit = number % 10;
            reverse= reverse * 10 +digit;
            number = number /10;
        }
        System.out.println(original==reverse?"yes":"no");
    }
}

