package Java;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {

        System.out.println("********JAVA8**********");

        Optional<String> ofNullable = Optional.ofNullable("Narender");
        ofNullable.ifPresent(t -> System.out.println(t));

        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("a", "b"),
                Arrays.asList("c", "d", "e"));
        List<String> flatMapLists = listOfLists.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());
        System.out.println(flatMapLists);
        System.out.println("********STRINGS**********");
        String string = "narender";
        String string2 = new String("Hello");
        System.out.println(string.intern().hashCode() + " " + string);
        String concat = string.concat("konreddy");
        System.out.println(string.intern().hashCode() + " " + string + " " + concat.intern().hashCode());
        StringBuffer stringBuffer = new StringBuffer("Hello String buffer");
        System.out.println(stringBuffer.hashCode() + " " + stringBuffer);
        stringBuffer.append(" From Strings");
        System.out.println(stringBuffer.hashCode() + " " + stringBuffer);

        String str1 = "Hello1";

        String str2 = new String("Hello1");
        String str3 = new String("Hello1");

        byte[] bs = { 71, 101, 101, 107, 115 };
        String byte1 = new String(bs, 2, 3);
        System.out.println(byte1);

        char[] cs = { 'a', 'b', 'c', 'f', 'g' };
        String chars = new String(cs);
        System.out.println(chars);

        stringBuffer.insert(5, " ***Insert***");
        System.out.println(stringBuffer);
        stringBuffer.reverse();
        System.out.println("updated....");
    }
}
