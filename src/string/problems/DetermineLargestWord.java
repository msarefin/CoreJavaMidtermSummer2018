package string.problems;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class DetermineLargestWord {
    public static void main(String[] args) {
        /*
         Implement to Find the length and longest word in the given sentence below.
         Should return "10 biological".
         */
        String s="Human brain is a biological learning machine";

        LargestWord(s);



    }


    static void LargestWord(String s){
        Map<Integer, String> wordNLength = findTheLargestWord(s);
        //implement

        Set set =  wordNLength.entrySet();

        Iterator i = set.iterator();

        while (i.hasNext()){
            Map.Entry e = (Map.Entry)i.next();
            System.out.print(e.getKey()+" : ");
            System.out.print(e.getValue());
        }
    }

    private static Map<Integer, String> findTheLargestWord(String wordGiven){
        Map<Integer, String> map = new HashMap<Integer, String>();
        String st = "";
        //implement


        String[] words = wordGiven.split(" ");

        for(int i = 0; i<words.length-1; i++){

//            st = words[i];
//            for(int j =0; j<=i; j++){
                while (words[i].length() > st.length() ) {
                    st = words[i];

//                }
            }
        }


        map.put(st.length(),st);



        return map;
    }
}
