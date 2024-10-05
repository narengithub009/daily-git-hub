package Java;

import java.util.stream.IntStream;

public class Refactor {

    public static void main(String[] args) {
        System.out.println(isPrime(8));
        System.out.println(isPrimeCheckWithJava8(8));
    }

    public static boolean isPrime(int number) {

        boolean isDivisable = false;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isDivisable = true;
                break;
            }
        }
        return number > 1 && !isDivisable;

    }

    public static boolean isPrimeCheckWithJava8(int number) {

        return IntStream.range(2, number).noneMatch(n -> number % n == 0);
    }
}
