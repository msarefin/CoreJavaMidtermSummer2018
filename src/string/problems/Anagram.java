package string.problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by mrahman on 04/22/17.
 */
public class Anagram {

    public static void main(String[] args) throws IOException {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".


        System.out.println("This Program will check if two words are Anagram");

        System.out.println("Enter first Word");
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        String FirstWord = br1.readLine();
        System.out.println("Enter Second Word");
        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
        String SecondWord = br2.readLine();

        Boolean Assertion = AnagramChecker(FirstWord, SecondWord);

        if (Assertion == true) {
            System.out.println("You have an Anagram");
        } else {
            System.out.println("You dont have an Anagram");
        }

    }

    static boolean AnagramChecker(String fw, String sw) {

        int first = fw.length();
        int second = fw.length();


        if (first == second) {
            char[] c1 = new char[first];
            char[] c2 = new char[second];


            for (int i = 0; i < first; i++) {
                c1[i] = fw.charAt(i);
                c2[i] = sw.charAt(i);
            }


            sorter(c1, c1.length);

            sorter(c2, c2.length);

            String m = new String(c1);
            String n = new String(c2);

            return m.equalsIgnoreCase(n);

        } else {
            return false;
        }

    }

    static void printme(char[] a) {
        for (char m : a) {
            System.out.print(m + " ");
        }

        System.out.println();
    }

    static void sorter(char[] a, int size) {
        for (int i = 1; i < size; i++) {
            char temp = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > temp) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = temp;
        }
        System.out.println();
    }

}
