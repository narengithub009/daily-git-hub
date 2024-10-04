package Old;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class IntStreamExamples {
    public static void main(String[] args) {

        for (int i = 0; i < 6; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " is even number ");
            }
        }

        IntStream intStream = IntStream.of(1, 2, 3, 4, 5);
        IntStream intStream2 = IntStream.of(new int[] { 1, 2, 3, 4, 5 });
        IntStream intStream3 = IntStream.range(1, 6);
        IntStream.range(0, 10).filter(i -> i % 2 == 0).forEach(System.out::println);

        System.out.println("---------");
        IntStream.range(1, 10)
                .filter(n -> n > 2)
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);

        System.out.println("---------");

        int sum = IntStream.of(1, 2, 3, 4, 5).sum();
        System.out.println("the sum is : " + sum);
        System.out.println("---------");

        OptionalInt int1 = IntStream.of(1, 2, 3, 4, 5, 6).max();
        System.out.println("max value is :" + int1.getAsInt());
    }
}
