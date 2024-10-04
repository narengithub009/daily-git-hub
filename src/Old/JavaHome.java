package Old;

public class JavaHome {
    public static void main(String[] args) {

        String message = "JAVA_HOME".transform(System.getenv()::get);
        System.out.println(message);
    }
}
