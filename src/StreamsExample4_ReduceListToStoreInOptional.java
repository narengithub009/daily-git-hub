import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamsExample4_ReduceListToStoreInOptional {
    public static void main(String[] args) {
        
        List<String> listString=new ArrayList<>();
        listString.add("a");
        listString.add("b");
        listString.add("c");

        Stream<String> stream=listString.stream();

        Optional<String> optional= stream.sorted().reduce((s1,s2)->s1+" "+s2);

        System.out.println(optional.isPresent());
        System.out.println(optional.get());
    }
}
