package math.problems;

/**
 * Created by mrahman on 04/02/18.
 */
public class Factorial {

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */


        nFactorialOf(100);

    }

    static void nFactorialOf( int n){

        System.out.println(nFactorial(n));
    }

    private static long nFactorial(int n){
        long result = 1;
        if(n<0){
            System.out.println("You must enter number gretater than zero");
        }else if (n==0){
            System.out.println(result);
        }else{
            for(int i = n; i>0; i--){
                result = result*i;
            }
        }


        return result;
    }
}
