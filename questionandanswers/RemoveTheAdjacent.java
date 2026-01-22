package com.java.questionandanswers;

public class RemoveTheAdjacent {
    public static void main(String[] args) {
        String val = "Apple".toLowerCase();
        StringBuffer sb = new StringBuffer();


        for(char ch: val.toCharArray())
        {
            int len= sb.length();
            if (len >0 && sb.charAt(len-1)==ch)
                sb.deleteCharAt(len-1);
            else
                sb.append(ch);
        }
            System.out.println(sb);

    }
}

/*

        for(int i =0 ; i<val.length();i++){
            int len= sb.length();
            if (len >0 && sb.charAt(len-1)==val.charAt(i)){
                sb.deleteCharAt(len-1);
            }
            else{
                sb.append(val.charAt(i));
            }
        }
 */
