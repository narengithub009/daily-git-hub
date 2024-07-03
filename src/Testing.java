import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Testing {

        int insVar = 12;
        static int satVar = 10;

        public static void main(String[] args) {
                final int x = 1;
                int y = 2;
                List<String> list = Arrays.asList("Java", "Python", "Öracle");
                list.forEach(s -> System.out.println(s));
                Testing testing = new Testing();
                System.out.println("**************************");

                list.stream().filter(s -> s.startsWith("J"))
                                .collect(Collectors.toList()).forEach(System.out::println);

                MathOperation addition = (a, b) -> a + b + testing.insVar + Testing.satVar;
                MathOperation multiplecation = (a, b) -> a * b;

                System.out.println(addition.operation(12, 12) + " " + multiplecation.operation(12, 12));

                List<String> list2 = Arrays.asList("Orange", "Banana", "Apple");

                Collections.sort(list2, (a, b) -> a.compareTo(b));

                System.out.println(list2);

                List<Integer> list3 = Arrays.asList(1, 2, 4, 6, 7, 3);

                list3.stream().filter(n -> n % 2 != 0).forEach(System.out::println);

                System.out.println("*******************");

        }
}

@FunctionalInterface
interface MathOperation {

        int operation(int a, int b);
}
