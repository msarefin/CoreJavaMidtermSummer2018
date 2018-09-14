package math.problems;

import java.io.SequenceInputStream;

/**
 * Created by mrahman on 04/22/17.
 */
public class FindMissingNumber {

    public static void main(String[] args) {
        /*
         * If n = 10, then array will have 9 elements in the range from 1 to 10.
         * For example {10, 2, 1, 4, 5, 3, 7, 8, 6}. One number will be missing in array (9 in this case).
         * Write java code to find the missing number from the array. Write static helper method to find it.
         */
         int [] array = new int[]{10, 2, 1, 4, 5, 3, 7, 8, 6};



        PrintIteration(array);
        PrintIteration(InsertionSort(array));

        System.out.println("The Missing number is "+missing(array));
    }


    static int  missing(int[] arr){
        int MissingNumber  = sumOfNConsexutiveNumbers(arr.length+1) - summation(arr);
        return MissingNumber;
    }

    static int sumOfNConsexutiveNumbers(int n){
        int sum = 0;
        for(int i = 0; i<=n; i++){
            sum = sum+i;
        }
        return sum;
    }

    static int summation(int [] ar){
       int sum = 0;
       for(int i = 0; i<ar.length;i++){
           sum = sum+ar[i];
       }

       return sum;

    }

    static void PrintIteration(int[] ar){
        for(int n : ar){
            System.out.print(n+" ");
        }
        System.out.println();
    }



    static int [] InsertionSort(int []ar ){

        for(int i = 1; i<ar.length; i ++){
            int temp = ar[i];
            int j = i-1;
            while(j>=0 && ar[j]>temp) {
                ar[j+1] = ar[j];
                j--;
            }
            ar[j+1] = temp;
        }

        return ar;
    }


}
