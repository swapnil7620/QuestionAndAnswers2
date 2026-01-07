package com.java.questionandanswers;

public class CountTheNumberFromString {
    public static void main(String[] args) {

        String s= "i am 4 her were 7 are 8 you 35 looking 9 dear";
        String[] value= s.split(" ");
        int count =0;
        int counter =0;
            for (String val : value) {
                try {
                    int n = Integer.parseInt(val);
                    count++;
//                    System.out.print(val+" ");
                }
                catch (NumberFormatException e) {
                    System.out.print(val+" ");
                    counter++;

                }
            }
        System.out.println("\n"+count);
        System.out.println(counter);
    }
}
