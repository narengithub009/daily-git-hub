import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StreamsExample_createStream_filter_display {
    public static void main(String[] args) {
        
        List<String> listString=new ArrayList<>();

        listString.add("ank");
        listString.add("sam");
        listString.add("az");
        listString.add("neh");
        listString.add("ad");

        Stream<String> stream=listString.stream();

        System.out.println("1. use stream for filtering and display : ");

        //stream.filter(s->s.startsWith("a")).forEach(System.out::println);

        // stream.filter(s->s.startsWith("a")).sorted().forEach(System.out::println);

        //stream.filter(s->s.startsWith("a")).sorted((a,b)->b.compareTo(a)).forEach(System.out::println);

       // stream.filter(s->s.startsWith("a")).sorted(Comparator.reverseOrder()).forEach(System.out::println);

       stream.filter(s->s.startsWith("a")).map(s->s.toUpperCase()).sorted().forEach(System.out::println);
}
}

