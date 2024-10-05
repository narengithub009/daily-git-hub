package Old;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

class SampleTemp {
    final static int x = 10;
    private static int y = 10;
    private static boolean anyMatch;
    private static boolean noneMatch;
    private static long count;
    private static Stream<Integer> of;
    private static Stream<Integer> of2;
    private static Stream<String> of3;
    private static Stream<String> of4;
    private static String string;

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("ank");
        stringList.add("sam");
        stringList.add("az");
        stringList.add("neh");
        stringList.add("ad");

        // anyMatch = stringList.stream().anyMatch(s -> s.startsWith("a"));
        // System.out.println(anyMatch);
        // count = stringList.stream().filter(s -> s.startsWith("z")).count();
        // System.out.println(count);
        // noneMatch = stringList.stream().noneMatch(s -> s.startsWith("z"));
        // System.out.println(noneMatch);
        // System.out.println("***********");
        // stringList.stream()
        // .filter(s -> s.startsWith("a"))
        // .forEach(System.out::println);
        // System.out.println("**Sorting**");
        // stringList.stream()
        // .filter(s -> s.startsWith("a"))
        // .sorted()
        // .forEach(System.out::println);
        // System.out.println("**Sorting decending**");
        // stringList.stream()
        // .filter(s -> s.startsWith("a"))
        // .sorted((o1, o2) -> o2.compareTo(o1))
        // .forEach(System.out::println);
        // stringList.stream()
        // .filter(s -> s.startsWith("a"))
        // .map(t -> t.toUpperCase())
        // .sorted()
        // .forEach(System.out::println);

        // System.out.println("**********");

        // of = Stream.of(12, 23, 34);

        // of2 = Stream.of(new Integer[] { 12, 23, 45 });

        // of.forEach(System.out::println);

        // of3 = Stream.of("a", "b");

        // of4 = Stream.of(new String[] { "c", "d" });

        // of3.forEach(System.out::println);

        stringList.stream().distinct().forEach(System.out::println);
        String optional = stringList.stream().findFirst().orElse("default");

    }
}

@FunctionalInterface
interface MyInterfaceType<A, B> {
    A convertIntToString(B str);

}

@FunctionalInterface
interface MyInterface {

    int sum(int a, int b);

    default void test1() {
        System.out.println("default method....");
    }

}