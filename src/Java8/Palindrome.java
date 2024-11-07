package Java8;

import java.util.stream.IntStream;

public class Palindrome {

    public static void main(String[] args) {

        String str = "1ROTATOR1";
        boolean isItPalindrom = IntStream.range(0, str.length() / 2)
                .noneMatch(i -> str.charAt(i) != str.charAt(str.length() - i - 1));
        if (isItPalindrom) {
            System.out.println("The given string is Palindrome");
        } else {
            System.out.println("The given string is not Palindrome");
        }
    }
}
