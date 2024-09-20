public class CheckEnding {

    public static boolean checkEnding(String a, String b) {

        if (b.length() > 2) {
            return a.substring(a.length() - 2).equals(b.substring(b.length() - 2));
        }
        return a.substring(a.length() - 2).equals(b);
    }

    public static void main(String[] args) {

        System.out.println(checkEnding("convention", "tio"));
    }
}
