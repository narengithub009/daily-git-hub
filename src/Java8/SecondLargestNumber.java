package Java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondLargestNumber {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(12, 32, 34, 43, 45, 56, 65, 67);
        Integer integer = numbers.stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .get();
        System.out.println(integer);
    }
}
