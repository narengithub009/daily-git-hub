package Old;

public class Match {

    public static void main(String[] args) {

        System.out.println(match("mask", "mask"));
    }

    private static boolean match(String string, String string2) {

        return string.equalsIgnoreCase(string2);
    }
}
