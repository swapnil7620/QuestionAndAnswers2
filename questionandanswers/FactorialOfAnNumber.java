package com.java.questionandanswers;

public class FactorialOfAnNumber {
    public static void main(String[] args) {

        int number = 5;
        int fact =1;
        for(int i =1; i<number;i++){
             fact = fact *i;
        }
        System.out.println(fact);

        int j =1;
        int factorial =1;
        while(j<number){
            factorial = factorial*j;
            j++;
        }
        System.out.println(factorial);
    }

}
