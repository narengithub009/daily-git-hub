public class LengthOfString {

    private static String str = "1000";

    public static void main(String[] args) {

        System.out.println(lengthOfString("hello"));
        System.out.println(String.valueOf(str));
    }

    private static int lengthOfString(String string) {

        if (string.equals("")) {
            return 0;
        }
        return 1 + lengthOfString(string.substring(1));
    }

}
