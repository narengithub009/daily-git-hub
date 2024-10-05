package Old;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RemoveVowels {

    public static String removeVowels(String str) {

        return str.replaceAll("[AEIOUaeiou]", "");
    }

    public static void main(String[] args) {

        String removeVowels = RemoveVowels.removeVowels("HelloHowareyou");
        System.out.println(removeVowels);

        List<String> names = Arrays.asList("Narender", "Anny", "Neeraja", "Aswitha");

        Collections.sort(names, (a, b) -> a.compareTo(b));

        names.forEach(System.out::println);

<<<<<<< HEAD
=======
        Stream<String> streamArray = Stream.of(strings).sorted().map(String::toUpperCase).distinct();
        streamArray.forEach(System.out::println);

        List<Integer> limitStream = Stream.of(integers).limit(5).collect(Collectors.toList());
        System.out.println(limitStream);

        List<Integer> skipStream = Stream.of(integers).skip(5).collect(Collectors.toList());
        System.out.println(skipStream);

        names.parallelStream()
                .forEach(name -> System.out.println(Thread.currentThread().getName() + " " + name));
>>>>>>> branch1
    }
}
