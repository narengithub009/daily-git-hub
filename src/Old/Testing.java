import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Testing {

        public static void main(String[] args) {
                List<Integer> asList = Arrays.asList(1, 2, 3, 4, 5);
                asList.stream()
                                .sorted((a, b) -> b - a).collect(Collectors.toList())
                                .forEach(System.out::println);

                List<String> upperCaseList = Arrays.asList("Banana", "Apple", "Mango", "Orange");
                upperCaseList.stream()
                                .map(String::toUpperCase).collect(Collectors.toList())
                                .forEach(System.out::println);

                long count = upperCaseList.stream()
                                .filter(s -> s.length() > 3)
                                .count();

                System.out.println(count);

                upperCaseList.stream()
                                .collect(Collectors.toMap(s -> s, s -> s.length()))
                                .forEach((a, v) -> System.out.println(a + " " + v));

                Optional<Integer> max = asList.stream().max(Integer::compareTo);
                max.ifPresent(v -> System.out.println(v));

                Map<Integer, List<String>> groupByMap = upperCaseList.stream()
                                .collect(Collectors.groupingBy(String::length));
                groupByMap.forEach((length, string) -> System.out.println(length + " " + string));

                String result = upperCaseList.stream()
                                .collect(Collectors.joining(", "));
                System.out.println(result);

                Optional<String> str = upperCaseList.stream()
                                .filter(s -> s.startsWith("b"))
                                .findFirst();

                str.ifPresent(System.out::println);

                double avg = asList.stream()
                                .mapToInt(Integer::intValue)
                                .average()
                                .orElse(0);

                System.out.println(avg);

                boolean allMatch = upperCaseList.stream()
                                .anyMatch(s -> s.startsWith("A"));

                System.out.println(allMatch);

                Predicate<String> predicate = s -> s.matches("^[AEIOUaeiou].*");
                Map<Boolean, List<String>> collect = upperCaseList.stream()
                                .collect(Collectors.partitioningBy(predicate));

                collect.forEach((k, v) -> System.out.println(k + " " + v));

                Optional<String> max2 = upperCaseList.stream()
                                .max((s1, s2) -> Integer.compare(s1.length(), s2.length()));

                System.out.println(max2);

                Optional<Integer> secondHightNum = asList.stream()
                                .sorted((a, b) -> b - a)
                                .skip(1)
                                .findFirst();
                secondHightNum.ifPresent(System.out::println);

                Integer mulInteger = asList.stream()
                                .reduce(1, (a, b) -> a * b);
                System.out.println(mulInteger);

                Optional<Integer> min = asList.stream()
                                .min(Integer::compareTo);

                min.ifPresent(System.out::println);

                List<Integer> collect2 = IntStream.range(1, 11)
                                .map(n -> n * n)
                                .boxed()
                                .collect(Collectors.toList());

                collect2.forEach(System.out::println);

                String reduce = upperCaseList.stream()
                                .reduce(" ", (a, b) -> a + b);
                System.out.println(reduce);

                int sum = asList.stream()
                                .filter(n -> n % 2 == 0)
                                .mapToInt(Integer::intValue)
                                .sum();

                System.out.println(sum);
        }
}
