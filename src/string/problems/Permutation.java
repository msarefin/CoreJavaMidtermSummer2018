package string.problems;

/**
 * Created by mrahman on 04/22/17.
 */
public class Permutation {

    public static void main(String[] args) {

        /*
         * Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
         * Write Java program to compute all Permutation of a String
         *
         */

        permutations("Hello");

    }

    static void permutations(String word){
        permute(word);
    }

   private static void permute(String word) {
        if (word == null || word.length() == 0) {
            System.out.println("You must enter a word!");
            return;

        } else if (word.length() == 1) {
            System.out.println(word);
            return;
        }

        else {
            perm("", word);
        }

    }

    private static void perm(String prefix, String remaining) {
        if (remaining.length() == 0) {
            System.out.println(prefix);
            return;
        } else {
            for (int i = 0; i < remaining.length(); i++) {
                perm(prefix + remaining.charAt(i),remaining.substring(0, i) + remaining.substring(i + 1, remaining.length()));

                //
            }
        }
    }

}
