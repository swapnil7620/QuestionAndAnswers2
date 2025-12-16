package com.java.questionandanswers;

public class PrimeNumberSeries {
    public static void main(String[] args) {
        int number = 100;
        int counter = 0;
        int kthPrime = 26;
        int foundKth =0;
        for(int i =2; i<=number;i++){
            int count=0;
            for (int j = 1; j <=number; j++) {
                 if (i % j==0)
                     count++;
            }
            if (count==2) {
                counter++;
                System.out.print(i + " ");
                if (counter==kthPrime)
                    foundKth =i;
            }
        }
        System.out.println("\nTotal number of prime number is :"+counter);
        if (counter<kthPrime)
            System.out.println("\nvalue is less than kth");
        else
            System.out.println("\nkth prime number is " + foundKth);


    }
}
