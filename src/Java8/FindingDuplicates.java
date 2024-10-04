package Java8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindingDuplicates {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 4, 54, 3, 2, 3);

        Set<Integer> integers = new HashSet<>();

        System.out.println("*********find duplicates********");
        numbers.stream()
                .filter(num -> !integers.add(num)).collect(Collectors.toSet()).forEach(System.out::println);

        System.out.println("*********Limit************");
        numbers.stream()
                .limit(4).forEach(System.out::println);

        System.out.println("*********Skip***********");

        numbers.stream()
                .skip(4).forEach(System.out::println);

    }
}
