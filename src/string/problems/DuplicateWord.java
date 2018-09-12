package string.problems;

import java.util.*;

/**
 * Created by mrahman on 04/22/17.
 */
public class DuplicateWord {

    static int n;
    static int[] counter;

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";

        for (String m : dublicates(st)) {
            System.out.println(m);
        }

        System.out.println("The Avarage Character length  for all words is : "+ AvarageCharacterLength(st));

    }


    static HashSet<String> dublicates(String st) {

        String[] word = st.split(" ");
        n = word.length;

        counter = new int[n];

        HashSet<String> container = new HashSet<>();

        for (int i = 0; i < n; i++) {
            int c = 0;
            for (int j = 0; j < n; j++) {
                if (word[i].equalsIgnoreCase(word[j])) {
                    c++;
                }
            }

            counter[i] = c;
//            container.add(counter[i]+" : "+word[i]);

            if (counter[i] > 1) {
                container.add(counter[i] + " : " + word[i]);
            }
        }

        return container;


    }

    static int AvarageCharacterLength(String st) {

        String[] word = st.split(" ");
        n = word.length;

        int sum = 0;
        for (int i = 0; i<n;i++){
            sum = sum+word[i].length();
        }
int avg = sum/n;
        return avg;

    }


}
