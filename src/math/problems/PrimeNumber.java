package math.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

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

        int n = 1000000;

        long startTime = System.nanoTime();

        PrimeInRange(n);
//        PrimeNumberInRange(n);

        long endTime = System.nanoTime();

        long TimeElapsed = endTime - startTime;

        double seconds = TimeUnit.SECONDS.convert(TimeElapsed, TimeUnit.NANOSECONDS);
        double minutes = TimeUnit.MINUTES.convert(TimeElapsed, TimeUnit.NANOSECONDS);


        if (seconds < 1) {
            System.out.println(TimeElapsed + " ns");
        } else if (seconds > 60) {
            System.out.println(minutes + " min ," + (seconds - (minutes * 60)) + " sec");
        } else {
            System.out.println(seconds + " sec");
        }

    }


    static void PrimeInRange(double n) {
        List<Integer> output = new ArrayList<>();

        long counter = 0;
        for (int i = 1; i <= n; i++) {
            while (i > 0 && PrimeChecker3(i)) {
                System.out.print(++counter + " ");
                System.out.println(i);
                break;
            }
        }
    }



//    ---------------------------------------------------

    static boolean PrimeChecker1(int n) {

        boolean b = true;

        if (n > 1) {


            for (int i = 2; i < n; i++) {
                if (n < 2) {
                    b = false;
                    return b;
                } else if (n % i == 0) {
                    b = false;
                    return b;
                } else {
                    b = true;
                }
            }
        } else {
            b = false;
        }
        return b;

    }

    static boolean PrimeChecker2(double n) {

        if (n > 1) {
            for (int i = 2; 2 * i <= n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }


    }

    static boolean PrimeChecker3(int n) {

        if (n > 1) {
            if (n == 2) {
                return true;
            } else if (n % 2 == 0) {
                return false;
            } else {
                for (int i = 3; i * i <= n; i += 2) {
                    if (n % i == 0) {
                        return false;
                    }
                }
            }
            return true;

        } else {
            return false;
        }


    }

//    ---------------------------------------------

    static boolean[] Sieve(int n) {
        boolean[] primes = new boolean[n];

        Arrays.fill(primes, true);
        primes[0] = false;
        primes[1] = false;

        for (int i = 2; i < primes.length; i++) {
            if (primes[i]) {
                for (int j = 2; i * j < primes.length; j++) {
                    primes[i * j] = false;
                }
            }
        }

        return primes;
    }

    static void PrimeNumberInRange(int n) {
//        boolean[] b = Sieve(n);

        for(int i = 0; i<=Sieve(n).length; i++){
            if(Sieve(n)[i]==true){
                System.out.println(i);
            }else{
                ;
            }
        }


    }

}



