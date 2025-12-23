package com.java.questionandanswers;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {20,115,90,45,67,83};

        int first = 0;
        int last = arr.length-1;
           while(first<last){
               int temp = arr[first];
               arr[first]=arr[last];
               arr[last]=temp;
               first++;
               last--;

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
