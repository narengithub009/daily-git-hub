package Old;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArraySet1 {
    public static void main(String[] args) {

        String[] strings = { "a", "b", "c" };

        Set<String> set = new HashSet<>(Arrays.asList(strings));
        System.out.println(set);
        System.out.println(strings.toString());
    }
}
