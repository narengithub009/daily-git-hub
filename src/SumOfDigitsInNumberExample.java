import java.util.stream.Stream;

public class SumOfDigitsInNumberExample {

    public static void main(String[] args) {
        System.out.println(sumOfDigits(12345));
        System.out.println(sumOfDigitsWithJava8(123456));
    }

    public static int sumOfDigits(int number) {
        int remainder;
        int sum = 0;
        while (number > 0) {
            remainder = number % 10;
            number = number / 10;
            sum = sum + remainder;
        }
        return sum;
    }

    public static int sumOfDigitsWithJava8(int number) {

        return Stream.of(String.valueOf(number).split(""))
                .mapToInt(Integer::parseInt)
                .sum();
    }
}
