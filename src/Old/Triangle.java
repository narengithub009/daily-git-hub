package Old;

public class Triangle {

    public static int triangle(int num) {
        int result = 0;
        for (int i = 0; i <= num; i++) {
            result += i;
        }
        return result;
    }

    public static void main(String[] args) {

        System.out.println(triangle(215));
    }
}
