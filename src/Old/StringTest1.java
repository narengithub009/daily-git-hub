public class StringTest1 {
    public static void main(String[] args) {
        String s = "Hello";
        String s1 = new String("Hello");
        s1 = s1.intern();

        System.out.println(s == s1);
    }
}
