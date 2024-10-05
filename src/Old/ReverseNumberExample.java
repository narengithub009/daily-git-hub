package Old;

public class ReverseNumberExample {
    public static void main(String[] args) {

        System.out.println(reverseNumber(123));
    }

    public static int reverseNumber(int number) {

        int reverse = 0;
        int remainder;

        while (number > 0) {
            remainder = number % 10;
            System.out.println(remainder);
            number = number / 10;
            System.out.println(number);
            reverse = reverse * 10 + remainder;
            System.out.println(reverse);
        }

        return reverse;
    }
}
