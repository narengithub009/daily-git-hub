package Old;

import java.util.Arrays;
import java.util.List;

public class ShortCircuitExample {

        public static void main(String[] args) {

                List<Integer> numbers = Arrays.asList(3, 2, 2, 4, 2, 2, 2);
                boolean anyMatch = numbers.stream()
                                .peek(num -> System.out.println(" processing ; " + num))
                                .anyMatch(n -> n % 2 != 0);
                System.out.println(anyMatch);

                System.out.println("******************");

                boolean allMatch = numbers.stream()
                                .peek(num -> System.out.println("processing : " + num))
                                .allMatch(n -> n % 2 == 0);
                System.out.println(allMatch);

                Integer orElse = numbers.stream()
                                .peek(num -> System.out.println("Processing : " + num))
                                .filter(n -> n % 2 == 0)
                                .findAny()
                                .orElse(0);

                System.out.println(orElse);

                Integer findFirst = numbers.stream()
                                .peek(num -> System.out.println("processing : " + num))
                                .filter(n -> n % 2 == 0)
                                .findFirst()
                                .orElse(-1);
                System.out.println(findFirst);

                boolean noneMatch = numbers.stream()
                                .peek(num -> System.out.println("processing : " + num))
                                .noneMatch(n -> n % 2 != 0);

                System.out.println(noneMatch);
        }
}
