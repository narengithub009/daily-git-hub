package Java;

public class PalindromeExample {

    public static void main(String[] args) {
        System.out.println(isPalindromOrNot("abbaq"));
    }

    private static boolean isPalindromOrNot(String string) {

        char[] cs = string.toCharArray();

        for (int i = 0, j = cs.length - 1; i < cs.length / 2; i++, j--) {

            if (cs[i] != cs[j]) {
                return false;
            }
        }
        return true;
    }
}
