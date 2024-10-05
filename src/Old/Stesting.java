package Old;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Stesting {
        public static void main(String[] args) {

                List<String> list = Arrays.asList("Bob", "Alice", "Charlie");
                list.stream().map(String::length)
                                .collect(Collectors.toList()).forEach(System.out::println);

                Arrays.asList(Arrays.asList("A", "B"),
                                Arrays.asList("C", "D")).stream()
                                .map(List::stream).collect(Collectors.toList()).forEach(System.out::println);
                Arrays.asList(1, 2, 3, 2, 3, 42, 3, 4, 5).stream().distinct()
                                .collect(Collectors.toList()).forEach(System.out::println);

                list.stream().sorted().collect(Collectors.toList())
                                .forEach(System.out::println);
                Arrays.asList(1, 2, 3, 4, 5, 6)
                                .stream().limit(3).collect(Collectors.toList())
                                .forEach(System.out::println);

                Arrays.asList(4, 5, 6, 7, 8, 9)
                                .stream().skip(3).collect(Collectors.toList())
                                .forEach(System.out::println);
                Integer sum = Arrays.asList(1, 2, 3, 4, 5)
                                .stream().reduce(0, Integer::sum);
                System.out.println(sum);

                boolean allMatch = Arrays.asList(1, 2, 3, 4, 5)
                                .stream().allMatch(n -> n % 2 == 0);
                System.out.println(allMatch);

                boolean anyMatch = Arrays.asList(1, 2, 3, 4, 5)
                                .stream().anyMatch(n -> n % 2 == 0);
                System.out.println(anyMatch);

                boolean noneMatch = Arrays.asList(1, 2, 3, 4, 5)
                                .stream().noneMatch(n -> n % 2 == 0);
                System.out.println(noneMatch);

                Optional<String> first = list.stream().findFirst();
                System.out.println(first.get());

                list.stream()
                                .filter(s -> s.startsWith("A") || s.startsWith("B"))
                                .collect(Collectors.toList()).forEach(System.out::println);

                List<Person> persons = Arrays.asList(
                                new Person(23, "Baba"),
                                new Person(23, "Bob"),
                                new Person(37, "Narender"),
                                new Person(37, "Neeraja"));
                persons.stream().map(Person::getName)
                                .sorted(Comparator.reverseOrder())
                                .collect(Collectors.toList()).forEach(System.out::println);

                // Map<Integer, String> toMap = persons.stream()
                // .collect(Collectors.toMap(Person::getAge, Person::getName));
                // System.out.println(toMap);

                Map<Boolean, List<Integer>> parMap = Arrays.asList(1, 2, 3, 4, 5, 5, 6, 7, 8)
                                .stream().collect(Collectors.partitioningBy(n -> n % 2 == 0));

                System.out.println(parMap);

                Map<Integer, Long> counting = persons.stream()
                                .collect(Collectors.groupingBy(Person::getAge, Collectors.counting()))
                                .;
                System.out.println(counting);

                
        }
}
