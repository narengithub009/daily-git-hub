package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostRepeatedElementInAnArray {

    public static void main(String[] args) {

        List<String> listOfStrings = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Pen", "Note Book",
                "Pencil");
        Map<String, Long> listOfMapEle = listOfStrings.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        Entry<String, Long> entry = listOfMapEle.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue()).get();
        System.out.println(entry.getKey() + " " + entry.getValue());
    }
}
