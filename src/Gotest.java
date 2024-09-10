public class Gotest {
    public static void main(String[] args) {

        Runnable runnable = new Runnable() {

            @Override
            public void run() {
                System.out.println("This traditional way of writing anonimous inner class...");
            }

        };
        runnable.run();
    }
}
