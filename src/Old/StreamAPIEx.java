package Old;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamAPIEx {
    public static void main(String[] args) {
        // Filtering...
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> evenNumbers = integers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        evenNumbers.forEach(System.out::println);

        // Mapping...
        List<String> list = Arrays.asList("Hello", "World");
        List<String> mappList = list.stream().map(String::toUpperCase)
                .collect(Collectors.toList());
        mappList.forEach(System.out::println);

        // Reducing...

        List<Integer> integers2 = Arrays.asList(1, 2, 3, 4, 5);
        Integer sum = integers2.stream().reduce(0, (a, b) -> a + b);

        System.out.println(sum);

        List<Integer> integers3 = Arrays.asList(1, 7, 9, 4, 5, 6);

        List<Integer> sqr = integers3.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());
        System.out.println(sqr);
        String str = null;
        System.out.println(str);
        Optional<String> of = Optional.of("");
        of.ifPresent(s -> System.out.println(s));

        integers3.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}
