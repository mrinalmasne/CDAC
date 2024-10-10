package Assignment2;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class RevWordsString {
	public static String reverseWordsInSentence(String sentence) {
        // Split the sentence into words
        String[] words = sentence.split(" ");
        
        // Convert the array to a list for easy reversal
        List<String> wordList = Arrays.asList(words);
        
        // Reverse the order of words
        Collections.reverse(wordList);
        
        // Join the words back into a single string
        return String.join(" ", wordList);
    }
	 public static void main(String[] args) {
	        // Test case 1
	        String sentence1 = "Hello World";
	        String result1 = reverseWordsInSentence(sentence1);
	        System.out.println("Reversed: " + result1);
}
}
