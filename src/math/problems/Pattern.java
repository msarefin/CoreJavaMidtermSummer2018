package math.problems;

import java.util.HashMap;
import java.util.HashSet;

public class Pattern {

    public static void main(String[] args) {
        /* Read this numbers, find the pattern then implement the logic from this pattern.which will give you this output.
         * 100,99,98,97,96,95,94,93,92,91,90,88,86,84,82,80,78,76,74,72,70,67,64,61,58,55,52,49,46,43,40,36,32............
         *
         *
         */


        int[] arr = new int[]{100, 99, 98, 97, 96, 95, 94, 93, 92, 91, 90, 88, 86, 84, 82, 80, 78, 76, 74, 72, 70, 67, 64, 61, 58, 55, 52, 49, 46, 43, 40, 36, 32};

        for (int n : arr) {
            System.out.print(n + "\t");
        }
        System.out.println();
//        for (int n : locationWherePatternStops(arr)) {
//            System.out.print("\t" + n);
//        }


        Implement(100, arr, 40);

    }

    static void Implement(int n, int[] arr, int range) {

        int previous = 0;
        int m = 0;
//int size = locationWherePatternStops(arr).size();
        int[] z = IncrementList(Pattern(arr));

        System.out.print(n + "\t");
        for (int i = 0; i < z.length; i++) {
            for (int j = 1; j <= range; j++) {
                m = z[i] * 10;
                if (j > previous && j <= m) {


                    n = n - (m) / 10;
                    System.out.print(n + "\t");
                }

            }
            previous = m;
        }
    }


    private static int[] IncrementList(int[] ar) {
        HashSet<Integer> IncList = new HashSet<>();

        for (int i = 0; i < ar.length; i++) {
            IncList.add(ar[i]);
        }

        Integer[] temp = IncList.toArray(new Integer[0]);

        int[] arr = new int[IncList.size()];
        for (int i = 0; i < IncList.size(); i++) {
            arr[i] = temp[i];
        }

        return arr;
    }

    private static int[] Pattern(int[] ar) {
        int[] seq = new int[ar.length - 1];

        for (int i = 0; i < seq.length; i++) {
            seq[i] = ar[i] - ar[i + 1];
        }

        return seq;
    }

}
