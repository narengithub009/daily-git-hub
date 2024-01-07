import java.util.ArrayList;
import java.util.List;

public class StreamsExample2_infiniteSequentialStream {
    public static void main(String[] args) {
        
        List<String> listStrings=new ArrayList<>();

        listStrings.add("a");
        listStrings.add("b");
        listStrings.add("n");

        System.out.println("Use streams for finding distinct element and display :");

        listStrings.stream().distinct().forEach(System.out::println);

}
}
