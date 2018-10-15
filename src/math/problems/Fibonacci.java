package math.problems;

public class Fibonacci {
    public static int[] fibonacciExample(int number){
        int[] arr = new int[number];
        arr[0]=0;
        arr[1]=1;
        for(int i=2;i<number;i++){
            arr[i] = arr[i-1] + arr[i-2];
        }
        return arr  ;
    }
    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
         */

         for(int i :fibonacciExample(40))
             System.out.println(i);


    }
}
