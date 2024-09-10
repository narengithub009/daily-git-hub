import java.util.Arrays;
import java.util.List;

public class Test {
        public static void main(String[] args) {
                List<String> asList = Arrays.asList("Narender", "Neeraja", "Aswitha");
                boolean anyMatch = asList.stream().allMatch(s -> s.startsWith("n"));
                System.out.println(anyMatch);
        }
}