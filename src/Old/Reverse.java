public class Reverse {

    public static void main(String[] args) {
        reverse("Hello World");
        reverse("The quick brown fox.");
        reverse("Edabit is really helpful!");
    }

    private static void reverse(String string) {

        for (int i = string.length() - 1; i >= 0; i--) {
            System.out.print(string.charAt(i));

        }
        System.out.println();
    }
}
