package math.problems;

import string.problems.Palindrome;

public class PrimeNumber {

    public static void main(String[] args) {
        /*
         * Find list of Prime numbers from number 2 to 1 million.
         * Try the best solution as possible.Which will take less CPU life cycle.
         * Out put number of Prime numbers on the given range.
         *
         *
         * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
         *
         */

        int n = 869609989;

        System.out.println(PrimeChecker(n));

    }


    static boolean PrimeChecker(double n) {

        boolean output = true;
        if (n < 2) {
            output = false;
        } else {
            for (int i = 2; i <= n; i++) {
                if (i != n && n % i != 0) {
                    output = false;
                } else {
                    output = true;
                }
            }
        }

        return output;
    }
}
