package string.problems;

public class Palindrome {

    public static boolean isPalindrome(String st) {
   String letter = st;
    StringBuilder palin = new StringBuilder();

    int wordLength = letter.length();

        for(int i = 0; i<wordLength;i++) {
        palin.append(letter.charAt(wordLength - 1 - i));
    }

    String revPalindrom = new String(palin);

        if(letter.matches(revPalindrom)) return true;
        else return false;




}
    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */

        if(isPalindrome("MOM")) System.out.println("This is Palindrome");
        else System.out.println("This is Not palindrome");


    }
}
