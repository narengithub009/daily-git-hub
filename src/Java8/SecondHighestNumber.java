package Java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecondHighestNumber {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 4, 5, 56);

        Optional<Integer> first = numbers.stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();

        first.ifPresent(v -> System.out.println(v));
    }
}
