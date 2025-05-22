package Java8;

public class Testing {

    int x;
    int y;

    public Testing() {
        System.out.println("zero parameter constructor");
    }

    public Testing(int x, int y) {
        System.out.println("two parameter constructor" + x + " " + y);
        this.x = x;
        this.y = y;
    }

    public static void main(String[] args) {

        Testing testing = new Testing();
        Testing testing2 = new Testing(10, 20);

    }
}
