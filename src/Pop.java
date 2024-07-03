import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Pop {

    public static void main(String[] args) {

        String str = "Hellojavahowareyou";
        Map<String, List<String>> dupVal = Arrays.stream(str.split("")).collect(Collectors.groupingBy(s -> s));
        System.out.println(Arrays.toString(dupVal));

    }
}
