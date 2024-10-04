package Old;

public class CanCapture {

    public static void main(String[] args) {

        System.out.println(canCapture("F5", "C8"));
        System.out.println(canCapture2("F5", "C8"));
    }

    private static boolean canCapture2(String string, String string2) {

        return string.charAt(0) == string2.charAt(0) || string.charAt(1) == string2.charAt(1);
    }

    private static boolean canCapture(String string, String string2) {

        if (string.substring(0, 1).equals(string2.substring(0, 1))) {
            return true;
        } else if (string.substring(1, 2).equals(string2.substring(1, 2))) {
            return true;
        } else {
            return false;
        }

    }
}
