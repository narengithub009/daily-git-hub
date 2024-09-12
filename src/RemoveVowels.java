import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RemoveVowels {

    public static String removeVowels(String str) {

        return str.replaceAll("[AEIOUaeiou]", "");
    }

    public static void main(String[] args) {

        String removeVowels = RemoveVowels.removeVowels("HelloHowareyou");
        System.out.println(removeVowels);

        List<String> names = Arrays.asList("Narender", "Anny", "Neeraja", "Aswitha");

        String[] strings = { "Narender1", "Anny1", "Neeraja1", "Aswitha1", "Aswitha1" };
        Integer[] integers = { 1, 2, 5, 67, 4, 3, 46, 35, 7, 4, 37, 7, 7, 7 };
        Collections.sort(names, (a, b) -> a.compareTo(b));

        names.forEach(System.out::println);

        Stream<String> streamArray = Stream.of(strings).sorted().map(String::toUpperCase).distinct();
        streamArray.forEach(System.out::println);

        List<Integer> limitStream = Stream.of(integers).limit(5).collect(Collectors.toList());
        System.out.println(limitStream);

        List<Integer> skipStream = Stream.of(integers).skip(5).collect(Collectors.toList());
        System.out.println(skipStream);
    }
}
