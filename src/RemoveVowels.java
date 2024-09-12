public class RemoveVowels {

    public static String removeVowels(String str) {

        return str.replaceAll("[AEIOUaeiou]", "");
    }

    public static void main(String[] args) {

        String removeVowels = RemoveVowels.removeVowels("HelloHowareyou");
        System.out.println(removeVowels);

    }
}
