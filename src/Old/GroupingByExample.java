package Old;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class GroupingByExample {
        public static void main(String[] args) {

                List<String> names = Arrays.asList("Narender", "Aswitha", "Neeraja", "Anny", "MadaM", "sus");
                Map<Character, List<String>> groupByNames = names.stream()
                                .collect(Collectors.groupingBy(name -> name.charAt(0)));

                System.out.println(groupByNames);

                names.stream()
                                .map(String::toUpperCase)
                                .filter(s -> s.startsWith("A"))
                                .findFirst()
                                .ifPresent(System.out::println);

                String longString = names.stream()
                                .collect(Collectors.joining(", "));
                System.out.println(longString);

                List<List<Integer>> doubleList = Arrays.asList(
                                Arrays.asList(1, 2, 3, 4),
                                Arrays.asList(3, 4, 2, 4),
                                Arrays.asList(9, 6, 7));
                List<Integer> toOneList = doubleList.stream()
                                .flatMap(List::stream)
                                .collect(Collectors.toList());
                System.out.println(toOneList);

                List<String> isPalindrom = names.stream()
                                .filter(GroupingByExample::isPalindromString)
                                .collect(Collectors.toList());

                System.out.println(isPalindrom);

                int[] numbers = { 12, 3, 4, 24, 45, 23, 33, 33 };

                OptionalInt first = Arrays.stream(numbers)
                                .distinct()
                                .sorted()
                                .skip(numbers.length - 2).findFirst();
                System.out.println(numbers.length - 2);
                System.out.println(first.getAsInt());
        }

        public static boolean isPalindromString(String str) {

                return str.equals(new StringBuilder(str).reverse().toString());
        }
}
