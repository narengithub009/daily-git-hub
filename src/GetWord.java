import java.util.function.BiFunction;

public class GetWord {

    public static void main(String[] args) {

        System.out.println(getWord("Hello", "World"));

        BiFunction<String, String, String> biFunction = (str1, str2) -> str1 + str2;
        System.out.println(biFunction.apply("Hello ", "Aswitha"));
    }

    private static String getWord(String string, String string2) {

        return string + string2;
    }

}
