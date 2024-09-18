public class PalindromeEx {

    public static boolean isPalindrom(String str) {

        int start = 0, end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "madam";
        System.out.println(isPalindrom(str));
    }
}
