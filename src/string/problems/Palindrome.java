package string.problems;

public class Palindrome {
    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */

        Palindrome("Malayalam");

    }


    static void Palindrome(String word){
        String output = reverse(word);

        if(word.equalsIgnoreCase(output)){
            System.out.println("The word is a Palindrome");
        }else{
            System.out.println("The word is not an Palindrome");
        }
    }

    static String reverse(String w){

        char [] s = new char[w.length()];

        for(int i =0; i<s.length; i++){
            s[i] = w.charAt(i);

        }

        String output = "";
        for(int i = s.length-1; i>=0;i--){
            output=output+s[i];
        }


        return output;
    }
}
