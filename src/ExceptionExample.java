public class ExceptionExample {
    public static void main(String[] args) {

        try {
            throwCheckedException();
        } catch (Exception e) {

            System.out.println("Caught Checked Exception : " + e);
        }

        throwUncheckedException();
    }

    private static void throwUncheckedException() {

        throw new UnsupportedOperationException("Unimplemented method 'throwUncheckedException'");
    }

    private static void throwCheckedException() {

        throw new RuntimeException("Unchecked Exception");
    }
}
