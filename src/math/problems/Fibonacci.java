package math.problems;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Fibonacci {
    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
         */

         HowManyFibunacci(40);

    }

    static void HowManyFibunacci(int n){

        for(String output: nFibunacci(n)){
            System.out.println(output);
        }

    }

    private static ArrayList<String> nFibunacci(int n){
        ArrayList<String> output = new ArrayList<>();

        int result = 0;

        for(int i = 1; i<=40; i++){
            result = result +i;
            output.add(i+" : "+result);
        }

        return output;
    }
}
