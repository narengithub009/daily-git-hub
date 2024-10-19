package Java;

public class Reverse {

    public static void main(String[] args) {

        String str = "Narender";

        char[] ch = str.toCharArray();
        char[] result = new char[ch.length];
        for (int i = ch.length - 1, j = 0; i >= 0; i--, j++) {
            result[j] = ch[i];
        }
        String finalrevString = new String(result);
        System.out.println(finalrevString);
    }
}
