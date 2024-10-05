package Old;

public class ReverseString {

    private static String str = "Hello World";

    public static String reverseString(String str) {

        if (str == null || str.isEmpty()) {
            return str;
        }
        return new StringBuilder(str).reverse().toString();
    }

    public static void main(String[] args) {

        String reverseString = ReverseString.reverseString(str);
        System.out.println(reverseString);

    }
}
