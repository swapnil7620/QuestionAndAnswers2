package com.java.questionandanswers;

public class ReverseStringWithoutUsingAnotherString {
    public static void main(String[] args) {
        /*
        StringBuffer s = new StringBuffer("swapnil");
        int i =0;
        int j = s.length()-1;
        while(i<j){
            char temp = s.charAt(i);
            s.setCharAt(i, s.charAt(j));
            s.setCharAt(j, temp);
            i++;
            j--;
        }
        System.out.println(s);

         */
//        StringBuffer s = new StringBuffer("swapnil");

        String s1 = "swapnil";
        StringBuffer s = new StringBuffer(s1);
        for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
            char ch1 = s.charAt(i);
//            char ch2 = s.charAt(j);
            s.setCharAt(i, s.charAt(j));
            s.setCharAt(j, ch1);
        }
        System.out.println(s);

    }
}
