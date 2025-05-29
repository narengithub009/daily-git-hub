package Java;

public class TestingAI extends AbstractClass implements InnerTestingAI {
    private int x = 10;
    private static int y = 20;

    public void test() {
        int x = 10;
        System.out.println("TestingAI test method");
    }

    @Override
    public void display() {
        System.out.println("Display method implemented in TestingAI");
    }

    public static void main(String[] args) {
        TestingAI obj = new TestingAI();
        AbstractClass abs = new TestingAI();
        // obj.test();
        obj.display();
        abs.display();
    }

    @Override
    public void test1() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'test1'");
    }
}

abstract class AbstractClass {
    public abstract void display();
}

interface InnerTestingAI {
    void test1();

    default void display() {
        System.out.println("Default display method in InnerTestingAI");
    }

}
