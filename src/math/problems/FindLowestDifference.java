package math.problems;

import java.util.ArrayList;
import java.util.HashSet;

public class FindLowestDifference {
    public static void main(String[] args) {
        /*
         * Implement in java. Read this below two array. Find the lowest difference
         * between the two array cell.
         */
        int[] array1 = {30, 12, 5, 9, 2, 20, 33, 1};
        int[] array2 = {18, 25, 41, 47, 17, 36, 14, 19};

        System.out.print("Array 1 :");
        Implement(array1);
        System.out.println();
        System.out.print("Array 2 :");
        Implement(array2);
    }

    static void Implement(int[] ar) {


        for (String msg : LowestDifference(ar)) {
            System.out.println(msg);
        }
    }

    private static ArrayList<String> LowestDifference(int[] ar) {
        ArrayList<String> output = new ArrayList<>();
        int l = LowestDifferenceBetweenArrayElements(ar);
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar.length; j++) {
                if (Absoluteint(ar[i] - ar[j]) == l) {
                    output.add("The Lowerst Difference between " + ar[i] + " and " + ar[j] + " is " + l);
                }
            }
        }

        return output;
    }

    private static int Absoluteint(int n) {
        int Result = 0;

        if (n < 0) {
            Result = n * (-1);
        }
        return Result;
    }

    private static int LowestDifferenceBetweenArrayElements(int[] ar) {
        return FindingtheLowestNumber(HashSetTointArray(AbsoluteValue(differencBetweenElements(ar))));
    }

    //    Lowest number
    private static int FindingtheLowestNumber(int[] input) {
        int min = input[0];
        for (int i = 0; i < input.length; i++) {

            if (input[i] < min) {
                min = input[i];
            } else {
                ;

            }
        }

        return min;

    }

    //    remove duplicates
    private static int[] HashSetTointArray(HashSet<Integer> abs) {

        Integer[] temp = abs.toArray(new Integer[0]);

        int[] arr = new int[temp.length];

        for (int i = 0; i < temp.length; i++) {
            arr[i] = temp[i];
        }

        return arr;

    }

    //    Absolute value of the differences
    private static HashSet<Integer> AbsoluteValue(ArrayList<Integer> input) {
        HashSet<Integer> output = new HashSet<>();

        for (int i = 0; i < input.size(); i++) {
            if (input.get(i) < 0) {
                output.add(input.get(i) * (-1));
            } else {

                output.add(input.get(i));
            }
        }

        return output;
    }

    //    Difference between the elements
    private static ArrayList<Integer> differencBetweenElements(int[] ar) {
        ArrayList<Integer> Difference = new ArrayList<>();

        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar.length; j++) {
                if (i != j) {
                    int result = ar[i] - ar[j];
                    Difference.add(result);
                }
            }
        }

        return Difference;
    }

}
