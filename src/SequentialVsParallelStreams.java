import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class SequentialVsParallelStreams {
    public static void main(String[] args) {

        long startNanoTime = 0;
        long endNanoTime = 0;

        int maxvalue = 9992999;

        List<Integer> integers = new ArrayList<>();

        for (int i = 0; i < maxvalue; i++) {
            integers.add(i);
        }

        System.out.println("Normal streammm");

        startNanoTime = System.nanoTime();

        Stream<Integer> NormalStreamm = integers.stream();

        endNanoTime = System.nanoTime();

        System.out.println(endNanoTime - startNanoTime + " nano seconds");

        startNanoTime = System.nanoTime();

        Stream<Integer> parallelStream = integers.parallelStream();

        endNanoTime = System.nanoTime();

        System.out.println(endNanoTime - startNanoTime + "parallelStream");

        List<Integer> list = Arrays.asList(1, 2, 3);

        Stream<Integer> intger = list.stream();
        intger.forEach(System.out::println);

    }
}
