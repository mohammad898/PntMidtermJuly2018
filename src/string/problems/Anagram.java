package string.problems;

import java.util.Arrays;

/**
 * Created by mrahman on 04/22/17.
 */
public class Anagram {
    public static boolean isAnagram(String st1, String st2){
        String s1 = st1;
        String s2 = st2;
        int[] ana1 = new int[s1.length()];
        int[] ana2 = new int[s2.length()];

        if(s1.length()!=s2.length()) return false;

            for(int i=0; i<s1.length();i++){
                ana1[i]= (int) s1.charAt(i);
                ana2[i]=(int) s2.charAt(i);
            }

            Arrays.sort(ana1);
            Arrays.sort(ana2);

            if(Arrays.equals(ana1,ana2)) return true;
            else return false;

    }

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".

        if(isAnagram("ARMY","MARY")) System.out.println("This is anagram. ");
        else
        	System.out.println("This is not  anagram");

    }
}
