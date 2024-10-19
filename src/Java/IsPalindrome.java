package Java;

public class IsPalindrome {

    private static String str = "Madam";

    public static void main(String[] args) {

        System.out.println(revese(str));
    }

    public static boolean revese(String str) {
        if (str.isEmpty()) {
            return false;
        }
        char[] charArray = str.toCharArray();
        char[] result = new char[charArray.length];
        for (int i = charArray.length - 1, j = 0; i >= 0; i--, j++) {

            result[j] = charArray[i];
        }
        System.out.println(String.valueOf(result));
        return str.equalsIgnoreCase(String.valueOf(result));
    }
}
