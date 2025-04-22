package Java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Testing {
    public static void main(String[] args) {

        Testing testing = new Testing();
        List<Integer> integer = Arrays.asList(1, 3, 4, 8, 2);

        String str = "Hello";
        str = str.concat(" World");
        System.out.println(str);

        List<Integer> integers = Arrays.asList(1, 2, 3, 455, 3, 2);

        integers.stream().filter(n -> n % 2 == 0) // predicate "filtering in stream"
                .map(n -> n * 2) // Function // mapping values
                .forEach(System.out::println); // Consumer "printing and collecting"

        List<String> strings = Arrays.asList("1", "3", "5");

        List<Integer> listIntegers = strings.stream().map(Integer::parseInt)
                .collect(Collectors.toList());
        listIntegers.forEach(System.out::println);

        List<String> list = Arrays.asList("Narender", "Anny", "Shreyanvi");
        list.sort((s1, s2) -> s1.compareToIgnoreCase(s2));
        System.out.println(list);

        Supplier<Double> supplier = () -> Math.random();
        System.out.println(supplier.get());
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age connot be negative");
        }
    }
}
