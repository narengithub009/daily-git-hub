package Java8;

import java.util.stream.IntStream;

public class PrintFirstTenNumbers {
    public static void main(String[] args) {

        IntStream.rangeClosed(1, 10)
                .filter(i -> i % 2 == 0)
                .forEach(System.out::println);
    }
}
