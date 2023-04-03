package algorithms;

public class FibonacciSeriesRecursion {

    static int getFibonacciForGivenNumber(int n){
        if(n<=1){
            return n;
        }

        return getFibonacciForGivenNumber(n-1) + getFibonacciForGivenNumber(n-2);
    }


    public static void main(String args[]){
        int limit = 10;

        for (int i = 0;i<limit-1;i++){
            System.out.print(" "+getFibonacciForGivenNumber(i));
        }
    }

}