package string.problems;

public class UnitTestingStringProblem {
    public static void main(String[] args) {
        //Apply Unit Test into all the methods in this package.
        String sentence = "When you have eleminated the impossible, what remains however improbable, must be the truth !";
        String word1 = "Teacher";
        String word2 = "Cheater";
        String word3 = "malayalam";

        try{
            Anagram.AnagramChecker(word1,word2);
        }catch (Exception e){
            System.out.println("Failed");
        }


        try{
            DetermineLargestWord.LargestWord(sentence);
        }catch (Exception e){
            System.out.println("Failed");
        }

        try{
            DuplicateWord.DuplicateWordsInSentence(sentence);
        }catch (Exception e){
            System.out.println("Failed");
        }

        try{
            Palindrome.IsItAPalindrome(word3);
        }catch (Exception e){
            System.out.println("Failed");
        }

        try{
            Permutation.permutations(word3);
        }catch (Exception e){
            System.out.println("Failed");
        }

    }
}
