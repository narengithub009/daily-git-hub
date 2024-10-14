package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TrendingItems {

    public static List<String> findTopTrendingItems(List<String> items, int i) {

        Map<String, Long> itemCount = items.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        return itemCount.entrySet()
                .stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .limit(i)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> items = Arrays.asList("item1", "item2", "item3", "item3", "item1", "item2", "item1", "item4",
                "item5", "item4", "item2");
        List<String> topTrendingItems = findTopTrendingItems(items, 3);
        System.out.println(topTrendingItems);
    }
}
