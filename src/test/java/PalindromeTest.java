import org.junit.Test;
import pl.com.konrad.palindromcheck.Palindrome;

import static org.junit.Assert.assertEquals;

public class PalindromeTest {

    @Test
    public void isSentenceIsPalindromeOddLengthExpectedResultTrue() {
        String sentence = "Ala";

        boolean result = Palindrome.isPalindrome(sentence);

        assertEquals(true, result);
    }

    @Test
    public void isSentenceIsPalindromeEvenLengthExpectedResultTrue() {
        String sentence = "Konnok";

        boolean result = Palindrome.isPalindrome(sentence);

        assertEquals(true, result);
    }

    @Test
    public void isSentenceIsPalindromeOddLengthExpectedResultFalse() {
        String sentence = "Kondzio";

        boolean result = Palindrome.isPalindrome(sentence);

        assertEquals(false, result);
    }

    @Test
    public void isSentenceIsPalindromeEvenLengthExpectedResultFalse() {
        String sentence = "Konrad";

        boolean result = Palindrome.isPalindrome(sentence);

        assertEquals(false, result);
    }

    @Test
    public void isSentenceIsPalindromeEmptyStringExpectedResultFalse() {
        String sentence = "";

        boolean result = Palindrome.isPalindrome(sentence);

        assertEquals(false, result);
    }

    @Test
    public void isSentenceIsPalindromeWhitespaceInputExpectedResultFalse() {
        String sentence = " ";

        boolean result = Palindrome.isPalindrome(sentence);

        assertEquals(false, result);
    }

    @Test
    public void isSentenceIsPalindromeSingleCharacterInputExpectedResultTrue() {
        String sentence = "k";

        boolean result = Palindrome.isPalindrome(sentence);

        assertEquals(true, result);
    }

    @Test
    public void isSentenceIsPalindromeViaSBOddLengthExpectedResultTrue() {
        String sentence = "Ala";

        boolean result = Palindrome.isPalindromeViaSB(sentence);

        assertEquals(true, result);
    }

    @Test
    public void isSentenceIsPalindromeViaSBEvenLengthExpectedResultTrue() {
        String sentence = "Konnok";

        boolean result = Palindrome.isPalindromeViaSB(sentence);

        assertEquals(true, result);
    }

    @Test
    public void isSentenceIsPalindromeViaSBOddLengthExpectedResultFalse() {
        String sentence = "Kondzio";

        boolean result = Palindrome.isPalindromeViaSB(sentence);

        assertEquals(false, result);
    }

    @Test
    public void isSentenceIsPalindromeViaSBEvenLengthExpectedResultFalse() {
        String sentence = "Konrad";

        boolean result = Palindrome.isPalindromeViaSB(sentence);

        assertEquals(false, result);
    }

    @Test
    public void isSentenceIsPalindromeViaSBEmptyStringExpectedResultFalse() {
        String sentence = "";

        boolean result = Palindrome.isPalindromeViaSB(sentence);

        assertEquals(false, result);
    }

    @Test
    public void isSentenceIsPalindromeViaSBWhitespaceInputExpectedResultFalse() {
        String sentence = " ";

        boolean result = Palindrome.isPalindromeViaSB(sentence);

        assertEquals(false, result);
    }

    @Test
    public void isSentenceIsPalindromeViaSBSingleCharacterInputExpectedResultTrue() {
        String sentence = "k";

        boolean result = Palindrome.isPalindromeViaSB(sentence);

        assertEquals(true, result);
    }
}
