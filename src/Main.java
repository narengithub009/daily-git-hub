import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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
