package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FreaquencyOfEachElement {
    public static void main(String[] args) {

        List<String> stattionayItems = Arrays.asList("Pen", "Pen", "Eraser", "NoteBook", "Stapler", "Pencil");
        Map<String, Long> listOfItemsCount = stattionayItems.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(listOfItemsCount);
    }
}
