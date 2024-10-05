package Old;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Sample {
    static int i = 10;
    int j = 10;

    public static void main(String[] args) {

        List<Integer> integers = new ArrayList<>();
        integers.add(12);
        integers.add(13);
        Stream<Integer> stream = integers.stream();
        stream.forEach(System.out::println);

        List<String> list = new ArrayList<>();
        list.add("Naren");
        list.add("Hello");
        list.add("FUnny");
        list.add("Anny");
        list.add("Henry");
        list.add("Hyd");

        Stream<String> toString = list.stream();
        toString.forEach(System.out::println);
        /*
         * list.stream().filter(e->e.startsWith("H")).forEach(t->System.out.println(t));
         * list.stream().filter(e->e.startsWith("H")).sorted().forEach(t->System.out.
         * println(t));
         * list.stream().filter(e->e.startsWith("H"))
         * .sorted((a,b)->b.compareTo(a))
         * .forEach(t->System.out.println(t));
         * 
         * list.stream().filter(e->e.startsWith("H"))
         * .map(String::toUpperCase).sorted().forEach(s->System.out.println(s));
         */

        /*
         * Boolean findAny= list.stream().anyMatch(s->s.startsWith("A"));
         * Boolean allMatch=list.stream().allMatch(s->s.startsWith("H"));
         * Boolean noneMatch=list.stream().noneMatch(s->s.startsWith("H"));
         * long countOfLetter=list.stream().filter(s->s.startsWith("H")).count();
         * System.out.println(findAny);
         * System.out.println(allMatch);
         * System.out.println(noneMatch);
         * System.out.println(countOfLetter);
         */
    }

}

class MySum {
    static int sum(int a, int b) {
        return a + b;
    }
}

@FunctionalInterface
interface InnerSample {

    public int myMethod(int a, int b);

}

@FunctionalInterface

interface StringToInt<A, B> {

    A convertStrToInt(B str);
}