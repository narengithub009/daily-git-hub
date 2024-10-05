package Old;

public class ReverseStringEx {

    public static String reverse(String str) {
        if (str.isEmpty()) {
            return str;
        }
        System.out.println(str.substring(1));
        return reverse(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        String input = "HelloHowareyou";
        System.out.println(ReverseStringEx.reverse(input));
    }
}
