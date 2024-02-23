import java.util.logging.Logger;

public class Pop {
    private static Logger logger = Logger.getLogger(Pop.class.getName());

    public static void main(String[] args) {

        String str = "Hello how are you";
        String result = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            result = result + str.charAt(i);
        }
        logger.info("The reverse string is ");
        System.out.println(result);

    }
}

@FunctionalInterface
public interface InnerPop {

    String msg(String s);
}