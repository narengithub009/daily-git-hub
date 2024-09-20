public class CountWords {

    public static int countWords(String str) {

        String[] split = str.split(" ");

        return split.length;
    }

    public static void main(String[] args) {

        System.out.println(countWords("This is a test"));
    }
}
