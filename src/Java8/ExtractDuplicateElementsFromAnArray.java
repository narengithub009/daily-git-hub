package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ExtractDuplicateElementsFromAnArray {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(111, 112, 111, 233, 233, 342, 345, 454);

        Set<Integer> setOfNumbers = numbers.stream()
                .collect(Collectors.toSet());
        System.out.println(setOfNumbers);
    }
}
