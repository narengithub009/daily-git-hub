package Java.ExceptionHandling;

public class AgeIsNegativeException extends Exception {

    private String message;

    public AgeIsNegativeException(String msg) {
        this.message = msg;
    }

    @Override
    public String toString() {
        return message;
    }
}
