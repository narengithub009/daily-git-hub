package Java8;

public class DeadlockExample extends test {

    private static final Object lock1 = new Object();
    private static final Object lock2 = new Object();

    public static void main(String[] args) {
        DeadlockExample deadlockExample = new DeadlockExample();
        Thread thread = new Thread(() -> {

            synchronized (lock1) {
                System.out.println("Thread1 : locked lock1");
                try {
                    Thread.sleep(100);
                } catch (Exception e) {

                }
                synchronized (lock2) {
                    System.out.println("Thread2 : Locked lock2");
                }
            }
        });

        Thread thread1 = new Thread(() -> {

            synchronized (lock2) {
                System.out.println("Thread1 : locked lock2");
                try {
                    Thread.sleep(100);
                } catch (Exception e) {

                }
                synchronized (lock1) {
                    System.out.println("Thread2 : Locked lock1");
                }
            }
        });

        thread.start();
        thread1.start();
        deadlockExample.absTest();
    }

    @Override
    void absTest() {
        System.out.println("abs test");
    }
}

abstract class test {

    abstract void absTest();

    test() {
        System.out.println("constructor");
    }

    public void add() {
        System.out.println("abstarcrt cllass");
    }
}