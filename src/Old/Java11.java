package Old;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Java11 {
    public static void main(String[] args) {

        String str = "Hello ".repeat(3);
        System.out.println(str);

        String string = "";
        boolean blank = string.isBlank();
        System.out.println(blank);

        String s2 = "\n Hello \n";
        String strip = s2.strip();
        System.out.println(strip);

        String string2 = "Hello\nWorld";

        string2.lines().forEach(System.out::println);

        var list = new ArrayList<String>();
        list.add("Hello");
        list.add("World");

        list.stream().map(String::toUpperCase).forEach(System.out::println);

        List<String> cList = List.of("Apple", "Banana");
        cList.stream().forEach(System.out::println);

    }
}
