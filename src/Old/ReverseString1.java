package Old;

import java.util.stream.IntStream;

public class ReverseString1 {

    public static void main(String[] args) {

        System.out.println(reverseString("Hello Worldw"));
        System.out.println(reverseStr("Narender Konreddy"));

    }

    public static String reverseString(String str) {
        char[] ch = str.toCharArray();
        char temp;
        System.out.println(ch.length / 2);
        for (int i = 0, j = ch.length - 1; i < (ch.length) / 2; i++, j--) {

            temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
        }

        return new String(ch);
    }

    public static String reverseStr(String str) {

        return IntStream.range(0, str.length())
                .mapToObj(i -> str.charAt(str.length() - i - 1))
                .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
                .toString();
    }
}
