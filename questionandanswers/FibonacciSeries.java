package com.java.questionandanswers;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {

        int number ;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        number = sc.nextInt();
        sc.close();
        if (number<0)
            System.out.println("number cannot be zero or less than zero");
        else if (number==1){
            System.out.print("0");
        }
        else if (number==2){
            System.out.print("0 1");
        }
        else {
            int first =0;
            int second =1;
            System.out.print(first+" "+second+" ");
            for (int i = 0; i <number; i++) {
                int temp = first+second;
                System.out.print(temp+" ");
                first= second;
                second=temp;
            }

        }
    }
}

