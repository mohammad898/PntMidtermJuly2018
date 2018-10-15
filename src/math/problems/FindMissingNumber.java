package math.problems;

/**
 * Created by mrahman on 04/22/17.
 */
public class FindMissingNumber {
    public static int MissingNumber(int[] a){
        int len = a.length;
        int sum = ((len+1) * (len+2))/2;
        for(int i=0;i<a.length;i++){
            sum -= a[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        /*
         * If n = 10, then array will have 9 elements in the range from 1 to 10.
         * For example {10, 2, 1, 4, 5, 3, 7, 8, 6}. One number will be missing in array (9 in this case).
         * Write java code to find the missing number from the array. Write static helper method to find it.
         */
         int[] array = {10, 2, 1, 4, 5, 3, 7, 8, 6};
        System.out.println("Missing number is : "+MissingNumber(array));
    }
}
