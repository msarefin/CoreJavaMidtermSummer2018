package math.problems;

import com.sun.tools.doclets.internal.toolkit.builders.FieldBuilder;

public class UnitTestingMath {
    public static void main(String[] args) {
        //Apply Unit testing into each classes and methods in this package.

        try{
            Factorial.nFactorialOf(12);
        }catch (Exception e){
            System.out.println("Factorial Failed");
        }

        try{
            Fibonacci.HowManyFibunacci(32);
        }catch (Exception e){
            System.out.println("Fibonacci failed");
        }


    }
}
