import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ConvertArrayListInStreams {
    public static void main(String[] args) {

        Stream<String> strStream = Stream.of("a", "b");
        strStream.map(s -> s.toUpperCase()).forEach(System.out::println);
        System.out.println("******************************");
        List<String> names = Arrays.asList("Narender", "Anny", "Neeraja", "Aswitha");
        names.stream().forEach(System.out::println);
        System.out.println("************************");

        names.stream().filter(s -> s.startsWith("N")).forEach(System.out::println);

        System.out.println("***************************");

        names.stream().sorted().forEach(System.out::println);

        System.out.println("*********************");

        names.stream().sorted((a, b) -> b.compareTo(a))
                .forEach(System.out::println);

        System.out.println("**********************");

        names.stream().filter(s -> s.startsWith("A"))
                .map(a -> a.toUpperCase()).forEach(System.out::println);

        System.out.println("**********************");

        boolean anyMatch = names.stream().anyMatch(s -> s.startsWith("M"));

        System.out.println(anyMatch);
        long count = names.stream().filter(s -> s.startsWith("A")).count();
        System.out.println(count);

        System.out.println("***************");
        Stream<Integer> integers = Stream.of(12, 23, 34);
        integers.forEach(System.out::println);

    }
}
