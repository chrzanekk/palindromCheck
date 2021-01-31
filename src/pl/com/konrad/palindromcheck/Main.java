package pl.com.konrad.palindromcheck;

public class Main {

    public static void main(String[] args) {
        System.out.println(Palindrome.isPalindrome("Ala"));
        System.out.println(Palindrome.isPalindrome("Konrad"));
        System.out.println(Palindrome.isPalindrome("Kajak"));
        System.out.println("-----------------------------------------");
        System.out.println(Palindrome.isPalindromeViaSB("Ala"));
        System.out.println(Palindrome.isPalindromeViaSB("Konrad"));
        System.out.println(Palindrome.isPalindromeViaSB("Kajak"));

    }
}
