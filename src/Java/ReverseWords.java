package Java;

import java.util.Arrays;

public class ReverseWords {
    public static void main(String[] args) {
        System.out.println(reverseWords("Hello how are you"));
    }

    public static String reverseWords(String str) {

        String[] strings = str.split(" ");
        String[] finalStr = new String[strings.length];
        for (int i = strings.length - 1, j = 0; i >= 0; i--, j++) {
            finalStr[j] = strings[i];
        }
        return String.valueOf(Arrays.toString(finalStr));
    }
}
