public class Discount {

    public static void main(String[] args) {
        System.out.println(discount(75, 75));

    }

    private static double discount(double price, double dis) {
        double discount1 = (dis * price) / 100;
        return price - discount1;
    }
}
