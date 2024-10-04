import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamsExample3_ShortCircuitingOperations {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("a");

        Stream<String> stream=list.stream();
        stream.distinct().forEach(System.out::println);
        //stream.forEach(System.out::println);
    }
}
