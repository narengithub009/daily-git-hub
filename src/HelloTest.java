import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class HelloTest {
    public static void main(String[] args) {

        String str = "Hellojavahowareyou";
        Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(Arrays.toString(dulVal));
    }
}
