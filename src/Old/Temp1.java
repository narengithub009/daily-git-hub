package Old;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Temp1 {

    static String balacedStr = "{(ss[ss])}";

    public static void verifyString(String unBalacedStr) {

        String[] split = balacedStr.split("");
        String[] split2 = unBalacedStr.split("");

        for (int i = 0; i < split.length; i++) {
            if (!split[i].equals(split2[i])) {
                System.out.println("The given string not matching");
            } else {
                System.out.println("given string is matching");
            }
        }

    }

    public static void main(String[] args) {
        // Temp1.verifyString("{(ss[ss]");

        List<Integer> list = Arrays.asList(2, 3, 4, 4, 5, 7, 8);
        Optional<Integer> first = list.stream().sorted(reverseOrder())
                .skip(1)
                .findFirst();
        System.out.println(first);
    }

    private static Comparator<? super Integer> reverseOrder() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'reverseOrder'");
    }
}
