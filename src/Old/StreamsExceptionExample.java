import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamsExceptionExample  {
    
    public static void main(String[] args) {
        
        List<Integer> list=new ArrayList<>();
        list.add(12);
        list.add(23);
        Stream<Integer> stream=list.stream();
        stream.forEach(s->System.out.println(s));

        stream=list.stream();

        stream.forEach(s->System.out.println(s));
    }
}
