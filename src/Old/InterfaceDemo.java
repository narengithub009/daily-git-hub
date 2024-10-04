package Old;

public interface InterfaceDemo {

    default void printName() {
        System.out.println("Welcome to code decode");
    }

    public static void saticMethod() {
        System.out.println("This is static method implemetation...");
    }

}
