package pl.com.konrad.palindromcheck;

import java.util.Locale;

public class Palindrome {
    public static boolean isPalindrome(String sentence) {
        String cleanSentence = sentence.replaceAll("\\s+", "").toLowerCase();
        int forward = 0;
        int backward = cleanSentence.length()-1;
        while (backward> forward) {
            char forwardChar = cleanSentence.charAt(forward++);
            char backwardChar = cleanSentence.charAt(backward--);
            if(forwardChar!=backwardChar) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindromeViaSB(String sentence) {
        String cleanSentence = sentence.replaceAll("\\s+", "").toLowerCase();
        StringBuilder sentenceToCheck = new StringBuilder(cleanSentence);
        return sentence.equalsIgnoreCase(String.valueOf(sentenceToCheck.reverse()));
    }

}
