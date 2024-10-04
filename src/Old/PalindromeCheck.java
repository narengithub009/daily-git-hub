package Old;

public class PalindromeCheck {

    public static boolean palindromCheck(int num) {
        int final2 = num;
        int reverse = 0;
        int digit;
        while (num != 0) {

            digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;

        }
        return final2 == reverse;
    }

    public static void main(String[] args) {
        int num = 1213;
        System.out.println(palindromCheck(num));
    }
}
