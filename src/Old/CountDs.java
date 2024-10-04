package Old;

import java.util.stream.IntStream;

public class CountDs {

    public static void main(String[] args) {

        System.out.println(countDs("The rodents hibernated in their den."));
        System.out.println(countDs("The rodents hibernated in their den."));
    }

    public static int countDs(String str) {

        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == 'd' || str.charAt(i) == 'D') {
                count++;
            }
        }

        return count;
    }

    public static long countOfD(String str) {

        return IntStream.range(0, str.length())
                .filter(s -> str.charAt(s) == 'd' || str.charAt(s) == 'D')
                .count();
    }
}
