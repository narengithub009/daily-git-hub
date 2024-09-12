import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RemoveVowels {

    public static String removeVowels(String str) {

        return str.replaceAll("[AEIOUaeiou]", "");
    }

    public static void main(String[] args) {

        String removeVowels = RemoveVowels.removeVowels("HelloHowareyou");
        System.out.println(removeVowels);

        List<String> names = Arrays.asList("Narender", "Anny", "Neeraja", "Aswitha");

        Collections.sort(names, (a, b) -> a.compareTo(b));

        names.forEach(System.out::println);

    }
}
