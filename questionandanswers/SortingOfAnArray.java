package com.java.questionandanswers;

import java.util.Scanner;

public class SortingOfAnArray {
    public static void main(String[] args) {

        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i =0;i<arr.length; i++){
            System.out.println("enter the number for index "+ i);
            arr[i] = sc.nextInt();
        }
      sc.close();
        // sorting an array in descending order
        for (int i =0;i<arr.length-1;i++){
            for (int j = 0; j <arr.length-1;  j++) {
                while(arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]= temp;
                }
            }
        }
        // sorting an array in ascending order
        for (int i =0;i<arr.length-1;i++){
            for (int j = 0; j <arr.length-1;  j++) {
                while(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]= temp;
                }
            }
        }
        for (int i:arr){
            System.out.print(i+" ");
        }
    }
}
