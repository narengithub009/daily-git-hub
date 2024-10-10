package Java8;

import java.util.stream.IntStream;

public class PalindromeExample {

    public static void main(String[] args) {
        System.out.println("Palindrom check");
        System.out.println(isPalindromOrNot("abba"));
    }

    private static boolean isPalindromOrNot(String string) {

        return IntStream.range(0, string.length() / 2)
                .allMatch(i -> string.charAt(i) == string.charAt(string.length() - i - 1));

    }
}
