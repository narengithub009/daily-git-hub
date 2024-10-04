public class ReverseStringExample {

    static String originalStr = "abcdcf";

    public static void main(String[] args) {
        System.out.println("Original String : " + originalStr);
        System.out.println("Reverse String : " + reverseString(originalStr));
    }

    private static String reverseString(String originalStr2) {

        char ch[] = originalStr2.toCharArray();
        char temp;

        for (int i = 0, j = ch.length - 1; i < (ch.length / 2); i++, j--) {
            temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
        }
        return new String(ch);

    }
}
