package Old;

import java.util.ArrayList;
import java.util.List;

public class ConverttheJavaListintoArray {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("How");
        System.out.println(list);
        String atr[] = new String[list.size()];

        list.toArray(atr);
        for (String string : atr) {
            System.out.println(string);

        }
    }
}
