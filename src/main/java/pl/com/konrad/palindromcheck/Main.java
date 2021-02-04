package pl.com.konrad.palindromcheck;

public class Main {

    public static void main(String[] args) {
        System.out.println(Palindrome.isPalindrome("Ala"));
        System.out.println(Palindrome.isPalindrome("Konrad"));
        System.out.println(Palindrome.isPalindrome("Konnok"));
        System.out.println(Palindrome.isPalindrome("Kondzio"));
        System.out.println(Palindrome.isPalindrome(""));
        System.out.println(Palindrome.isPalindrome("k"));
        System.out.println(Palindrome.isPalindrome(" "));

        System.out.println("-----------------------------------------");
        System.out.println(Palindrome.isPalindromeViaSB("Ala"));
        System.out.println(Palindrome.isPalindromeViaSB("Konrad"));
        System.out.println(Palindrome.isPalindromeViaSB("Konnok"));
        System.out.println(Palindrome.isPalindromeViaSB("Kondzio"));
        System.out.println(Palindrome.isPalindrome(""));
        System.out.println(Palindrome.isPalindrome("k"));
        System.out.println(Palindrome.isPalindrome(" "));
    }
}
