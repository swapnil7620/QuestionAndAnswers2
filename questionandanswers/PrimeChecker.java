package com.java.questionandanswers;

import java.util.Scanner;

public class PrimeChecker {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number =sc.nextInt();
        sc.close();
        boolean flag = true;
        for(int i =2;i<Math.sqrt(number);i++){
           if (number % i==0) {
               flag = false;
               break;
           }
        }
        System.out.println(flag?"yes":"No");
    }
}
