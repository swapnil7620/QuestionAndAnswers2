package com.java.questionandanswers;

public class ReverseStatement {
    public static void main(String[] args) {

        String statement ="Hii swapnil here where are , you my dear";
        String[] state = statement.toLowerCase().replaceAll("[^a-z]\\s","").split("\\s+");
        String s= "";
        for(int i= state.length-1;i>=0;i--){
            s += state[i]+" ";
        }
        System.out.println(s);


        /*
        String name = "hi swapnil this side";
        String[] word = name.split(" ");
        for(int i =0; i<word.length/2;i++){
            String temp = word[i];
            word[i]= word[word.length-1 -i];
            word[word.length-1 -i]=temp;
        }
        String reverseString = String.join(" ",word);
        System.out.println(reverseString);

         */
    }
}
