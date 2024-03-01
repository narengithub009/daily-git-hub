import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    private static List<Integer> asList;
    private static List<Integer> collect;
    private static List<String> asList2;

    public static void main(String[] args) {
        asList = Arrays.asList(1, 2, 3, 3, 42, 44, 22, 22, 4, 4, 5);
        collect = asList.stream().distinct().collect(Collectors.toList());
        asList.stream().filter(s -> s % 2 == 0).distinct().forEach(System.out::println);
        System.out.println(collect);

        asList2 = Arrays.asList("One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight");
        String string = asList2.stream()
                .skip(asList2.size() - 1)
                .findFirst()
                .get();

        System.out.println(string);

        List<String> list = new ArrayList<>();
        list.add("Narender");
        list.add("Anny");
        list.add("Neeraja");
        list.add("Narender");

        list.stream().filter(s -> s.startsWith("N")).forEach(System.out::println);

        CalculatorInterface calculatorInterface = (a, b) -> {
            return a + b;
        };
        System.out.println(calculatorInterface.sum(10, 10));

        Stream<String> of = Stream.of("a", "b");

        of.forEach(System.out::println);
    }
}

class Parent {

    public void print() {
        System.out.println("Parent");
    }

    public void dispaly() {
        print();
    }
}

class Child extends Parent {
    public void print() {
        System.out.println("Child");
    }
}

@FunctionalInterface
public interface CalculatorInterface {

    Integer sum(Integer a, Integer b);
}