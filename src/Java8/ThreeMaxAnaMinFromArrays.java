package Java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ThreeMaxAnaMinFromArrays {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(12, 34, 1, 34, 24, 24, 56, 34);
        numbers.stream()
                .sorted()
                .limit(3)
                .collect(Collectors.toList())
                .forEach(System.out::println);

        numbers.stream()
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .collect(Collectors.toList())
                .forEach(System.out::println);

    }
}
