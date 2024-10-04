public class RightAngledTriangle {

    public static boolean isRightAngledTriangle(int x, int y, int z) {

        int a = Math.max(x, Math.max(y, z));
        int b, c;

        if (a == x) {
            b = y;
            c = z;
        } else if (a == y) {
            b = x;
            c = z;
        } else {
            b = x;
            c = y;
        }
        return (a * a == (b * b + c * c));

    }

    public static void main(String[] args) {

        System.out.println(isRightAngledTriangle(3, 4, 5));
        System.out.println(isRightAngledTriangle(70, 130, 110));
    }
}
