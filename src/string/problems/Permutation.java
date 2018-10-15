package string.problems;

/**
 * Created by mrahman on 04/22/17.
 */
public class Permutation {

    public static void main(String[] args) {

        /*
         * Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
         * Write Java program to compute all Permutation of a String
         *
         */
        permutation("","ABC");
    }
    public static void permutation(String pre, String post){
        int size = post.length();

        if(size==0){
            System.out.println(pre);
        }else{
            for(int i=0; i < size; i++){
                permutation(pre + post.charAt(i), post.substring(0, i) + post.substring(i+1,size));
            }
        }
    }
}
