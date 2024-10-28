package Java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class DecimalsReverseOrder {
    public static void main(String[] args) {

        List<Double> numbers = Arrays.asList(12.3, 23.3, 34.87, 88.8, 27.4, 2.4, 27.2, 232.23, 23.34);
        numbers.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

    }
}
